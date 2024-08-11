package sort.p2;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[][] myArray = new int[N][2];

        for (int i=0; i<N; i++){
            String[] nums = br.readLine().split(" ");
            myArray[i][0] = Integer.parseInt(nums[0]);
            myArray[i][1] = Integer.parseInt(nums[1]);
        }
        Arrays.sort(myArray, ((a, b) -> {
            if (a[0] != b[0]){
                return a[0] - b[0];
            } else{
                return a[1] - b[1];
            }
        }));
        for (int j=0;j<N;j++){
            sb.append(myArray[j][0]).append(" ").append(myArray[j][1]).append("\n");
        }
        System.out.println(sb);
    }
}
