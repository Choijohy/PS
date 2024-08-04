# [PS] 덱

#### Source
백준 10866

https://www.acmicpc.net/problem/10866
#### Category
덱(Deque)

## 📍 문제 요약
1. 양방향 큐의 한 종류인 덱(Deque) 구현 

2. 절단된 총 쇠막대의 개수 구하기

## 📍 풀이 접근
1. Array를 활용하여, 덱 구현

## 📍 풀이 개선
1. ArrayList를 통한 Deque 클래스를 직접 구현하지 않고, <br> 
자바에서 제공하는 ArrayDeque를 사용한다.<br>
push_front & pop_front 작업에서 O(n)의 시간 복잡도가 필요.<br>
--> ArrayList의 경우, 맨 앞에 요소를 삽입하거나 삭제하면 나머지 요소들에서 이동이 필요하기 때문 <br>
<br> 위의 문제를 해결하기 위해, LinkedList를 통해 구현하는 방식으로 변경하려다가 java에서
이미 제공하고 있는 ArrayDeque 구현체를 사용하기로 결정.<br>
ArrayDeque를 사용하면, push_front & pop_front 작업도 O(1) 시간으로 가능.<br>
ArrayDeque는 원형 배열구조를 사용하여, 배열의 양 끝(front&rear)을 포인터로 관리함.<br>
따라서, push_front & pop_front 작업에서도 포인터 조작만 필요하므로,<br>
O(1)의 시간 복잡도로 최악의 수행 시간을 줄일 수 있다.

백준 제출 결과 아래와 같이 수행 시간 감소<br>
- ArrayList <br>
19108KB, 176ms

- ArrayDeque <br>
19032KB, 168ms

## 📍 레퍼런스
1. https://velog.io/@djawnstj/%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0-Java%EC%9D%98-LinkedList%EC%99%80-ArrayDeque
2. https://tecoble.techcourse.co.kr/post/2021-05-10-stack-vs-deque/




