package main.java.Lv0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ProductAndSum {
    public static int solution(int[] num_list) {
        return IntStream.of(num_list).reduce(1, (a, b) -> a * b) < Math.pow(IntStream.of(num_list).sum(), 2) ? 1 : 0;
    }

    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 1};
        int[] num_list2 = {5, 7, 8, 3};
        System.out.println(solution(num_list));
        System.out.println(solution(num_list2));
    }
}
