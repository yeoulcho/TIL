# 2022.12.08
프로그래머스 > 코딩테스트 입문 > [숫자 찾기](https://school.programmers.co.kr/learn/courses/30/lessons/120904)

## <div align=center> 내가 생각한 풀이과정 </div>
1. int를 String으로 바꾸자
2. String을 배열에 담자
3. 배열에서 숫자와 동일한 값의 위치를 찾자
## <div align=center> 다른 풀이 </div>
1. int를 String으로 바꾸자
2. 특정 문자의 위치를 찾자
<br>

       포인트는 index의 +1을 해주기 위해 숫자 앞에 한가지 추가하기
        ("?"+num).indexOf(String.valueOf(k))

# <div align=center> Check Point! </div>
### 1. int형을 String으로 변환하기 
    ex) int num -> String num    
        String.valueOf(num) 
### 2. 특정 문자 위치 찾기
    ex) String abc = "abc"
        abc.indexOf("a") 
        -> abc의 a와 같은 index값을 알려줘 ->0으로 결과 나옴