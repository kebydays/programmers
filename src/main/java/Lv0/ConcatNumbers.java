package main.java.Lv0;

public class ConcatNumbers {
    public static int solution(int[] num_list) {
        int odd = 0;
        int even = 0;
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 1){
                odd = odd * 10 + num_list[i];
            }
            else{
                even = even * 10 + num_list[i];
            }
        }
        return odd + even;
    }

    public static void main(String[] args) {
        int[] num_list1 = {3, 4, 5, 2, 1};
        int[] num_list2 = {5, 7, 8, 3};
        System.out.println(solution(num_list1));
        System.out.println(solution(num_list2));
    }
}
