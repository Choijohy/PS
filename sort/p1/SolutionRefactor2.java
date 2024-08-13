package sort.p1;

import java.io.*;

public class SolutionRefactor2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int range = 2000001;

        int n = Integer.parseInt(br.readLine());
        boolean[] nums = new boolean[range];

        for (int i=0;i<n;i++){
            nums[Integer.parseInt(br.readLine()) + 1000000] = true;
        }

        for (int j=0;j<range;j++){
            if (nums[j]) sb.append(j-1000000).append("\n");
        }
        System.out.println(sb);

    }
}
