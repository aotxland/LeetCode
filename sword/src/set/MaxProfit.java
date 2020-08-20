package set;


/**
 * @author AoTxLand
 * @date 2020-08-20 20:12
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        int pro = 0;
        int cost = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            cost = Math.min(cost,prices[i]);
            pro = Math.max(pro,prices[i] - cost);
        }
        return pro;
    }
}
