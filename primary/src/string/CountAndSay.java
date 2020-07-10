package string;

/**
 * @author AoTxLand
 * @date 2020-05-17 16:28
 */
public class CountAndSay {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        String s = "1";
        for(int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int pre = 0;
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) != s.charAt(pre)){
                    sb.append(j - pre).append(s.charAt(pre));
                    pre = j;
                }
            }
            sb.append(s.length() - pre).append(s.charAt(pre));
            s = sb.toString();
        }
        return s;
    }
}
