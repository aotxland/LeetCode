package didi;

import java.util.Scanner;

/**
 * @author AoTxLand
 * @date 2020-08-21 19:49
 */
public class FibNacke {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Long[] a = new Long[n * n];
        if (n == 1) {
            System.out.println("1");
            return;
        }
        a[0] = 1L; a[1] = 1L;
        for (int i = 2; i < n * n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        int f = a.length - 1;
        Long[][] m = new Long[n][n];
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i; j++) {
                m[i][j] = a[f];
                f--;
            }
            for (int j = i + 1; j < n - i; j++) {
                m[j][n - i - 1] = a[f];
                f--;
            }
            for (int j = n -i - 2; j >= i; j--) {
                m[n - i - 1][j] = a[f];
                f--;
            }
            for (int j = n - i - 2; j > i; j--) {
                m[j][i] = a[f];
                f--;
            }
        }
        if (n % 2 == 1)
            m[n / 2][n / 2] = 1L;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
