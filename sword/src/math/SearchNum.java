package math;

/**
 * @author AoTxLand
 * @date 2020-08-17 20:56
 */
public class SearchNum {
    public int search(int[] nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                count++;
        }
        return count;
    }
    public int search2(int[] nums, int target) {
        return helper(nums, target) - helper(nums, target - 1);
    }

    private int helper(int[] nums, int tar) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (nums[m] <= tar) i = m + 1;
            else j = m - 1;
        }
        return i;
    }
}
