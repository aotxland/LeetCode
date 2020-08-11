package netease;



import java.util.Scanner;

/**
 * @author AoTxLand
 * @date 2020-08-08 15:02
 */
public class Sushu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            if (t > 1) {
                sum += t / 2;
            }
        }
        System.out.println(sum);
    }
}
