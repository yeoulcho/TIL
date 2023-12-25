# 2023.12.25
프로그래머스 > 코딩테스트 입문 > [영어가 싫어요](https://school.programmers.co.kr/learn/courses/30/lessons/120894)

## <div align=center> 풀이과정 </div>
1. replace()를 활용해서 문자열을 원하는 문자열로 대체
2. Long.parseLong()을 활용해서 Long으로 변환

## <div align=center> 다른 풀이과정 </div>
1. replaceAll()으로도 사용 가능
      
2. 다음과 같이 표현 가능

       public long solution(String numbers) {

            String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

            for (int i = 0; i < numbers_arr.length; i++) {
                numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
            }

            long answer = Long.parseLong(numbers);
            return answer;
        }


# <div align=center> Check Point! </div>
### 1. Long.parseLong(str); 
   string을 Long으로 변환하는 함수

### 2. replace() & replaceAll()
   replace()는 특정 문자열을 새로운 문자열로 대체
   replaceAll()은 정규식에 일치하는 문자열을 전부 다른 문자열로 대체





  

    