import java.util.*;
import java.io.*;

public class MainRefactor{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());

        for (int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(command.equals("push_front")){
                deque.offerFirst(Integer.parseInt(st.nextToken()));
            }
            if (command.equals("push_back")){
                deque.offerLast(Integer.parseInt(st.nextToken()));
            }
            if (command.equals("pop_front")){
                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                } else{
                    sb.append(deque.pollFirst()).append("\n");
                }
            }
            if (command.equals("pop_back")){
                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                } else{
                    sb.append(deque.pollLast()).append("\n");
                }
            }
            if (command.equals("size")){
                sb.append(deque.size()).append("\n");
            }
            if (command.equals("empty")){
                if(deque.isEmpty()){
                    sb.append(1).append("\n");
                }
                else{
                    sb.append(0).append("\n");
                }
            }
            if (command.equals("front")){
                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque.peekFirst()).append("\n");
                }
            }
            if (command.equals("back")) {
                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque.peekLast()).append("\n");
                }
            }
        }
        System.out.println(sb);
        br.close();
    }

}