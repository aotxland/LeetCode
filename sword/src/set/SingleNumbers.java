package set;

import java.util.HashMap;
import java.util.Map;

/**
 * @author AoTxLand
 * @date 2020-08-18 22:41
 */
public class SingleNumbers {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        for (int n : nums)
            hashmap.put(n, hashmap.getOrDefault(n, 0) + 1);

        int[] output = new int[2];
        int idx = 0;
        for (Map.Entry<Integer,Integer> item : hashmap.entrySet()) {
            if (item.getValue() == 1) output[idx++] = item.getKey();
        }
        return output;
    }

    public int[] singleNumbers(int[] nums) {
        int bitmask = 0;
        for (int num : nums) bitmask ^= num;
        int diff = bitmask & (-bitmask);
        int x = 0;
        for (int num : nums)
            if ((num & diff) != 0)
                x ^= num;

        return new int[]{x, bitmask ^ x};
    }
}
