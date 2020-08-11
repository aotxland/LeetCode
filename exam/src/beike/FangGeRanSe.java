package beike;

import java.util.Scanner;

/**
 * @author AoTxLand
 * @date 2020-08-11 19:10
 */
public class FangGeRanSe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            long n = in.nextLong();
            long m = in.nextLong();
            long y = m * n;
            if (y == 1) {
                System.out.println(1);
            } else{
                int count = 1;
                long d = y;
                while (d != 0) {
                    count ++;
                    d = y % count;
                }
                System.out.println(count);
            }
        }
    }
}
