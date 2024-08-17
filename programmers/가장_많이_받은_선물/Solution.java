package programmers.가장_많이_받은_선물;

import java.util.*;

class Solution {
    // 테스트 코드
    public static void main(String[] args) {
        String[] friends1 = new String[]{"muzi", "ryan", "frodo", "neo"};
        String[] gifts1 = new String[]{"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        int answer1 = 2;
        int result1 = new Solution().solution(friends1, gifts1);
        PRINT_RESULT(1, result1, answer1);

        String[] friends2 = new String[]{"joy", "brad", "alessandro", "conan", "david"};
        String[] gifts2 = new String[]{"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"};
        int answer2 = 4;
        int result2 = new Solution().solution(friends2, gifts2);
        PRINT_RESULT(2, result2, answer2);

        String[] friends3 = new String[]{"a", "b", "c"};
        String[] gifts3 = new String[]{"a b", "b a", "c a", "a c", "a c", "c a"};
        int answer3 = 0;
        int result3 = new Solution().solution(friends3, gifts3);
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
        int N = friends.length;

        // table: 서로 주고받은 선물 개수를 저장
        int[][] table = new int[N][N];

        // indexTable: table에 할당된 맵핑 row값을 저장 (key= 이름, value = 지정된 row번호)
        Hashtable<String,Integer> indexTable = new Hashtable<>();
        int idx = 0;
        for (String person: friends){
            indexTable.put(person, idx);
            idx ++;
        }

        // 👿refactor - 불필요한 객체
        // 위의 indexTable 역매핑 테이블 (key= 지정된 row번호, value=이름 ) -> row번호로 이름을 찾을때 활용
        Hashtable<Integer, String> reverseTable = new Hashtable<>();
        for (String key : indexTable.keySet()) {
            reverseTable.put(indexTable.get(key), key);
        }

        // 👿refactor - 해시 테이블 대신 배열 사용 가능
        // 선물지수를 저장 (key= 이름, value = 선물 지수)
        Hashtable<String, Integer> giftScoreTable = new Hashtable<>();
        for (String person: friends){
            giftScoreTable.put(person, 0);
        }

        // 👿refactor - 불필요한 객체
        // 다음달 예정 선물 개수를 저장  (key= 이름, value = 선물 지수)
        Hashtable<String, Integer> expectedGiftTable = new Hashtable<>();
        for (String person: friends){
            expectedGiftTable.put(person, 0);
        }


        for (String gift:gifts){
            String[] people = gift.split(" "); // "muzi frodo" -> ["muzi", "frodo"]
            String sender = people[0];
            String receiver = people[1];

            // table 생성
            int senderIdx = indexTable.get(sender);
            int receiverIdx = indexTable.get(receiver);

            table[senderIdx][receiverIdx] += 1;

            // 선물 지수 계산
            giftScoreTable.put(sender, giftScoreTable.get(sender)+1);
            giftScoreTable.put(receiver, giftScoreTable.get(receiver)-1);
        }

        // table 순회하면서, 2명씩 주고받은 개수 비교
        for (int s=0;s<N;s++){
            for (int r=0;r<N;r++) {
                // sender와 receiver가 동일 인물
                if (s < r) {
                    continue;
                }
                String r_name =  reverseTable.get(r);
                String s_name =  reverseTable.get(s);

                if (table[s][r] > table[r][s]) {
                    expectedGiftTable.put(s_name, expectedGiftTable.get(s_name) + 1);
                } else if (table[s][r] < table[r][s]){
                    expectedGiftTable.put(r_name, expectedGiftTable.get(r_name) + 1);
                } else{
                    if (giftScoreTable.get(r_name) > giftScoreTable.get(s_name)) {
                        expectedGiftTable.put(r_name, expectedGiftTable.get(r_name) + 1);
                    }
                    if (giftScoreTable.get(r_name) < giftScoreTable.get(s_name)) {
                        expectedGiftTable.put(s_name, expectedGiftTable.get(s_name) + 1);}
                }
            }
        }

        // 계산된 예상 선물 개수 중 최댓값 반환
        return Collections.max(expectedGiftTable.values());
    }
}