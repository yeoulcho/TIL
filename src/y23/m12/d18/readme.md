# 2022.12.18
프로그래머스 > 코딩테스트 입문 > [한번만 등장한 문자](https://school.programmers.co.kr/learn/courses/30/lessons/120896)

## <div align=center> 내가 생각한 풀이과정 </div>
1. string을 한글자씩 나눠서 배열 넣고
2. 오름차순으로 정렬
3. 이중 포문을 돌리면서 똑같은 문자가 나오면 다시 1로 치환? 비교가 쉽지 않음 그럼 임시의 문자를 만들어볼까 했으나 그것도 실패

## <div align=center> 다른 풀이 </div>
1. string을 하나의 문자씩 나눠서 배열에 넣기
2. 오름차순으로 정렬
3. 이중포문을 돌면서 같은 문자가 나오면 count ++
4. count가 1인 것만 answer에 합치기

## <div align=center> 오늘의 느낀점 </div>
이중포문 이해가 된줄 알았는데 아직.......<br>
aaaaaaaaaabbbccccdddddd이런식으로 생기는 바보짓도 함<br>
count라는 쉬운 방법이 있었는데...다음번에는 생각해내길<br>




    