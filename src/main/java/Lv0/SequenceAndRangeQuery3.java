package main.java.Lv0;

public class SequenceAndRangeQuery3 {
    public static int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int left = query[0];
            int right = query[1];
            int temp = arr[left];

            arr[left] = arr[right];
            arr[right] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3}, {1, 2}, {1, 4}};
        for(int c : solution(arr, queries)) System.out.println(c);
    }
}
