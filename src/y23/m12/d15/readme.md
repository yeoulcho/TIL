# 2022.12.15
프로그래머스 > 코딩테스트 입문 > [k의 개수](https://school.programmers.co.kr/learn/courses/30/lessons/120887)

## <div align=center> 내가 생각한 풀이과정 </div>
1. int를 string으로 변환
2. string을 모두 합하기
3. split으로 분리하여 list에 넣기
4. list에서 일치하는 int k의 갯수 찾기

## <div align=center> 오늘의 느낀점 </div>
소요시간이 오래 걸리는거 같아서 새로운 방법을 찾아봐야할 것 같다.<br>
 
- 숫자를 ""라는 문자를 통해 string으로 바로 합치기
- 전체 길이 - (k를 공백으로 치환 후 길이)


    public int solution(int i, int j, int k) {
        String str = "";
        for(int a = i; a <= j; a++) {
            str += a+"";
        }
        return str.length() - str.replace(k+"", "").length();
    }


# <div align=center> Check Point! </div>
### 1. list에 배열을 한번에 넣어서 오류 발생
 - 배열의 각 요소를 목록에 추가하여 오류 해결


    String[] digits = sum.split("");
    temp.addAll(Arrays.asList(digits));

    