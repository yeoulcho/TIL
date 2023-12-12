package y23.m12.d12;

public class makeBwithA {
    public static void main(String[] args) {
        int result = solution("ellho","hello");
        System.out.println(result);
    }

    static public int solution(String before, String after) {
        int sumBefore = 0;
        int sumAfter= 0;
        for(int i =0 ; i <before.length(); i++){
            sumBefore += before.charAt(i);
            sumAfter += after.charAt(i);
        }
        return sumBefore == sumAfter ? 1: 0;

    }

}


// class Solution {
//     public int solution(String before, String after) {
//         int answer = 0;
//         char[] b = before.toCharArray();
//         char[] a = after.toCharArray();
//         boolean temp = false;
//         for(int i =0; i<a.length; i++){
//             for(int j =0; j<b.length; j++)
//                 if(a[i] == b[j]){
//                     b[j] = 0;
//                     temp = true;
//                 }else{
//                     temp = false;
//                     break;
//                 }
//         }
//         if(temp){
//             answer = 1;
//         }else{
//             answer = 0;
//         }
//         return answer;
//     }
// }