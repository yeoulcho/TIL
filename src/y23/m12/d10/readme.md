# 2022.12.10
프로그래머스 > 코딩테스트 입문 > [문자열 정렬하기(2)](https://school.programmers.co.kr/learn/courses/30/lessons/120911)

## <div align=center> 내가 생각한 풀이과정 </div>
1. 우선 소문자 변환부터 하기 위해 string을 한글자씩 분리
2. char 변환
3. 아스키코드 90이하면 대문자
4. 비교해서 배열 정렬
5. char 배열들 스트링으로 합치기

## <div align=center> 다른 풀이 </div>
1. 소문자로 바꿔서 배열만들기 toLowerCase().toCharArray()  
      
       char[] tmp = my_string.toLowerCase().toCharArray(); 
2. 오름차순으로 정렬
      
       Arrays.sort(tmp)
3. 배열 String으로 바꾸기 new String()

       char[] charArray = {'H', 'e', 'l', 'l', 'o'};
       String str = new String(charArray);
       System.out.println(str); // Output: Hello

<br>

      public String solution(String my_string) {
        char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        return new String(c);
      }

## <div align=center> 오늘의 느낀점 </div>
Arrays.sort를 사용하지 않고 for문을 두번 돌려서 일일이 비교하기로 풀다가 헷갈린 점<br>
       
      for(int j =0; j<tmp.length-1; j++){
            for(int i =0; i<tmp.length-1; i++){
                if(tmp[i] > tmp[i+1]){
                    char tmp2 = tmp[i];
                    tmp[i] = tmp[i+1];
                    tmp[i+1] = tmp2;
                }
            }
        }
1. 길이를 tmp.length가 아니라 tmp.length-1 해야한다는 것
   i+1 하기 때문에 -1을 해줘야 배열의 범위를 벗어나지 않는다.
2. 비교할 때 앞의 숫자가 큰경우, 둘의 위치를 바꿔줄 때 문제 발생

       tmp[i] = tmp[i+1]
       tmp[i+1] = tmp[i]
   둘이 바뀌는게 아니라 tmp[i], tmp [i+1] 모두 tmp[i+1]의 값이 된다.



# <div align=center> Check Point! </div>
### 1. new String() vs String = ""
     new String 연산자로 생성된 객체(Heap 메모리 영역에 저장), 그리고 리터럴로 생성된 객체(String Pool에 저장)
### 2. toLowerCase() 소문자로 바꾸기, toUpperCase() 대문자로 바꾸기
### 3. toCharArray() 배열 바꾸기 
### 4. arrays.sort() 오름 차순 정렬하기
### 5. new String() 배열을 String으로 변환
    