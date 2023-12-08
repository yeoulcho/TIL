package y23.m12.d08;

public class findNumber {
    public static void main(String[] args) {
        int result = solution(12648, 2);
        System.out.println(result);
    }
    static public int solution(int num, int k) {
        int answer = 0;
        String tmp = String.valueOf(num);
        String tmp2 = String.valueOf(k);

        String[] tmpArray = tmp.split("");

        for(int i =0; i<tmpArray.length;i++){
            if(tmpArray[i].equals(tmp2)){
                answer = i+1;
                break;
            } else{
                answer = -1;
            }
        }
        return answer;
    }
}
