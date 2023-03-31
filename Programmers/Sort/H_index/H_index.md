
<div align="center">

<img src="https://user-images.githubusercontent.com/81874493/229053800-8d371365-37dc-4aa8-86f2-bfc9cff874d8.png" width = "30%" height="30%">

# 프로그래머스  H-Index 문제
[프로그래머스 H-Index URL](https://school.programmers.co.kr/learn/courses/30/lessons/42747)



</div>



## 문제 설명
H-Index는 과학자의 생산성과 영향력을 나타내는 지표입니다. 어느 과학자의 H-Index를 나타내는 값인 h를 구하려고 합니다. 위키백과1에 따르면, H-Index는 다음과 같이 구합니다.

어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 이 과학자의 H-Index입니다.

어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때, 이 과학자의 H-Index를 return 하도록 solution 함수를 작성해주세요.



---

## 제한사항
* 과학자가 발표한 논문의 수는 1편 이상 1,000편 이하입니다.
* 논문별 인용 횟수는 0회 이상 10,000회 이하입니다.
---
## 입출력 예

|citations|return|
|---|---|
|[3, 0, 6, 1, 5]|3|


---
## 문제 회고

* 문제 해석
    
    주어진 citations배열의 요소중 
    * h번 이상 인용된 논문이 h편 이상
    * h번 미만 이용된 논문이 h편 이하
    => 조건을 충족하는 H-Index의 최댓값을 반환하라
    
    <br>
            
    
* 풀이 방법
    1. citations 배열 reverseOrder로 정렬
        * 정렬 의미
            * citations[i]번 이상 인용된 논문 = i개
            *  citations[i]번 이하 인용된 논문 = citiations.length - i개
    2. 반복문을 통해 i값 증가 논문의 수를 증가 시키면서 비교 했을 때 인용 횟수가 논문의 수 이상이 되었을 때 H-Index의 최댓값이 된다.
    
        
        
    


