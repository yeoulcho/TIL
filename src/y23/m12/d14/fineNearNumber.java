package y23.m12.d14;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class fineNearNumber {
    public static void main(String[] args) {
        int result = solution(new int[]{3,10,28}, 20);
        System.out.println(result);
    }
        static public int solution(int[] array, int n) {
            int result = 0;
            List<Integer> temp1 = new ArrayList<>();
            List<Integer> temp2 = new ArrayList<>();

            for (int i = 0; i < array.length; i++) {
                if (array[i] < n) {
                    temp1.add(n - array[i]);
                } else if (array[i] > n) {
                    temp2.add(array[i] - n);
                } else if (array[i] ==n){
                    return n;
                }
            }

            Collections.sort(temp1);
            Collections.sort(temp2);

            if (temp1.isEmpty()) {
                result = temp2.get(0)+n;
            }

            if (temp2.isEmpty()) {
                result = n-temp1.get(0);
            }
            if(!temp2.isEmpty() && !temp1.isEmpty())
                if(temp1.get(0)<temp2.get(0)){
                    result = n- temp1.get(0);
                }else if(temp1.get(0)>temp2.get(0)){
                    result =temp2.get(0)+n;
                }else if(temp1.get(0) == temp2.get(0)){
                    result = n- temp1.get(0);

                }

            return result;
        }


}
