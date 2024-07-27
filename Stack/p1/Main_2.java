import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args) throws IOException{
        // 입력 구현
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        // 스택 구현
        Stack<Integer> myStack = new Stack<>();
        String input;
        for (int i=0; i < num; i++){
            input = br.readLine();
            String[] inputs = input.split(" ");

            if (inputs[0].equals("push")){
                myStack.push(Integer.parseInt(inputs[1]));
            }
            if (inputs[0].equals("pop")){
                if (myStack.isEmpty()){
                    bw.write(-1+"\n");
                }else{
                    bw.write(myStack.pop()+"\n");
                }
            }
            if (inputs[0].equals("size")){
                bw.write(myStack.size() + "\n");
            }
            if (inputs[0].equals("empty")){
                if (myStack.isEmpty()){
                    bw.write(1+"\n");
                }else{
                    bw.write(0+"\n");
                }
            }
            if (inputs[0].equals("top")){
                if (myStack.isEmpty()){
                    bw.write(-1+"\n");
                }else{
                    bw.write(myStack.peek()+"\n");
                }
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
