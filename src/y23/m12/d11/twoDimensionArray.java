package y23.m12.d11;

import java.util.Arrays;

public class twoDimensionArray {
    public static void main(String[] args) {
        int[][] result = solution(new int[]{1,2,3,4}, 2);
        System.out.println(Arrays.deepToString(result));
    }
    public static int[][] solution(int[] num_list, int n) {
            int[][] answer = new int[num_list.length/n][n];
            int temp = 0;
            for(int j =0 ; j <num_list.length/n  ; j++){
                for(int i=0 ; i< n ; i++){
                    answer[j][i] = num_list[temp];
                    temp++;
                }
            }
            return answer;
        }

}

