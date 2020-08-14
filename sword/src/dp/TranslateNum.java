package dp;



/**
 * @author AoTxLand
 * @date 2020-08-14 19:45
 */
public class TranslateNum {
    public int translateNum(int num) {
        String s = Integer.toString(num);
        int a = 1, b = 1;
        for (int i = 2; i <= s.length(); i++) {
            String tmp = s.substring(i - 2, i);
            int c = tmp.compareTo("10") >= 0 && tmp.compareTo("25") <= 0 ? a + b : a;
            b = a;
            a = c;
        }
        return a;
    }

    public static void main(String[] args) {
        TranslateNum translateNum = new TranslateNum();
        int i = translateNum.translateNum(12258);
        System.out.println(i);
    }
}
