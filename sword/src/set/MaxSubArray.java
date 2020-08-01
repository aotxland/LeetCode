package set;

/**
 * @author AoTxLand
 * @date 2020-08-01 17:22
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res,nums[i]);
        }
        return res;
    }
}
