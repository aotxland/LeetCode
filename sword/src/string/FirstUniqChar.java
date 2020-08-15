package string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author AoTxLand
 * @date 2020-08-15 16:13
 */
public class FirstUniqChar {
    public char firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i),i);
            } else {
                map.put(s.charAt(i),50001);
            }
        }
        for (char c : s.toCharArray()) {
            if (map.get(c) < 50000)
                return c;
        }
        return ' ';
    }
}
