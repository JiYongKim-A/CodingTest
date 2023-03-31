
<div align="center">

<img src="" width = "30%" height="30%">

# 프로그래머스 K번째 수 문제
[프로그래머스 K번째 수 URL](https://school.programmers.co.kr/learn/courses/30/lessons/42748)



</div>



## 문제 설명
배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면

array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
2에서 나온 배열의 3번째 숫자는 5입니다.
배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.



---

## 제한사항
* array의 길이는 1 이상 100 이하입니다.
* array의 각 원소는 1 이상 100 이하입니다.
* commands의 길이는 1 이상 50 이하입니다.
* commands의 각 원소는 길이가 3입니다.
---
## 입출력 예

|array|commands|return|
|---|---|---|
|[1, 5, 2, 6, 3, 7, 4]|[[2, 5, 3], [4, 4, 1], [1, 7, 3]]|[5, 6, 3]|


---
## 문제 회고

* 문제 해석
    
    주어진 배열 array에서 
    1. 2차원 배열인 commands[i][0] 부터
    2. 2차원 배열인 commands[i][1] 까지
    3. 자르고 오름차순으로 정렬하여
    4. 2차원 배열인 commands[i][2]의 요소를 int 배열에 넣어 반환하라
    
    <br>
            
    
* 풀이 방법
    1. commands 배열의 사이즈와 동일한 answer 배열 선언
    2. 반복문을 통해 commands의 요소 순환
        1. Arrays.copyOfRange() 메소드를 통해 commands[i][0]-1 부터 commands[i][1] 까지 새로운 arr 배열 생성
        2. arr 배열 정렬
        3. 새로운 배열의 arr의 commands[i][2]-1 번 인덱스 값을 answer에 삽입
    3. answer 배열 반환

    
        
        
    


