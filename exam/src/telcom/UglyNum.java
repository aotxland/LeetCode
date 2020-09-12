package telcom;

import java.util.Scanner;

public class UglyNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n <= 1) {
            System.out.println(1);
            return;
        }
        int[] res = new int[n];
        res[0] = 1;
        int two = 0;
        int three = 0;
        int five = 0;
        for (int i = 1; i < n; i++) {
            int x2 = res[two] * 2;
            int x3 = res[three] * 3;
            int x5 = res[five] * 5;
            int min = Math.min(x2, Math.min(x3, x5));
            res[i] = min;
            if (x2 == min) {
                two++;
            }
            if (x3 == min) {
                three++;
            }
            if (x5 == min) {
                five++;
            }
        }
        System.out.println(res[n - 1]);
    }
}
// 1 2 3 4 6 8 10
//
