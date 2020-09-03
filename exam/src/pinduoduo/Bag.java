package pinduoduo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Bag {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
                a[i][0] = in.nextInt();
                a[i][1] = in.nextInt();
        }
        int[][] dp = new int[n + 1][2];
        dp[0][0] = 0;
        dp[0][1] = m;
        int max = 0;
        for (int i = 1; i < n + 1; i++) {
            dp[i][0] =Math.max(dp[i - 1][0], dp[i - 1][0] + a[i][1]);
            max = Math.max(max,dp[i][0]);
        }

    }
}
