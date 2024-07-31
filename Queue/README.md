# [PS] 큐

#### Source
백준 10845

https://www.acmicpc.net/problem/10845
#### Category
큐

## 📍 문제 요약
1. 큐 구현
2. 5가지 메소드: push, pop, size, empty, front, back

## 📍 풀이 접근
1. 자바의 Queue 자료구조를 사용(LinkedList)
2. 문제에서 요구하는 추가 정의사항에 맞게, 코드 수정

## 📍 풀이 개선


## 📍 기타 공부

#### 자바 Queue 기본 제공 메서드

[add vs offer]

- add(): 큐의 맨 뒤에 원소를 추가하고, 큐가 꽉찬 경우 IllegalStateException발생
- offer(): 큐의 맨 뒤에 원소를 추가하고, 값 추가 실패시 False를 반환(성공시 True)
<br> (참고)** Queue<Integer> q = new LinkedList<>()를 통해, 큐를 선언할때 가변 크기로 선언되기 때문에 특별히 사이즈 제한이 없다.


[remove vs poll]
- remove(): 맨 앞의 원소를 반환하면서 삭제. 원소가 없을 경우, 예외 발생(예외처리 필요)
- poll(): 맨 앞의 원소를 반환하면서 삭제. 원소가 없을 경우, null 반환

[peek]
- peek(): 큐의 맨 앞의 원소를 반환
<br> (참고) 큐의 맨 앞의 원소에 접근하는 것은 Queue 인터페이스에 정의되어 있는 peek() 사용 가능.<br>
다만, 맨 마지막 원소를 접근하기 위해서는 LinkedList 클래스에서 제공하는 getLast()를 사용해야 함.<br>
그러나, Queue 인터페이스는 getLast() 메서드를 직접 제공하지 않으므로, 이를 사용하려면 LinkedList 타입으로 캐스팅 필요

```
// Queue<Integer> 타입이기 때문에 LinkedList로 캐스팅
Integer lastElement = ((LinkedList<Integer>) q).getLast();
```


## 📍 기타 

#### StringBuilder 
StringBuilder 사용 없이, 출력이 필요할 때마다 매번 System.out.println()을 호출한 결과,
수행시간이 380ms가 나옴.<br>
StringBuilder를 통해, 출력 결과를 미리 완성시켜 놓은 후 System.out.println()을 한번만 호출한 결과
수행시간 208ms까지 감소.





