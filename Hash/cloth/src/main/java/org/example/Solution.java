package org.example;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;


class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        // 해시 테이블 생성 (key: 옷 카테고리, value: 카테고리에 해당하는 총 아이템 수량
        Map<String,Integer> clothMap = new HashMap<>();

        for (int i=0; i < clothes.length; i++){
            String clothType = clothes[i][1];
            clothMap.put(clothType, clothMap.getOrDefault(clothType,0)+1);
        }

        // 모든 카테코리에 대해서 수량 +1 (안 입는 경우의 수 추가)
        Iterator<Integer> iter = clothMap.values().iterator();

        while(iter.hasNext()){
            answer *= iter.next() +1;
        }

        return answer -1;
    }
}