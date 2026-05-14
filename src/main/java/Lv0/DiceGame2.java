package main.java.Lv0;

import java.util.stream.IntStream;

public class DiceGame2 {
    public static int solution(int a, int b, int c) {
        int answer = 0;
        long equal = IntStream.of(a, b, c).distinct().count();
        if(equal == 3) answer = a + b + c;
        else if(equal == 2) answer = (a + b + c) * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        else if(equal == 1) answer = (a + b + c) * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (int)(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        return answer;
    }

    public static int solution2(int a, int b, int c) {
        int answer = 1;
        int count = 1;

        if(a == b || b == c || a == c) count++;
        if(a == b && b == c) count++;
        for(int i = 1; i <= count; i++)
            answer *= (Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i));

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution2(4, 4, 4));
        System.out.println(solution2(4, 5, 6));
    }
}