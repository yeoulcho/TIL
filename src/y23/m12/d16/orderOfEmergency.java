package y23.m12.d16;

import java.util.Arrays;
import java.util.Collections;

public class orderOfEmergency {
    public static void main(String[] args) {
        int[] result = solution(new int[]{3,10,28});
        System.out.println(result);
    }
    static  public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] temp = emergency.clone();
        Arrays.sort(temp);
        for(int j =0 ; j <emergency.length; j++){
            for(int i=0 ; i< temp.length ; i++){
                if(emergency[j] == temp[i]){
                    answer[j] = emergency.length - i;
                };
            }
        }
        return answer;
    }


}
