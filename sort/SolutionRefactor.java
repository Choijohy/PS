package sort;

import java.io.*;
import java.util.*;

public class SolutionRefactor {
      public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            int n = Integer.parseInt(br.readLine());
            int[] nums = new int[n];

            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(nums);

            for (int j = 0; j < n; j++) {
                sb.append(nums[j]).append("\n");
            }
            System.out.println(sb);
    }
}
