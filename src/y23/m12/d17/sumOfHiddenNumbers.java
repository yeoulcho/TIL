package y23.m12.d17;


public class sumOfHiddenNumbers {
    public static void main(String[] args) {
        int result = solution("aAb1B2cC34oOp");
        System.out.println(result);
    }
    static public int solution(String my_string) {
        int answer = 0;
        char[] temp = my_string.toCharArray();
        int[] intTemp = new int[my_string.length()];
        String sum = "";
        for(int i =0 ; i<my_string.length(); i++){
            if((int)temp[i] > 57){
                temp[i] = '0';
                sum+= temp[i];
            }
            sum += temp[i];
        }
        System.out.println(sum);
        String[] temp2 = sum.split("0");
        for(int i =0 ; i<temp2.length; i++){
            if (!temp2[i].isEmpty()) {
                try {
                    answer += Integer.parseInt(temp2[i]);
                } catch (NumberFormatException e) {
                    // 예외 처리: 정수로 변환할 수 없는 경우 무시
                }
            }
        }
        return answer;
    }


}
