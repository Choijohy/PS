# [PS] 해시

#### Source
프로그래머스

https://school.programmers.co.kr/learn/courses/30/lessons/1845
#### Category
해시

## 📍 문제 요약
1. N마리의 여러 종류의 폰켓몬이 주어짐

2. N/2마리의 폰켓몬을 선택해야 할때, 최대 선택 가능 종류 계산

## 📍 풀이 접근
1. 각 종류별로 몇 마리가 존재하는지 hashMap에 저장<br>
2. <br>
   - N/2마리 보다 전체 종류의 개수가 같거나 많으면, N/2마리 모두 다른 종류로 선택 가능 --> N/2마리 반환<br>
   - N/2마리 보다 전체 종류의 개수가 적으면, 최대로 다양하게 골라봤자 전체 종류의 개수를 넘지 못함 --> 주어진 종류의 총 개수 반환<br>

## 📍 풀이 개선

## 📍 기타 공부

### hashMap vs hashTable
HashMap과 HashTable은 둘 다 키-값 쌍을 저장하는 자료구조로, 내부적으로 해시 테이블(Hash Table)을 사용

### 1. 동기화(Synchronization)
- **HashMap**: 동기화 처리 x. 멀티스레드 환경에서 HashMap을 사용할 때는 `Collections.synchronizedMap()` 메서드를 사용하거나, 직접 동기화 필요.<br>
- **HashTable**: 동기화가 처리 o. 멀티스레드 환경에서 안전하게 사용 가능<br>

### 2. 성능(Performance)
- **HashMap**: 동기화가 없기 때문에 일반적으로 HashTable보다 빠름(단일스레드 환경에서 사용 권장 or 동기화 처리)
- **HashTable**: 동기화로 인해 성능이 HashMap보다 느림.

### 3. Null 키와 값
- **HashMap**: 하나의 `null` 키와 여러 개의 `null` 값 허용(null을 키나 값으로 사용하는 경우 유용)
- **HashTable**: null 키와 값 비허용(null 키나 값을 저장하려고 하면 `NullPointerException` 발생)

HashMap은 Java Collections Framework의 일환으로 제공됨.<br>
HashTable은 Java 1.0에서부터 클래스로서, 더 이상 사용이 권장되지 않음(레거시).




