package main.java.Lv0;

public class ConditionalString {
    public int solution(String ineq, String eq, int n, int m) {
        int result = 0;
        if(ineq.equals(">") && n > m) result = 1;
        if(ineq.equals("<") && n < m) result = 1;
        return result == 1 ? result : eq.equals("=") && n == m ? 1 : 0;
    }
}