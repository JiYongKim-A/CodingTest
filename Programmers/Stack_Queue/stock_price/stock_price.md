<div align="center">
<img src="https://user-images.githubusercontent.com/81874493/223007046-76b81071-e47a-433a-930d-c8cb8ee2c672.png" width = "30%" height="30%">

# 프로그래머스 주식 가격 문제
[프로그래머스 주식 가격 URL](https://school.programmers.co.kr/learn/courses/30/lessons/42584)


</div>



## 문제 설명
초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.

---

## 제한사항
* prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
* prices의 길이는 2 이상 100,000 이하입니다.

---
## 입출력 예

|prices|return|
|---|---|
|[1, 2, 3, 2, 3]|[4, 3, 1, 1, 0]|


---
## 문제 회고

* 문제 해석
    * prices배열 요소별로 자기 숫자보다 이후 배열 요소에서 떨어질때까지의 거리를 구하라
        
        => 배열 요소를 하나씩 꺼낼때 꺼낸 숫자가 기준이 된다
            
    
* 풀이 방법
    1. 투 포인터 방식을 사용하여 p1과 p2가 배열을 순환하며 
         
         => p1요소가 p2 보다 작을 경우 p1과 p2사이 거리를 반환한다. 

