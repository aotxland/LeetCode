package pinduoduo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class SpFun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);

        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < m; j++) {
                if (i % a[j] == 0) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
