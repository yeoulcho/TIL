package y23.m12.d21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class factorization {
    public static void main(String[] args) {
        int[] result = solution(300);
        System.out.println(Arrays.toString(result));
    }
    static public int[] solution(int n) {
        List<Integer> temp = new ArrayList<>();
        for(int i =2 ; i <= n; i++){
            if(n % i ==0){
                temp.add(i); // i를 리스트에 넣어

                // i의 중복을 제거하기 위함
                // 숫자를 i로 나눴을 때 나머지가 0인 경우까지 n을 줄여나감
                while(n % i == 0) {
                    // n이 i로 나누어질때 나머지가 0일때 계속
                    n /= i;
                    // n= n/i n은 i 나눴을 때 몫
                }
            }
        }
        int[] answer = new int[temp.size()];
        for(int i =0; i < temp.size(); i++){
            answer[i] = temp.get(i);
        }
        return answer;
    }
}
