package String;

/**
 * @author AoTxLand
 * @date 2020-05-17 10:51
 */
public class IsPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        int n = chars.length;
        int a = 0;
        int b = n - 1;
        while(a < b){
            if((chars[a] <= 'z' && chars[a] >= 'a') || chars[a] >= '0' && chars[a] <= '9'){
                if((chars[b] <= 'z' && chars[b] >= 'a') || chars[b] >= '0' && chars[b] <= '9'){
                    if(chars[a] == chars[b]){
                        a++;
                        b--;
                    }
                    else return false;
                }
                else{
                    b--;
                }
            }
            else{
                a++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsPalindrome ip = new IsPalindrome();
        System.out.println(ip.isPalindrome("0p"));
    }
}
