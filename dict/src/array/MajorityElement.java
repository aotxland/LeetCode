package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author AoTxLand
 * @date 2020-08-21 10:37
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int c : nums) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int max = 0;
        int maxv = 0;
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() > max) {
                max = m.getValue();
                maxv = m.getKey();
            }
        }
        return maxv;
    }
}
