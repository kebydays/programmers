package main.java.Lv0;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PrintAdditionExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        sb.append(a).append(" + ").append(b).append(" = ").append(a + b);
        System.out.println(sb);
    }
}
