package programmers.가장_많이_받은_선물;
import java.util.*;

class SolutionRefactor {
    // 테스트 코드
    public static void main(String[] args) {
        String[] friends1 = new String[]{"muzi", "ryan", "frodo", "neo"};
        String[] gifts1 = new String[]{"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        int answer1 = 2;
        int result1 = new SolutionRefactor().solution(friends1, gifts1);
        PRINT_RESULT(1, result1, answer1);

        String[] friends2 = new String[]{"joy", "brad", "alessandro", "conan", "david"};
        String[] gifts2 = new String[]{"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"};
        int answer2 = 4;
        int result2 = new SolutionRefactor().solution(friends2, gifts2);
        PRINT_RESULT(2, result2, answer2);

        String[] friends3 = new String[]{"a", "b", "c"};
        String[] gifts3 = new String[]{"a b", "b a", "c a", "a c", "a c", "c a"};
        int answer3 = 0;
        int result3 = new SolutionRefactor().solution(friends3, gifts3);
        PRINT_RESULT(3, result3, answer3);
    }

    public static void PRINT_RESULT(int index, int result, int answer) {
        boolean correct = result == answer;
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(result).append("\n");
        sb.append("\t- 기댓값: \t").append(answer).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    // 답안
    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;

        Hashtable<String, Integer> indexMap = new Hashtable<>(); // IndexMap: 사람별 인덱스 부여(record, giftScore에서 활용)
        int[][] record = new int[n][n]; // record: 서로 주고받은 선물 기록를 저장
        int[] giftScore = new int[n]; // giftScore: 선물 지수 저장

        for (int i = 0; i < n; i++) {
            indexMap.put(friends[i], i);
        }

        for (String gift : gifts) {
            String[] people = gift.split(" ");
            String sender = people[0];
            String receiver = people[1];

            int senderIdx = indexMap.get(sender);
            int receiverIdx = indexMap.get(receiver);

            // 선물 지수 계산
            giftScore[senderIdx]++;
            giftScore[receiverIdx]--;

            // record 계산
            record[senderIdx][receiverIdx]++;
        }
        int answer = 0;

        // 각자 턴마다 예상 선물 개수 계산
        for (int s = 0; s < n; s++) {
            int cnt = 0; // 예상 선물 개수
            for (int r = 0; r < n; r++) {
                if (s == r) continue; // sender와 receiver가 동일 인물일 경우
                else if (record[s][r] > record[r][s]) cnt++;
                else if (record[s][r] == record[r][s] && giftScore[s] > giftScore[r]) cnt++;
            }
            answer = Math.max(answer, cnt); // max 선물 개수 업데이트
        }
        return answer;
    }
}
