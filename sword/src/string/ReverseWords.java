package string;

/**
 * @author AoTxLand
 * @date 2020-08-19 10:55
 */
public class ReverseWords {
    public String reverseWords(String s) {
        String[] split = s.trim().split("\\ ");
        StringBuilder sb = new StringBuilder();
        for (int i = split.length - 1; i >= 0 ; i--) {
            if (!"".equals(split[i])){
                sb.append(split[i]);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        ReverseWords reverseWords = new ReverseWords();
        String s = reverseWords.reverseWords("a good   example");
        System.out.println(s);
    }
}
