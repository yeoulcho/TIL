package y23.m12.d25;

public class hateEnglish {
    public static void main(String[] args) {
        Long result = solution("onetwothreefourfivesixseveneightnine");
        System.out.println(result);
    }

    static public long solution(String numbers) {
        String temp = numbers.replace("zero", "0").replace("one", "1").replace("two", "2").replace("three", "3").replace("four", "4").replace("five", "5").replace("six", "6").replace("seven", "7").replace("eight", "8").replace("nine", "9");
        long answer = Long.parseLong(temp);
        return answer;
    }
}
