package bilibili;

/**
 * @author AoTxLand
 * @date 2020-08-13 19:45
 */
public class IsValidExp {
    /**
     *
     * @param s string字符串
     * @return bool布尔型
     */
    public boolean isValidExp (String s) {
        // write code here
        if ("".equals(s)) {
            return true;
        }
        if (s.length() % 2 == 1) return false;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length / 2; i++) {
            boolean sym = false;
            if (c[i] =='{' && c[c.length - 1 - i] == '}') {
                sym = true;
            } else
            if (c[i] =='[' && c[c.length - 1 - i] == ']') {
                sym = true;
            } else
            if (c[i] =='(' && c[c.length - 1 - i] == ')') {
                sym = true;
            }
            if (!sym) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsValidExp isValidExp = new IsValidExp();
        boolean validExp = isValidExp.isValidExp("({[[]]})");
        System.out.println(validExp);
    }
}
