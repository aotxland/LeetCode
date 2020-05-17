package Array;

/**
 * @author AoTxLand
 * @date 2020-05-16 17:26
 */
public class MaxProfit2 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                profit += prices[i] - prices[i - 1];
        }
        return profit;
    }
}
