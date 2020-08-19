package string;

/**
 * @author AoTxLand
 * @date 2020-08-19 11:04
 */
public class ReverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0,n - 1);
    }
}
