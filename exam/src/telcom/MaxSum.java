package telcom;

import java.util.Scanner;

public class MaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] split = s.split("\\,");
        int[] a = new int[split.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(split[i]);
        }
        int[] sum = new int[a.length + 1];
        sum[0] = 0;
        sum[1] = a[0];
        for (int i = 2; i <= a.length; i++) {
            sum[i] = Math.max(sum[i - 1],sum[i - 2] + a[i - 1]);
        }
        System.out.println(sum[a.length]);
    }
}
