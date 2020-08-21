package string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author AoTxLand
 * @date 2020-08-21 9:48
 */
public class StringIsUnique {
    public boolean isUnique(String astr) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : astr.toCharArray()) {
            if (map.containsKey(c)) return false;
            else map.put(c,1);
        }
        return true;
    }
}
