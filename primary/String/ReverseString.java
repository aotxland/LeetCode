package String;

/**
 * @author AoTxLand
 * @date 2020-05-17 9:31
 */
public class ReverseString {
    public void reverseString(char[] s) {
        for(int i = 0; i < s.length / 2; i++){
            char temp;
            temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }
}
