package Hash.폰켓몬;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        int[] nums1 = new int[]{3, 1, 2, 3};
        int answer1 = 2;
        int result1 = new Solution().solution(nums1);
        PRINT_RESULT(1, result1, answer1);

        int[] nums2 = new int[]{3, 3, 3, 2, 2, 4};
        int answer2 = 3;
        int result2 = new Solution().solution(nums2);
        PRINT_RESULT(2, result2, answer2);

        int[] nums3 = new int[]{3, 3, 3, 2, 2, 2};
        int answer3 = 2;
        int result3 = new Solution().solution(nums3);
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

    public int solution(int[] nums) {
        int answer;
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i=0; i<n; i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        int keyCnt = hm.keySet().size();
        if (n/2 <= keyCnt){
            answer = n/2;
        }else{
            answer = keyCnt;
        }
        return answer;
    }
}