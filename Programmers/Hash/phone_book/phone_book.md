<div align="center">
<img src="https://user-images.githubusercontent.com/81874493/219280015-242a0410-69a0-48c2-b7f9-2e46e8fce736.jpg" width = "30%" height="30%">


# 프로그래머스 전화번호 목록 문제
[프로그래머스 전화번호 목록 문제 URL](https://school.programmers.co.kr/learn/courses/30/lessons/42577)

</div>



## 문제 설명
전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.

* 구조대 : 119

* 박준영 : 97 674 223

* 지영석 : 11 9552 4421

전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.

---

## 제한사항
* phone_book의 길이는 1 이상 1,000,000 이하입니다.
    * 각 전화번호의 길이는 1 이상 20 이하입니다.
    * 같은 전화번호가 중복해서 들어있지 않습니다.

---
## 입출력 예

|phone_book|result|
|----|---|
|["119", "97674223", "1195524421"]|false|
|["123","456","789"]|true|
|["12","123","1235","567","88"]|false|

---
## 문제 회고

* 문제 해석
    * phone_book 배열 요소 내에 하나의 요소가 또다른 요소의 접두사가 된다면 false 접두사가 되지 않는다면 true를 반환하라
    
        ex)  
            ["119","1195524421"] -> return false <br>
            ["123","456"] -> return true

    
* 풀이 방법
    1. phone_book 배열을 HashSet에 삽입
    2. phone_book 내의 요소를 substring을 통해 잘라가며 HashSet의 contains함수를 통해 존재 여부 확인 <br>
        EX)
        * phone_book = ["119","1195524421]
        * HashSet = {"119","1195524421"}
        * "1195524421" - substring을 통해 잘라서 확인
            * 1 , 11, 119 -> false 반환

