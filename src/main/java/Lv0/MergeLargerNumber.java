package main.java.Lv0;

public class MergeLargerNumber {
    public int solution(int a, int b){
        int result1 = (int) (a * Math.pow(10, String.valueOf(b).length())) + b;
        int result2 = (int) (b * Math.pow(10, String.valueOf(a).length())) + a;
        return (result1 > result2 ? result1 : result2);
    }
}
