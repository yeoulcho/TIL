# 2022.12.16
프로그래머스 > 코딩테스트 입문 > [진료순서 정하기](https://school.programmers.co.kr/learn/courses/30/lessons/120835)

## <div align=center> 내가 생각한 풀이과정 </div>
1. emergency랑 똑같은 배열하나 복제
2. 복제한 배열 내림차순으로 정렬
3. 이중 for문 돌면서 emergency랑 복제 배열이 같은지 확인
4. 같으면 답배열에 (배열길이 - 복제 배열 인덱스)
   - ex) 24, 3, 76 => 2, 3, 1을 가져야함! <br>
   정렬을 통해 3(0), 24(1), 76(2)의 인덱스 순<br>
   0 -> 3이 되야함! 그래서 배열길이 - 복제 배열 인덱스해줌
   

## <div align=center> 다른 풀이 </div>
이해하기 중...

    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for(int i = 0; i < answer.length; i++){
            if(answer[i] != 0){
                continue;
            }
            int idx = 1;
            for(int j = 0; j < answer.length; j++){
                if(emergency[i] < emergency[j]){
                    idx++;
                }
            }
            answer[i] = idx;
        }
        return answer;
    }


# <div align=center> Check Point! </div>
### 1. Arrays.sort(배열,Collections.reverseeOrder())
    내림차순 정렬할 때는 Collections.reverseOrder() 함수 사용.
    내림차순은 byte, char, int, long 같은 Primitive Type 배열에는 적용이 불가능.
    Integer, String 같은 Wrapper Class를 사용