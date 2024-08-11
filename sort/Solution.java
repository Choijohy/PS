package sort;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> nums = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i=0;i<n;i++){
            nums.add(Integer.parseInt(br.readLine()));
        }
        nums.sort(Comparator.naturalOrder());

       for(Integer j:nums){
           sb.append(j).append("\n");
       }
        System.out.println(sb);
    }
}