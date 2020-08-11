package beike;


import java.util.Scanner;

/**
 * @author AoTxLand
 * @date 2020-08-11 19:27
 */
public class MaxHuoArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }
        long max = 0;
        int min = n;
        long last = 0;
        long now = 0;
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            last = a[i];
            for (int j = i; j < n; j++) {
                now = last | a[j];
                if (max < now) {
                    max = now;
                    min = j - i + 1;
                }
                if (max == now) {
                    if (min > j - i) {
                        min = j - i + 1;
                    }
                }
                b[i] = now;
                last = now;
                if (i > 1 && b[i] < b[i - 1]) {
                    break;
                }
            }
        }
        System.out.println(min);
    }
}
