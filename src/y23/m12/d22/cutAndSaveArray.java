package y23.m12.d22;

public class cutAndSaveArray {
    public static void main(String[] args) {
        String[] result = solution("abc1Addfggg4556b", 6);
        System.out.println(result);
    }
    static public String[] solution(String my_str, int n) {
        int length = 0;
        if(my_str.length() % n ==0){
            length = my_str.length()/n;
        }else{
            length = my_str.length()/n +1;
        }
        String[] answer = new String[length];
        for(int i=0; i<answer.length; i++){
            if(i == (answer.length -1)){
                answer[answer.length-1] = my_str.substring(i*n, my_str.length());
            }else{
                answer[i] = my_str.substring(i*n, (i*n)+n);
            }
        }
        return answer;
    }
}
