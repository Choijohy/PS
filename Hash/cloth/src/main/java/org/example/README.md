# [PS] 의상

#### Source
프로그래머스
https://school.programmers.co.kr/learn/courses/30/lessons/42578?language=java

#### Category
해시

## 📍 문제 요약
1. 여러개의 (아이템 + 해당하는 옷 카테고리) 정보가 주어진다 -- input
2. 특정 조건을 만족하는 아이템 조합 경우의 수를 계산
    <br> a. 각 카테고리별 아이템은 최대 1개만 가능
    <br> b. 꼭 모든 카테고리의 아이템을 착용해야하는 것은 아님
    <br> c. 아예 아무것도 착용하지 않는 것은 안됨.
3. 조건에 맞는 아이템의 조합 경우의 수를 반환한다 -- output

## 📍 풀이 접근
1. input 정보를 토대로, 각 카테고리별 아이템의 개수를 맵핑(hashMap)
2. 모든 카테고리별로 순회하면서, 가능한 조합을 모두 계산 

## 📍 풀이 개선
모든 카테고리별로 순회하면서, 가능한 조합을 모두 계산하려는 접근은 비효율적 ☠️
<br> --> 고려해야할 경우의 수가 너무 많음
<br> --> 이런 경우에는 반대로 생각하기 😊
<br> --> 전체 경우에 수에서, 제외시킬 경우의 수를 뺀다. 😊
<br> = 각 카테고리별 아이템 개수 + 1(안 입는 경우)를 모두 곱한뒤 -- 전체 경우의 수
<br> 1(아무것도 입지 않는 경우의수)을 빼준다. 


## 📍 기타 공부

#### Map vs HashMap
- Map: 키(key)와 값(value) 쌍을 저장하는 객체를 위한 **인터페이스**<br>
- HashMap:  Map 인터페이스를 **구현한 클래스**<br><br>
즉, Map으로는 인스턴스 생성이 불가능하므로, HashMap을 통해 인스턴스를 생성<br>
** 해시맵은 데이터 저장에 있어, 순서 및 정렬의 개념이 없다

#### Iterator
컬렉션의 내부 요소들을 순차적으로 접근(순회)하는 데 사용되는 인터페이스<br>
주요 기능 3가지<br>
- hasNext()<br>
다음 요소가 있는지 boolean값을 반환
- next()<br>
  다음 요소 자체를 반환<br>
  ** 첫 요소를 반환할때도, next() 호출이 필요함
- remove()<br>
    next() 메서드로 반환된 마지막 요소를 컬렉션에서 제거







