package main.java.Lv0;

public class ReturnByOddEven {
    public static int odd(int n){
        int result = 0;
        for(int i = 1; i <= n; i += 2)
            result += i;
        return result;
    }

    public static int even(int n){
        int result = 0;
        for(int i = 2; i <= n; i += 2)
            result += Math.pow(i, 2);
        return Integer.valueOf(result);
    }

    public int solution(int n){
        return n % 2 != 0 ? odd(n) : even(n);
    }
}

// 등차수열 공식 적용하면 더 간단히 작성할 수 있음.