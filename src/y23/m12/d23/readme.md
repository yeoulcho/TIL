# 2022.12.23
프로그래머스 > 코딩테스트 입문 > [공 던지기](https://school.programmers.co.kr/learn/courses/30/lessons/120843#qna)

## <div align=center> 풀이과정 </div>
1. 규칙을 진짜 못찾겠다....
2. k가 배열의 길이보다 크면 나머지 값으로 다시 돌리면 되고
3. k가 배열의 길이보다 작으면 배열의 길이 반 나눠서 
4. 으아아아 


## <div align=center> 다른 풀이과정 </div>
1. numbers[2 * (k - 1) % numbers.length]
2. 맞는줄 알았으나 20, 22 번 오류 => k가 배열의 배수일 경우 나머지가 0이라 오류 발생

       int ball = 1;
       for(int i = 1; i < k ; i++){
           ball += 2;
           ball = ball % numbers.length;}
       return ball;
3. 2번 수정 버전

        int ball =1;
        for(int i = 1; i < k ; i++){
            ball +=2
            if( ball > numbers.length -1){
               ball -= numbers.length;
            }
        }
        return ball;






  

    