package dataStructure;

import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // N,K 입력 받기
        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int K = Integer.parseInt(inputs[1]);

        // 배열 생성 -> 모든 인덱스에 true 초기화(사람이 모두 차있음)
        boolean[] circle = new boolean[N];
        Arrays.fill(circle, true);

        int current = 0; // 현재 위치
        int skip = 0; // 스킵한 개수
        int size = N; // true로 저장된 위치의 개수 -> 0이면, 모든 사람이 제거된 것.

        sb.append("<");

        while (size !=0){ // 모든 사람이 제거되기 전까지 계속 반복
            if (circle[current]) {
                skip++;
                if (skip == K) { // K번째 사람 순서가 온 경우
                    skip = 0;
                    sb.append(current+1);
                    circle[current] = false;
                    size--;
                    if (size!=0) sb.append(", ");
                }
            }
            if (current == N-1){
                current = 0;
            } else {
                current++;
            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}
