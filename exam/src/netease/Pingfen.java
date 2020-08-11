package netease;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @author AoTxLand
 * @date 2020-08-08 15:53
 */
public class Pingfen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int q = 0; q < t; q++) {
            int n = in.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                sum += a[i];
            }
            Arrays.sort(a);
            int min = sum;
            int a1 = 0, a2 = 0;
            for (int i = n - 1; i >= 1; i--) {
                if (a[i] <= sum / 2) {
                    if (a1 < a2) {
                        a1 += a[i];
                    } else {
                        a2 += a[i];
                    }
                }
                if (a1 == a2) {
                    if (min < sum - a1 - a2)
                        min = sum - a1 - a2;
                }
            }
            System.out.println(min);
        }
    }
}
