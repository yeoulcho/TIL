# 2022.12.11
프로그래머스 > 코딩테스트 입문 > [A로 B만들기](https://school.programmers.co.kr/learn/courses/30/lessons/120886)

## <div align=center> 내가 생각한 풀이과정 </div>
1. String before와 String after를 일단 배열로 바꿔
2. 배열 둘이 비교해서 같으면 temp +1 그리고 before의 값을 치환
3. temp 값이 배열의 길이와 같으면 1, 아니면 0
4. 문제 발생.....ellho와 hello가 틀리다고 나옴 
   => 이중 for문을 돌리면서 l이 두번 반복되는데 첫번째 l에 치환이 두번다 이루어져서 생기는 문제
   => 해결 방안을 모르겠음 

## <div align=center> 다른 풀이 </div>
1. String의 길이만큼 for문을 돌리면서 string의 각각 char로 나눈 후 합을 비교<br>


      public int solution(String before, String after) {
         int sumBefore = 0;
         int sumAfter= 0;
      for(int i =0 ; i <before.length(); i++){
         sumBefore += before.charAt(i);
         sumAfter += after.charAt(i);
      }
      return sumBefore == sumAfter ? 1: 0;
      }
2. String before와 String after를 일단 배열로 바꾸고 정렬하여 비교


      public int solution(String before, String after) {
         char[] a = before.toCharArray();
         char[] b = after.toCharArray();
         Arrays.sort(a);
         Arrays.sort(b);
        return new String(a).equals(new String(b)) ? 1 :0;
      }
## <div align=center> 오늘의 느낀점 </div>
for문을 두번 돌려서 하는 접근 방법을 다시 생각해 봐야겠다.<br>
왜 문제가 발생한지는 알았으나 해결방법을 찾지 못한게 맘에 걸린다.<br>
나의 사고가 기본기? 원초적 풀이에만 머물러 있는데 그걸 넘어서서 응용하는 생각을 하고 싶다.



    