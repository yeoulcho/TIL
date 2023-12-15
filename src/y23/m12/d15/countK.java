package y23.m12.d15;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class countK {
    public static void main(String[] args) {
        int result = solution(1, 13, 1);
        System.out.println(result);
    }

        static public int solution(int i, int j, int k) {
            int answer = 0;
            String sum = "";
            List<String> temp = new ArrayList<>();
            for(int x = i; x <= j; x++){
                String strX = Integer.toString(x);
                sum += strX;
            }
            String[] digits = sum.split("");
            temp.addAll(Arrays.asList(digits));

            for(int l=0; l<temp.size(); l++){
                if(temp.get(l).equals(Integer.toString(k))){
                    answer ++;
                }
            }
            return answer;
        }

}
