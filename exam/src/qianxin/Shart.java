package qianxin;

import java.util.Scanner;

public class Shart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n <= 0) {
            System.out.println(0);
            return;
        }
        int a = 1;
        int b = 0;
        for (int i = 1; i <= n; i++) {
            int c = a + b;
            b = a;
            a = c;
        }
        System.out.println(a);
    }
}
