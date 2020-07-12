package set;

import java.util.HashMap;
import java.util.Map;

/**
 * @author AoTxLand
 * @date 2020-07-10 15:37
 */
public class FindRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            if (map.get(i) != null){
                return i;
            }
            else map.put(i,1);
        }
        return 0;
    }
}