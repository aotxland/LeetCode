package beike;

import java.util.Scanner;

/**
 * @author AoTxLand
 * @date 2020-08-11 19:05
 */
public class Huiwen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        char[] a = s.toCharArray();
        int count  = 0;
        for (int i = 0; i < n / 2; i++) {
            if (a[i] != a[n - 1 - i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
