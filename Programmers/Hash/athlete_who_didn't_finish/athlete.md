<div align="center">
<img src="https://user-images.githubusercontent.com/81874493/219006228-a39cd520-f88b-4bb2-9bff-154a2a8f53cd.jpg" width = "30%" height="30%">

# 프로그래머스 완주하지 못한 선수 문제
[프로그래머스 완주하지 못한 선수 문제 URL](https://school.programmers.co.kr/learn/courses/30/lessons/42576)


</div>



## 문제 설명
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

---
## 제한사항
* 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
* completion의 길이는 participant의 길이보다 1 작습니다.
* 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
* 참가자 중에는 동명이인이 있을 수 있습니다.

---
## 입출력 예

|participant|completion|return|
|----|---|---|
|["leo", "kiki", "eden"]|["eden", "kiki"]|"leo"|
|["marina", "josipa", "nikola", "vinko", "filipa"]|["josipa", "filipa", "marina","nikola" |"vinko"|
|["mislav", "stanko", "mislav", "ana"]|["stanko", "ana", "mislav"]|"mislav"|

---
## 문제 회고

* 문제 해석
    * 틀린 그림 찾기 방식 접근
        * 입력 받은 participant 배열과 completion 배열 내부 요소들 사이 차이점을 반환하라
    
* 풀이 방법
    1. 입력 받은 participants 배열과 completion 배열을 정렬
    2. 각각의 배열의 인덱스 순으로 요소를 비교
        * 배열 내부 요소가 동일하지 않을 시 차이점 반환

          

