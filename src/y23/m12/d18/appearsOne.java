package y23.m12.d18;

import java.util.Arrays;

public class appearsOne {
    public static void main(String[] args) {
        String result = solution("abcabcadc");
        System.out.println(result);
    }
    static public String solution(String s) {
        String answer = "";
        String[] temp = s.split("");
        int count = 0;
        Arrays.sort(temp);

        for(int i=0; i< temp.length; i++){
            count = 0;
            for(int j =0; j<temp.length; j++){
                if(temp[i].equals(temp[j])){
                    count ++;
                }
            }
            if(count ==1){
                answer += temp[i];
            }
        }
        return answer;
    }
}
