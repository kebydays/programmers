package main.java.Lv0;

import java.util.stream.IntStream;

public class SumArithmeticSequenceTerms {
    // for문
    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for(int i = 0; i < included.length; i++){
            if(included[i]) answer += a + d * i;
        }
        return answer;
    }

    // 스트림 버전 풀이
    public static int solution_stream(int a, int d, boolean[] included){
        int answer = IntStream.range(0, included.length)
                .map(idx -> included[idx] ? a + (d * idx) : 0)
                .sum();
        return answer;
    }

    public static void main(String[] args) {
        boolean[] included = {true, false, false, true, true};
        System.out.println(solution_stream(3, 4, included));
    }
}
