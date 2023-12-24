package y23.m12.d23;

public class throwBall {
    public static void main(String[] args) {
        int result = solution(new int[]{1,2,3}, 6);
        int result2 = solution2(new int[]{1,2,3}, 6);
        System.out.println(result);
        System.out.println(result2);
    }

    static public int solution(int[] numbers, int k) {
        int ball = 1;
        for (int i = 1; i < k; i++) {
            ball += 2;
            if (ball > numbers.length - 1) {
                ball -= numbers.length;
            }
        }
        return ball;
    }

    static public int solution2(int[] numbers, int k) {
        return numbers[2 * (k - 1) % numbers.length];
    }
}
