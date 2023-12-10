package y23.m12.d10;

import java.util.Arrays;

public class stringSort2 {
    public static void main(String[] args) {
        String result = solution("python");
        String result2 = solution2("python");
        System.out.println(result);
        System.out.println(result2);
    }
    static public String solution(String my_string) {
        String answer = "";
        char[] tmp = my_string.toCharArray();
        for(int i=0; i < tmp.length; i++){
            if(tmp[i]<=90){
                tmp[i]= (char)(tmp[i] + 32);
            }
        }
        for(int j =0; j<tmp.length-1; j++){
            for(int i =0; i<tmp.length-1; i++){
                if(tmp[i] > tmp[i+1]){
                    char tmp2 = tmp[i];
                    tmp[i] = tmp[i+1];
                    tmp[i+1] = tmp2;
                }
            }
        }
        for(int i =0; i<tmp.length; i++){
            answer += tmp[i];
        }
        return answer;
    }

    static public String solution2(String my_string){
        char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        return new String("1");
    }
}

