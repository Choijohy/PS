import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        // 입력 구현
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        // 스택 구현
        Stack<Integer> myStack = new Stack<>();

        for (int i=0; i < num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("push")){
                myStack.push(Integer.parseInt(st.nextToken()));
            }
            if (command.equals("pop")){
                if (myStack.isEmpty()){
                    bw.write(-1+"\n");
                }else{
                    bw.write(myStack.pop()+"\n");
                }
            }
            if (command.equals("size")){
                bw.write(myStack.size() + "\n");
            }
            if (command.equals("empty")){
                if (myStack.isEmpty()){
                    bw.write(1+"\n");
                }else{
                    bw.write(0+"\n");
                }
            }
            if (command.equals("top")){
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

