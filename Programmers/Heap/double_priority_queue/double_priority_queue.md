<div align="center">
<img src="https://user-images.githubusercontent.com/81874493/225308306-5f2e9711-3891-4b72-9d0e-73f617ef4ebc.png" width = "30%" height="30%">

# 프로그래머스 이중우선순위큐 문제
[프로그래머스 이중우선순위큐 URL](https://school.programmers.co.kr/learn/courses/30/lessons/42628)


</div>



## 문제 설명

이중 우선순위 큐는 다음 연산을 할 수 있는 자료구조를 말합니다.

|명령어	|수신 탑(높이)|
|---|---|
|I 숫자|큐에 주어진 숫자를 삽입합니다.|
|D 1|큐에서 최댓값을 삭제합니다.|
|D -1|큐에서 최솟값을 삭제합니다.|

이중 우선순위 큐가 할 연산 operations가 매개변수로 주어질 때, 모든 연산을 처리한 후 큐가 비어있으면 [0,0] 비어있지 않으면 [최댓값, 최솟값]을 return 하도록 solution 함수를 구현해주세요.





---

## 제한사항
* operations는 길이가 1 이상 1,000,000 이하인 문자열 배열입니다.
* operations의 원소는 큐가 수행할 연산을 나타냅니다.
  * 원소는 “명령어 데이터” 형식으로 주어집니다.- 최댓값/최솟값을 삭제하는 연산에서 최댓값/최솟값이 둘 이상인 경우, 하나만 삭제합니다.
* 빈 큐에 데이터를 삭제하라는 연산이 주어질 경우, 해당 연산은 무시합니다.
---
## 입출력 예

|operations|return|
|---|---|
|["I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"]|[0,0]|
|["I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"]|[333,-45]|

---
## 문제 회고

* 문제 해석
    
    주어진 operations 배열의 명령어를 하나씩 처리하여 
    
    => 이중 우선순위 큐에 남아 있는 값이 없을 경우 `[0,0]` 반환
    
    => 이중 우선순위 큐에 남아 있는 값이 존재할 경우 `[최댓값, 최솟값]` 반환

    
    <br>
            
    
* 풀이 방법
    1. 오름차순 우선순위큐(MinQueue)와 내림차순 우선순위큐(MaxQueue) 하나씩 선언
    2. operation 배열 요소의 명령어 처리
      * 명령어가 I 일 경우
        * MaxQueue와 MinQueue에 동일값 삽입
      * 명령어가 D 1 일 경우 (최댓값 삭제)
        * `MinQueue.remove(MaxQueue.poll())`
      * 명령어가 D -1 일 경우 (최솟값 삭제)
        * `MaxQueue.remove(MinQueue.poll())`
    3. 정답 배열 반환
      * 만약 MaxQueue MinQueue 의 값이 존재하지 않을 경우
        * `[0,0]`반환
      * 만약 MaxQueue MinQueue 의 값이 존재할 경우
        * `[MaxQueue.poll(),MinQueue.poll()]` 반환
        
    


