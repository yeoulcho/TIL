# 2022.12.24
프로그래머스 > 코딩테스트 입문 > [문자열 계산하기](https://school.programmers.co.kr/learn/courses/30/lessons/120902)

## <div align=center> 풀이과정 </div>
1. string을 split(" ")을 활용하여 공백으로 나눠 배열에 저장
2. 배열에 +이면 다음 string을 int로 변환하여 숫자를 더하고
3. -이면 다음 string을 int로 변환하여 숫자 빼기
4. 그리고 배열의 첫 숫자 더하기


## <div align=center> 다른 풀이과정 </div>
1. stream 활용
      
       Arrays.stream(my_string.replaceAll("- ", "-").replaceAll("[+] ", "").split(" ")).mapToInt(Integer::parseInt).sum();
- myString.replaceAll("- ", "-"): "- "을 "-"로 대체합니다. ex) "3 - 4" -> "3 -4"
- replaceAll("[+] ", ""): "+ "을 빈 문자열로 대체합니다. ex) "3 + 4" ->"3 4"
- split(" "): 문자열을 공백을 기준으로 부분 문자열로 나눕니다.
- Arrays.stream(...): 문자열 배열을 스트림으로 변환합니다.
- mapToInt(Integer::parseInt): 각 문자열을 정수로 매핑합니다.
- sum(): 스트림의 정수들의 합계를 계산합니다.






  

    