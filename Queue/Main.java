import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        // 큐 선언
        Queue<Integer> myQueue = new LinkedList<>();
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int last = -1;
        // 명령 처리
        for (int i=0;i<num;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            // push X: 정수 X를 큐에 넣는 연산이다.
            if (command.equals("push")){
                last = Integer.parseInt(st.nextToken());
                myQueue.add(last);
            }
            //pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
            else if (command.equals("pop")){
                if (myQueue.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(myQueue.remove());
                }
            }
            //size: 큐에 들어있는 정수의 개수를 출력한다.
            if (command.equals("size")){
                System.out.println(myQueue.size());
            }
            //empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
            if (command.equals("empty")){
                if (myQueue.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }
            //front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
            if (command.equals("front")){
                if (myQueue.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(myQueue.peek());
                }
            }
            //back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
            if (command.equals("back")){
                if (myQueue.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(last);
                }
            }
        }

    }
}