package y23.m12.d19;

public class controlZ {
    public static void main(String[] args) {
        Integer result = solution("1 2 Z 3");
        System.out.println(result);
    }
    static public int solution(String s) {
        int answer = 0;
        String[] temp = s.split(" ");
        for(int i =temp.length-1; i>-1 ; i--){
            if(temp[i].equals("Z")){
                temp[i] = "0";
                temp[i-1] = "0";
            }
            answer += Integer.parseInt(temp[i]);
        }
        return answer;
    }
}
