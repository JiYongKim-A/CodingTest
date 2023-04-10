<div align="center">
<img src="https://user-images.githubusercontent.com/81874493/230897281-28922876-eab9-4b76-b517-927b2019dc1d.png" width = "30%" height="30%">

# 프로그래머스 카펫 문제
[프로그래머스 카펫 URL](https://school.programmers.co.kr/learn/courses/30/lessons/42842)




</div>



## 문제 설명
Leo는 카펫을 사러 갔다가 아래 그림과 같이 중앙에는 노란색으로 칠해져 있고 테두리 1줄은 갈색으로 칠해져 있는 격자 모양 카펫을 봤습니다.
(이미지 1)
Leo는 집으로 돌아와서 아까 본 카펫의 노란색과 갈색으로 색칠된 격자의 개수는 기억했지만, 전체 카펫의 크기는 기억하지 못했습니다.

Leo가 본 카펫에서 갈색 격자의 수 brown, 노란색 격자의 수 yellow가 매개변수로 주어질 때 카펫의 가로, 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.

---

## 제한사항
* 갈색 격자의 수 brown은 8 이상 5,000 이하인 자연수입니다.
* 노란색 격자의 수 yellow는 1 이상 2,000,000 이하인 자연수입니다.
* 카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.

---
## 입출력 예

|brown|yellow|return|
|---|---|---|
|10|	2|	[4, 3]|
|8|	1|	[3, 3]|
|24|	24|	[8, 6]|


---
## 문제 회고

* 문제 해석
    
    주어진 brown과 yellow 블럭을 통해 만들 수 있는 직사각형의 가로와 세로를 각각 배열에 담아 반환하라
    * yellow 블럭 테두리는 brown 블럭으로 감싸고 있다.
    * yellow 블럭은 직사각형 형태로 모여 있다.
    * 카펫의 가로 길이가 세로 길이보다 길다.
    
    

    <br>

* 풀이 방법
    
    1. yellow 블럭도 결국 가로 * 세로 (ㅁ * ㅁ) 형태로 구성되기 때문에 yellow의 약수들을 구해 리스트에 저장한다.
    2. 약수들을 저장한 리스트를 순환하며 
       * (약수 , yellow를 약수로 나눈 몫) 중 
         * max값을 width에 저장
         * min값을 height에 저장

            => width와 height는 yellow 블럭의 가로 세로의 길이

    3. [`width * 2 + height * 2 + 4 = brown 테두리의 개수`]가 파라미터로 주어진 brown 블럭 수와 동일하면 
        * [`width+2, height+2`] 반환
          * width+2 = 전체 블럭의 가로 길이 (yellow 가로 길이 + brown 가로 길이)
          * height+2 = 전체 블럭의 세로 길이 (yellow 세로 길이 + brown 세로 길이)
        
        
    


