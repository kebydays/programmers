package main.java.Lv0;

public class ManipulateNumber1 {
    public static int solution(int n, String control){
        for(char c : control.toCharArray()){
            switch (c) {
                case 'w' -> n += 1;
                case 's' -> n -= 1;
                case 'd' -> n += 10;
                case 'a' -> n -= 10;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(solution(0, "wsdawsdassw"));
    }
}
