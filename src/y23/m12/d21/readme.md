# 2022.12.21
프로그래머스 > 코딩테스트 입문 > [소인수분해](https://school.programmers.co.kr/learn/courses/30/lessons/120852)

## <div align=center> 풀이과정 </div>
1. list 배열 생성 
2. for문 돌면서 2부터 n으로 나눠지는지 확인
3. 그때 i의 중복을 제거하기 위해
4. while문을 사용하여 n을 줄여나감
5. 만약 n: 300 i: 2 => n은 300, 150, 75까지 줄여짐
6. 그다음엔 75를 3으로 나누면서 확인

# <div align=center> Check Point! </div>
### 1. int[] answer = temp.stream().mapToInt(i -> i).toArray();
리스트 stream사용하여 array로 바꾸기<br>
아래의 코드를 한줄로 간단하게 표현 가능

    List<Integer> temp = new ArrayList<>();
    int[] answer = new int[temp.size()];
        for(int i =0; i < temp.size(); i++){
            answer[i] = temp.get(i);
        }
        return answer;

- temp.stream(): temp(List)를 스트림으로 변환합니다.
- mapToInt(i -> i): 각 요소를 기본 int로 매핑합니다. 이 경우 변환하는 것이므로 i 그대로 사용합니다.
- toArray(): 스트림의 요소를 배열로 변환합니다.





  

    