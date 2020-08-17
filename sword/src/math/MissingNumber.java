package math;

/**
 * @author AoTxLand
 * @date 2020-08-17 21:19
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (m == nums[m]) i = m + 1;
            else j = m - 1;
        }
        return i;
    }
}
