package set;

import java.util.HashMap;
import java.util.Map;

/**
 * @author AoTxLand
 * @date 2020-08-19 10:15
 */
public class TwoSumTarget {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num: nums) {
            if (map.containsKey(target - num)) {
                return new int[]{num, target - num};
            } else
                map.put(num,1);
        }
        return null;
    }
}
