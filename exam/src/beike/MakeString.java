package beike;

import java.util.Scanner;

public class MakeString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        int len = s.length();
        int ls = 0;
        String sample, left;
        for (int i = len / 2; i > 0; i--) {
            for (int j = 0; j < len - i; j += i) {
                sample = s.substring(j, i);
                left = s.substring(i);
                if (left.contains(sample)) {
                    if (sample.length() != 0) {
                        System.out.println(s.length() - sample.length() + 1);
                        return;
                    } else {
                        System.out.println(n);
                        return;
                    }
                }
            }
        }
        System.out.println(n);
    }
}
