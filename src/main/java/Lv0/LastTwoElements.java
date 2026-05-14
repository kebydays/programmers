package main.java.Lv0;

import java.util.Arrays;

public class LastTwoElements {
    public static int[] solution(int[] num_list){
        int lastIdx = num_list.length - 1;
        int last = num_list[lastIdx];
        int before = num_list[lastIdx - 1];

        int new_element = last > before ? last - before : last * 2;

        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        answer[lastIdx + 1] = new_element;
        return answer;
    }

    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        int[] num_list2 = {5, 2, 1, 7, 5, 10};
        for(int num : solution(num_list)) System.out.println(num);
        for(int num : solution(num_list2)) System.out.println(num);
    }
}
