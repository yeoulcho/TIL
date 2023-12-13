package y23.m12.d13;

public class factorial {
    public static void main(String[] args) {
        int result = solution(100);
        System.out.println(result);
    }

    static public int solution(int n) {
        int sum = 1;
        int answer = 0;
        for(int i =1; sum<n; i++){
            sum = sum * i;
            answer ++;
            if(sum>n){
                answer --;
            }
        }
        if(n==1){
            answer=1;
        }
        return answer;
    }
}
