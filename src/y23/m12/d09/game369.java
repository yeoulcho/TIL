package y23.m12.d09;

public class game369 {
    public static void main(String[] args) {
        int result = solution(369);
        System.out.println(result);
    }

    static public int solution(int order) {
            int answer = 0;
            String strOrder = String.valueOf(order);
            for(int i=0; i<strOrder.length(); i++){
                if(strOrder.charAt(i) =='3'){
                    answer +=1;
                }
                if(strOrder.charAt(i) =='6'){
                    answer +=1;
                }
                if(strOrder.charAt(i) =='9'){
                    answer +=1;
                }
            }
            return answer;
        }
    }

