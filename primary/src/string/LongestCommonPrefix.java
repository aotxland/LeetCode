package string;

/**
 * @author AoTxLand
 * @date 2020-05-17 16:50
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if(n == 0) return "";
        if(n == 1) return strs[0];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strs[0].length(); i++){
            char c = strs[0].charAt(i);
            for(int j = 1; j < n; j++){
                if(i > strs[j].length() - 1)
                    return sb.toString();
                if(strs[j].charAt(i) != c)
                    return sb.toString();
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
