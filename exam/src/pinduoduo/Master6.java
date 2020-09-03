package pinduoduo;

import java.util.Scanner;

public class Master6 {
    static int max = 0;
    static int sec = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
            }
        }
        dfs(a,0, 0);

        System.out.println(max + sec);
    }

    private static boolean dfs(int [][] a, int i, int j) {
        if (a[i][j] == 0) return false;
        return true;
    }
}
