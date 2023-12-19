# 2022.12.19
프로그래머스 > 코딩테스트 입문 > [컨트롤 제트](https://school.programmers.co.kr/learn/courses/30/lessons/120853)

## <div align=center> 내가 생각한 풀이과정 </div>
1. string을 공백으로 나눠서 배열 넣기
2. for문 돌면서 배열을 뒤에서 부터 확인
3. Z나오면 Z는 0 다음 숫자도 0으로 만들기

## <div align=center> 다른 풀이 </div>
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (String w : s.split(" ")) {
            if (w.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(w));
            }
        }
        for (int i : stack) {
            answer += i;
        }
        return answer;
    }
1. 스택 초기화: Stack<Integer> stack = new Stack<>();는 정수를 저장하기 위한 스택을 생성<br>
2. 문자열 순회: for (String w : s.split(" ")) { ... }는 입력 문자열을 공백으로 나누어 얻은 단어들을 넣기.
3. 현재 단어가 "Z"인 경우, 그 전 문자열 빼냅니다 (stack.pop())
4. 그렇지 않은 경우, 단어를 정수로 변환하여 스택에 넣습니다 (stack.push(Integer.parseInt(w))).
5. 스택의 합 계산: for (int i : stack) { answer += i; }는 스택에 남아 있는 값들의 합을 계산합니다.

## <div align=center> 오늘의 느낀점 </div>
### 오늘의 실수들
공백으로 나눈다 해놓고 ""으로 나눠서 NumberFormatException 발생<br>
for문 조건을 i>0으로 해서 0번째 배열이 계산에 빠지게 됨<br>

1. STACK
        
        Stack<Integer> stackInt = new Stack<>();

        // 값 추가 push()
        stackInt.push(1);
        stackInt.push(2);
        stackInt.push(3);
        // 1, 2, 3 순으로 값 추가

        // 값 제거
        stackInt.pop();
        stackInt.pop();
        stackInt.pop();
        // 3, 2, 1 순으로 값 제거

        // 값 추가 add()
        stackInt.add(1);
        stackInt.add(2);
        stackInt.add(3);
        // 1, 2, 3 순으로 값 추가

        // 값 모두 제거
        stackInt.clear();




    