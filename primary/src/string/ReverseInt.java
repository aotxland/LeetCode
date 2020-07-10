package string;

/**
 * @author AoTxLand
 * @date 2020-05-17 9:36
 */
public class ReverseInt {
    public int reverse(int x) {
        long rx = 0;
        while (x != 0){
            rx = rx * 10 + x % 10;
            x = x / 10;
        }
        if (rx > Integer.MAX_VALUE) {
            return 0;
        } else if (rx < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) rx;
    }

    public static void main(String[] args) {
        ReverseInt ri = new ReverseInt();
        int re = ri.reverse(123);
        System.out.println(re);
    }
}
