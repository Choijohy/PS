package sort.p3;

import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arrayA = new int[N];
        int[] arrayB = new int[N];

        for (int i=0;i<2;i++){
            String[] nums = br.readLine().split(" ");
            for (int j=0;j<N;j++){
                if (i==0) arrayA[j] = Integer.parseInt(nums[j]);
                else arrayB[j] = Integer.parseInt(nums[j]);
            }
        }

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        int s = 0;
        for (int k=0;k<N;k++){
            s += arrayA[k] * arrayB[N-k-1];
        }
        System.out.println(s);

    }
}
