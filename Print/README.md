# [PS] 입출력

#### Source
백준 1000, 2558, 10950, 10951

https://www.acmicpc.net/problem/10828
#### Category
입출력

## 📍 문제 요약
1.  여러가지 입출력

## 📍 풀이 접근
1. 입력: Scanner를 사용
2. 출력: System.out.println() 사용

## 📍 풀이 개선
1. 입력: Scanner -> BufferedReader
2. 출력: System.out.println() -> BufferedWriter

## 📍 기타 공부

#### Buffer

- Buffer: 데이터를 다른 프로그램으로 전송할때, 임시적으로 데이터를 쌓아둘 수 있는 **메모리 공간**
- 예를 들어, 키보드로 입력을 받을때, 즉시 전송하지 않고 버퍼에 데이터를 어느정도 쌓아둔 후,
<br> 한번에 전송하면 더욱 빠르고 효율적임.

#### Scanner vs BufferedReader
- Scanner: 
  - 공백(띄어쓰기) 및 개행문자(줄바꿈 문자)를 경계로 값을 인식
  - 1KB(1024 byte) 크기의 버퍼를 사용 <br>
    --> BufferedReader에 비해 많은 양의 입력을 받을때 불리
  - 원하는 타입으로 읽어들일 수 있음(별도 가공 필요 없음)
  - 동기화 지원이 자동으로 되지 않기 때문에, thread unsafe
  - unchecked exception이므로, 별도의 예외처리가 필요 없음
<br><br>
  
- BufferedReader: 
  - 개행문자만들 경계로 값을 인식
  - 8KB(8192 byte) 크기의 버퍼를 사용 --> Scanner에 비해, 많은 양의 입력을 받을때 유리
  - String으로만 읽어들일 수 있음(별도 가공 필요) <br>
     --> StringTokenizer(), split() 등의 함수를 통해 추가 가공
  - 동기화 지원이 되므로 않기 때문에, thread safe
  - checked exception이므로, IOException 처리가 필요

#### System.out.println() vs BufferedWriter

- System.out.println(): 
  - 호출 될 때마다, 즉시 데이터 전송(위에 버퍼에서 언급한, 데이터를 모아놨다가 한번에 전송하는 장점이 없음 = no buffering)

- BufferedWriter: 
  - 다른 곳으로 전송할 데이터를 output buffer에 쌓아두다가(wrtie()), 한번에 전송(flush())
  - BufferedReader와 마찬가지로, IOException 처리가 필요

🤔 (참고) 백준 #10951 문제로 테스트 결과, 출력 데이터가 크지 않으면(ex. int 1개) 오히려 System.out.println()이 메모리 사용도 적고,
속도도 더 빨랐음. 하지만, 출력 데이터가 어느정도 커지면 BufferedWriter가 유리.

 🤔 입력 데이터가 크지 않을때도, BufferedReader가 더 효율적인 이유? <br>
Scanner와 BufferedReader는 내부적으로 모두 버퍼링을 사용. <br>
다만, BufferedReader는 Scanner와 달리 내부적인 파싱 없이, 입력 데이터를 그대로 가져오므로
입력 데이터 크기가 작은 경우에도 더 빠를 수 있음.<br>
PS의 경우, 대용량의 테스트 케이스를 고려하면 BufferedReader가 훨씬 유리.

케이스 1) Scanner + System.out.println()<br>
![img_2.png](img_2.png)
케이스 2) BufferedReader + System.out.println()<br>
![img_3.png](img_3.png)
케이스 3) BufferedReader + BufferedWriter<br>
![img_5.png](img_5.png)



[공식문서]<br>
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/BufferedWriter.html
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/BufferedReader.html
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/System.html#out
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html








