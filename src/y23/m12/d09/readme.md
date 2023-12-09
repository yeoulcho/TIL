# 2022.12.09
프로그래머스 > 코딩테스트 입문 > [369게임](https://school.programmers.co.kr/learn/courses/30/lessons/120891)

## <div align=center> 내가 생각한 풀이과정 </div>
1. int를 String으로 바꾸자
2. for문 String의 길이 만큼 돌리기 
3. char형으로 변환하고 거기서 3,6,9 일치하는지 숫자 카운트
## <div align=center> 다른 풀이 </div>
1. if문 3번 쓰지 말고 or(||) 활용  
   `if(c=='3'||c=='6'||c=='9') answer++`
2. stream 쓰기
<br>

       (int) Arrays.stream(String.valueOf(order).split(""))
       .map(Integer::parseInt)
       .filter(i -> i == 3 || i == 6 || i == 9)
       .count()

3. 나머지로 구하기
<br>

       while (order > 0) {
       if (order % 10 == 3 || order % 10 == 6 || order % 10 == 9) {
       answer++;
       }
       order /= 10;
       }
## <div align=center> 오늘의 느낀점 </div>
오늘은 어제와 비슷하게 생각해서 빠르게 문제를 풀 수 있었다.<br>
새로운 방식으로 문제를 접근하려고도 시도를 해봐야겠다.<br>


# <div align=center> Check Point! </div>
### 1. Stream 활용
    Arrays.stream(...) -> 문자열 배열을 문자열 스트림으로 변환합니다.
    .map(Integer::parseInt) -> Integer.parseInt를 사용하여 스트림의 각 문자열 요소를 정수로 변환합니다.
    .filter(i -> i == 3 || i == 6 || i == 9) -> 3, 6 또는 9와 동일한 요소만 포함하도록 스트림을 필터링합니다.
    .count() -> 필터링된 스트림의 요소 수를 계산합니다.
    (int) -> 결과를 정수로 변환합니다.
### 2. 나머지로 해서 숫자를 한자리씩 나눠 보는 것도 생각해보기
    