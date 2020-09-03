package pinduoduo;

import java.util.Scanner;

public class NMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j < n - 1 && i < n / 2 && j >= n / 2) a[i][j] = 1;
                if (i < j && i < n / 2 && j < n / 2) a[i][j] = 2;
                if (i > j && i < n / 2 && j < n / 2) a[i][j] = 3;
                if (i + j < n - 1 && i >= n / 2 && j < n / 2) a[i][j] = 4;
                if (i + j > n - 1 && i >= n / 2 && j < n / 2) a[i][j] = 5;
                if (i > j && i >= n / 2 && j >= n / 2) a[i][j] = 6;
                if (i < j && i >= n / 2 && j >= n / 2) a[i][j] = 7;
                if (i + j > n - 1 && i < n / 2 && j > n / 2) a[i][j] = 8;
                //if (i == j) a[i][j] = 0;
                if (i + j == n - 1) a[i][j] = 0;
                if (n % 2 == 1 && (i == n / 2 || j == n / 2)) a[i][j] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
