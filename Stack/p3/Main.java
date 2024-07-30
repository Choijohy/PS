import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        // 총 쇠막대 개수
        int num = 0;

        // 스택 선언
        Stack <Character> myStack = new Stack<>();

        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String pipe = br.readLine();

        for (int i=0; i<pipe.length(); i++){
            // '(' 일 경우: 스택에 push
            char c = pipe.charAt(i);
            if (c == '('){
                myStack.push(c);
            } else if (c==')') { // ')' 일 경우
                if (pipe.charAt(i-1) == ')'){ // 처음부터 ')'가 입력되는 경우는 없다 = i가 0일때 예외처리 필요 없음
                    // 쇠막대 끝
                    myStack.pop();
                    num +=1;
                } else{
                    // 레이저
                    myStack.pop();
                    num += myStack.size();
                }
            }
        }
        System.out.println(num);
    }
}