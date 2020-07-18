package set;

import java.util.Arrays;

/**
 * @author AoTxLand
 * @date 2020-07-18 9:56
 */
public class ExchangeOddEVen {
    public int[] exchange(int[] nums) {
        int h = 0;
        int f = nums.length - 1;
        while (h <= f) {
            while (h < f && nums[h] % 2 == 1) {
                h++;
            }
            while (h < f && nums[f] % 2 == 0) {
                f--;
            }
            if(h < f) {
                int t = nums[h];
                nums[h] = nums[f];
                nums[f] = t;
            }
            h++;
            f--;
        }
        return nums;
    }
}
