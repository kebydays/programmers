package main.java.Lv0;

public class ManipulateNumber2 {
    public static String solution(int[] numLog){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numLog.length - 1; i++){
            int cal_num = numLog[i + 1] - numLog[i];

            switch (cal_num) {
                case 1 -> sb.append("w");
                case -1 -> sb.append("s");
                case 10 -> sb.append("d");
                case -10 -> sb.append("a");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        System.out.println(solution(numLog));
    }
}
