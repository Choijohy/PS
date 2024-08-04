import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque deque = new Deque();

        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("push_front")){
                deque.pushFront(Integer.parseInt(st.nextToken()));
            }
            if (command.equals("push_back")){
                deque.pushBack(Integer.parseInt(st.nextToken()));
            }
            if (command.equals("pop_front")){
                sb.append(deque.popFront()).append("\n");
            }
            if (command.equals("pop_back")){
                sb.append(deque.popBack()).append("\n");
            }
            if (command.equals("size")){
                sb.append(deque.size()).append("\n");
            }
            if (command.equals("empty")){
                sb.append(deque.empty()).append("\n");
            }
            if (command.equals("front")){
                sb.append(deque.front()).append("\n");
            }
            if (command.equals("back")) {
                sb.append(deque.back()).append("\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
    static class Deque{
        List<Integer> list = new ArrayList<>();

        public void pushFront(int num){
            list.add(0,num);
        }
        public void pushBack(int num){
            list.add(num);
        }

        public int popFront(){
            if (list.isEmpty()){
                return -1;
            } else {
                int num = list.get(0);
                list.remove(0);
                return num;
            }
        }

        public int popBack() {
            if (list.isEmpty()) {
                return -1; // 리스트가 비어 있을 때의 처리 (필요한 경우 다른 예외 처리 가능)
            } else {
                int last_idx = list.size() - 1;
                int num = list.get(last_idx); // Integer 객체를 int로 언박싱
                list.remove(last_idx);
                return num;
            }
        }

        public int size(){
            return list.size();
        }
        public int empty(){
            if (list.isEmpty()){
                return 1;
            } else{
                return 0;
            }
        }
        public int front(){
            if (list.isEmpty()){
                return -1;
            } else {
                return list.get(0);
            }
        }
        public int back(){
            if (list.isEmpty()){
                return -1;
            } else{
                int last_idx = list.size() - 1;
                return list.get(last_idx);
            }
        }
    }
}