package beike;

import java.util.Scanner;

public class SJB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            String[] ss = s.split("\\ ");
            int left = 0;
            int right = 0;
            if (ss[0].equals("S")) {
                if (ss[3].equals("J")) left++;
                if (ss[2].equals("J")) left++;
            }
            if (ss[0].equals("J")) {
                if (ss[3].equals("B")) left++;
                if (ss[2].equals("B")) left++;
            }
            if (ss[0].equals("B")) {
                if (ss[3].equals("S")) left++;
                if (ss[2].equals("S")) left++;
            }
            if (ss[1].equals("S")) {
                if (ss[3].equals("J")) right++;
                if (ss[2].equals("J")) right++;
            }
            if (ss[1].equals("J")) {
                if (ss[3].equals("B")) right++;
                if (ss[2].equals("B")) right++;
            }
            if (ss[1].equals("B")) {
                if (ss[3].equals("S")) right++;
                if (ss[2].equals("S")) right++;
            }
            if (left > right) System.out.println("left");
            else if (left < right) System.out.println("right");
            else System.out.println("same");
        }
    }
}
