<div align="center">
<img src="https://user-images.githubusercontent.com/81874493/219573361-b058ad7d-46ae-4ec6-8dcc-a0226422e00d.jpg" width = "30%" height="30%">


# 프로그래머스 베스트 앨범 문제
[프로그래머스 베스트 앨범 문제 URL](https://school.programmers.co.kr/learn/courses/30/lessons/42579)


</div>



## 문제 설명
스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.

1. 속한 노래가 많이 재생된 장르를 먼저 수록합니다.
2. 장르 내에서 많이 재생된 노래를 먼저 수록합니다.
3. 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.

노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때, 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.

---
## 제한사항
* genres[i]는 고유번호가 i인 노래의 장르입니다.
* plays[i]는 고유번호가 i인 노래가 재생된 횟수입니다.
* genres와 plays의 길이는 같으며, 이는 1 이상 10,000 이하입니다.
* 장르 종류는 100개 미만입니다.
* 장르에 속한 곡이 하나라면, 하나의 곡만 선택합니다.
* 모든 장르는 재생된 횟수가 다릅니다.

---
## 입출력 예

|genres|plays|return|
|----|---|---|
|["classic", "pop", "classic", "classic", "pop"]|[500, 600, 150, 800, 2500]|[4, 1, 3, 0]|


---
## 문제 회고

* 문제 해석
    * 장르별 두곡씩 모아 베스트 앨범을 리턴하라
        * 조건
            * 장르별 최대 2곡 수록 가능
            * 장르중에서도 가장 많이 플레이된 장르부터 수록
            * 플리에 수가 동일시 인덱스 번호가 낮을 수록 먼저 수록

* 풀이 방법
    1. 장르 중에서 플레이된 횟수에 순서를 구함
        1. HashMap 이용 (total_plays)
        2. total_plays : 장르명(key) - 플레이 횟수(value) 저장
        3. total_plays의 keySet을 플레이 횟수를 기준으로 정렬
    2. 장르별 인덱스가 몇회 플레이되었는지 저장
        1. HashMap 이용 (index_map)
        2. index_map : 장르명(key) - 인덱스별 플레이 횟수(HashMap : 인덱스 번호(key) - 플레이 횟수(Value))
    3. total_plays의 keySet의 장르 정렬 순서에 맞추어 반복문
        1. 정렬 순서에 맞추어 장르명 key를 통해 index_map 에서 인덱스별 플레이 횟수(HashMap)를 꺼냄
        2. 인덱스별 플레이 횟수(HashMap)의 keySet을 플레이 횟수로 정렬하고 최대 2개만 꺼내어 Result List 넣는다.
    4. 반환 타입에 맞추어 Result List를 변환하여 반환


          

