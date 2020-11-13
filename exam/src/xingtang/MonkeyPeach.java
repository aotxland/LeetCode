package xingtang;

import java.util.Scanner;

public class MonkeyPeach {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        System.out.println(getPeachCount(m));
    }
    public static int getPeachCount(int m) {
        int peach = 1;
        int peaches = 1;
        int monkey = 1;
        m++;
        while (monkey != m) {
            if (peach % 5 == 1 && peach / 5 != 0) {
                peach = (peach / 5) * 4;
                monkey++;
            }
            else {
                peaches++;
                peach = peaches;
                monkey = 1;
            }
        }
        return peaches;
    }
}
