# 2022.12.11
프로그래머스 > 코딩테스트 입문 > [숨어있는 숫자의 덧셈(2)](https://school.programmers.co.kr/learn/courses/30/lessons/120864)

## <div align=center> 내가 생각한 풀이과정 </div>
1. string을 ""으로 일단 나누고
2. 소문자 대문자를 tochar해서 모두 0으로 바꾸기
3. 다시 string모두 합하고
4. 0으로 잘라서 배열에 넣고
5. for문 돌려서 값들 더하기

#### <div align=center> 문제를 풀던 중 문제 발생 </div>
NumberFormatException은 빈 문자열을 정수로 변환하려고 시도할 때 발생합니다.<br>
이것은 문자열을 분할할 때 연속된 "0" 문자가 있는 경우에 발생할 수 있습니다.

        if (!temp2[i].isEmpty()) {
                try {
                    answer += Integer.parseInt(temp2[i]);
                } catch (NumberFormatException e) {
                    // 예외 처리: 정수로 변환할 수 없는 경우 무시
                }
            }
   

## <div align=center> 다른 풀이 </div>
1. 알파벳이 대소문자를 정규식을 활용하여 모두 공백으로 바꿈
2. 공백으로 다시 분리
3. 분할된 문자열 배열을 int로 변홥하며 합상


    public int solution(String my_string) {
    int answer = 0;
    String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

    for (String s : str) {
        if (!s.equals("")) {
            answer += Integer.valueOf(s);
        }
    }
    return answer;
    }


# <div align=center> Check Point! </div>
### 1. replaceAll 
    일치하는 모든 항목을 바꿔즘

### 2. [a-zA-Z] 또는 [A-Z|a-z]
    대소문자를 나타냄