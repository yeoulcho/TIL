# 2022.12.22
프로그래머스 > 코딩테스트 입문 > [잘라서 배열로 저장하기](https://school.programmers.co.kr/learn/courses/30/lessons/120913)

## <div align=center> 풀이과정 </div>
1. 저장할 배열의 길이 계산
2. for문 substring()을 활용하여 문자 잘라서 배열에 저장
3. 마지막 문자열은 문자열의 마지막길이까지 잘라넣도록 예외 처리

# <div align=center> Check Point! </div>
### 1. substring()
substring (int beginIndex) : 시작 인덱스부터 끝까지 <br>
substring (int beginIndex, endIndex) : 시작 인덱스부터 끝 인덱스-1까지

    String str = "0123456789";
    str.substring(5); // 56789
    str.substring(1,4); // 123





  

    