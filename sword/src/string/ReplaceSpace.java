package string;

/**
 * @author AoTxLand
 * @date 2020-07-10 16:20
 */
public class ReplaceSpace {
    public String replaceSpace(String s) {
        return s.replaceAll(" ", "%20");
    }
    public String replaceSpaceWithoutSys(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                sb.append("%20");
            }else
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
