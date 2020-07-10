package string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author AoTxLand
 * @date 2020-05-17 10:33
 */
public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        Map<Character,Integer> sMap = new HashMap<>();
        Map<Character,Integer> tMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            sMap.put(s.charAt(i),sMap.getOrDefault(s.charAt(i), 0) + 1);
            tMap.put(t.charAt(i),tMap.getOrDefault(t.charAt(i), 0) + 1);
        }
        return sMap.equals(tMap);
    }
}
