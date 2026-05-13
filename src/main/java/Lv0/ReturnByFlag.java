package main.java.Lv0;

public class ReturnByFlag {
    public int solution(int a, int b, boolean flag) {
        return flag == true ? a + b : a - b;
    }
}
