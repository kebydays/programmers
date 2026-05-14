package main.java.Lv0;

public class SequenceAndRangeQuery2 {
    public static int[] solution(int[] arr, int[][] queries){
        int i = 0;
        int[] answer = new int[queries.length];
        for(int[] querie : queries) {
            int s = querie[0], e = querie[1], k = querie[2];
            int val = Integer.MAX_VALUE;

            for(int j = s; j <= e; j++) {
                if(arr[j] > k) val = Math.min(val, arr[j]);
            }
            answer[i++] = val == Integer.MAX_VALUE ? -1 : val;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] quries = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
        for(int c : solution(arr,quries)) System.out.println(c);
    }
}
