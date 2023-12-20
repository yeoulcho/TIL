# 2022.12.20
프로그래머스 > 코딩테스트 입문 > [이진수 더하기](https://school.programmers.co.kr/learn/courses/30/lessons/120885)

## <div align=center> 풀이과정 </div>
1. Integer.parseInt(string, 몇진수) 활용해 2진수 문자열 생성 
2. 2진수 문자열을 각각 정수로 변환한 뒤 더하기
3. Integer.toBinaryString()로 더한 값을 다시 2진수 문자열로 변환

# <div align=center> Check Point! </div>
### 1. Integer.parseInt(x, y)
    x는 변환하려는 문자열(String), y는 해당 문자열이 어떤 진법(진수)
    해당 진수에 맞춰 Integer형으로 반환하여 줌.
      
### 2. toBinaryString 함수
    이 함수는 어떤 숫자를 2진수 문자열로 바꿔주는 함수입니다. 
    주의할 점은 String!!!!!!이라는 것.
### 3. 10진수를 2진수로 바꾸는 법
    for (int i = n; i > 0; i /= 2) {
    result = String.valueOf(i % 2) + result}


- 이진수의 각 자릿수를 2로 나눈 나머지를 차례대로 나열하면 됩니다.
- i는 n의 값으로 시작합니다.
- 각 반복에서 i는 2로 나누어집니다 (i /= 2).
- 나머지 연산자를 사용하여 나머지를 얻습니다 (i % 2).
- 나머지의 문자열 표현을 얻기 위해 String.valueOf(i % 2)를 사용합니다.
- 나머지의 문자열 표현을 result 문자열의 앞에 추가합니다.
- 루프는 i가 0이 될 때까지 계속됩니다.


  

    