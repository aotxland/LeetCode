package bilibili;

/**
 * @author AoTxLand
 * @date 2020-08-13 19:58
 */
public class GetCoinCount {
    /**
     *
     * @param N int整型
     * @return int整型
     */
    public int getCoinCount (int N) {
        // write code here
        int sum = 1024 - N;
        int count = 0;
        if (sum / 64 != 0) {
            count += sum / 64;
            sum %= 64;
        }
        if (sum / 16 != 0) {
            count += sum / 16;
            sum %= 16;
        }
        if (sum / 4 != 0) {
            count += sum / 4;
            sum %= 4;
        }
        count += sum;
        return count;
    }

    public static void main(String[] args) {
        GetCoinCount getCoinCount = new GetCoinCount();
        int coinCount = getCoinCount.getCoinCount(200);
        System.out.println(coinCount);
    }
}
