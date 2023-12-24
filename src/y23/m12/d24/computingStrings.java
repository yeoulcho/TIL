package y23.m12.d24;

public class computingStrings {
    public static void main(String[] args) {
        int result = solution("3 + 4 - 4");
        System.out.println(result);
    }
    static public int solution(String my_string) {
        int answer = 0;
        String[] temp  = my_string.split(" ");
        for(int i =1; i<temp.length-1 ; i++){
            int result = 0;
            if(temp[i].equals("+")){
                answer += Integer.parseInt(temp [i+1]);
            }
            if(temp[i].equals("-")){
                answer -= Integer.parseInt(temp [i+1]);
            }
        }
        return answer + Integer.parseInt(temp[0]);
    }
}
