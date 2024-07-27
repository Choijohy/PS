import java.util.*;
import java.io.*;

// 백준 10951

// 비교 1: Scanner + System.out.println()
// 메모리: 17856KB , 시간: 224ms
class Main{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       while(scanner.hasNextInt()){
           int a = scanner.nextInt();
           if (scanner.hasNextInt()){
               int b = scanner.nextInt();
               System.out.println(a+b);
           }else{
               break;
           }
       }
       scanner.close();
    }
}

// 비교 2: BufferedReader + System.out.println()
// 메모리: 14296KB , 시간: 136ms
class Main{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while((input = br.readLine()) != null){
            String[] nums = input.split(" ");
            if (nums.length != 2){
                break;
            }
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);

            System.out.println(a+b);
        }
        br.close();
    }
}

// 비교 3: BufferedReader + BufferedWriter
// 메모리: 14652KB , 시간: 152ms
class Main{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;

        while((input = br.readLine()) != null){
            String[] nums = input.split(" ");
            if (nums.length != 2){
                break;
            }
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);

            bw.write((a+b)+"\n");
            bw.flush();
        }
        br.close();
        bw.close();
    }
}

