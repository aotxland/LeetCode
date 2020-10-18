package cmcc;

import java.util.Scanner;

public class SaleBooks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res = (int) Math.pow(2,n + 2);
        System.out.println(res);
        for (int i = 0; i < n;i++) {
            res /= 2;
            System.out.println(res);
        }
    }
}
