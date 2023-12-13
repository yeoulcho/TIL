# 2022.12.12
프로그래머스 > 코딩테스트 입문 > [팩토리얼](https://school.programmers.co.kr/learn/courses/30/lessons/120848#qna)

## <div align=center> 내가 생각한 풀이과정 </div>
1. sum에 1을 할당하고 for문을 돌려서 sum = sum*i, 조건은 sum < n, i++는 증가
2. n보다 작을동안 i가 증가하게 설계했지만,<br> 
   sum이 n보다 커져도 i가 증가한 상태이기 때문에 증가한 i 빼기 
3. 예외인 1일 때는 answer 초기값이 0이라 1 할당하기

## <div align=center> 다른 풀이 </div>
1. 비슷한 다른 풀이, 좀더 간단한 듯


    public int solution(int n) {
        int fac = 1;
        int i = 0;

        while(true){
            if(fac <= n){
                fac *= i + 1;
                i++;
            }else break;
        }

        return i-1;
    }





    