package ccb;

import java.util.Scanner;

public class Coc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            boolean flag = false;
            if (i < s.length() - 2){
                if (s.charAt(i) == 'c' || s.charAt(i) == 'C') flag = true;
                flag = flag && (s.charAt(i + 1) == 'O' || s.charAt(i + 1) == 'o');
                if (flag && (s.charAt(i + 2) == 'C' || s.charAt(i + 2) == 'c')) {
                    i += 2;
                }
        }
            if (!flag) sb.append(s.charAt(i));
    }
        System.out.println(sb.toString());
    }
}
