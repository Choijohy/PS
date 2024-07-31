import java.util.*;
import java.io.*;

public class MainRefactor{
    public static void main(String[] args) throws IOException{
        // 큐 선언
        Queue<Integer> myQueue = new LinkedList<>();
        // 입출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());

        int last = -1;
        int result = 0;
        // 명령 처리
        for (int i=0;i<num;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("push")){
                last = Integer.parseInt(st.nextToken());
                myQueue.add(last);
            }
            else{
                if (command.equals("pop")){
                    if (myQueue.isEmpty()){
                        sb.append(-1).append("\n");
                    }else{
                        sb.append(myQueue.remove()).append("\n");
                    }
                }

                if (command.equals("size")){
                    sb.append(myQueue.size()).append("\n");
                }

                if (command.equals("empty")){
                    if (myQueue.isEmpty()){
                        sb.append(1).append("\n");
                    }else{
                        sb.append(0).append("\n");
                    }
                }
                if (command.equals("front")){
                    if (myQueue.isEmpty()){
                        sb.append(-1).append("\n");
                    }else{
                        sb.append(myQueue.peek()).append("\n");
                    }
                }
                if (command.equals("back")){
                    if (myQueue.isEmpty()){
                        sb.append(-1).append("\n");
                    }else{
                       sb.append(last).append("\n");
                    }
                }
            }
        }
        System.out.println(sb);
        br.close();
    }
}