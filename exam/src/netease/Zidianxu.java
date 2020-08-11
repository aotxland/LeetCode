package netease;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author AoTxLand
 * @date 2020-08-08 15:23
 */
public class Zidianxu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        boolean[] b = new boolean[100001];
        int[] a = new int[m];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int t = in.nextInt();
            b[t] = true;
            a[i] = t;
        }
        int count = 0, count2 = 1;
        for (int i = 0; i < n; i++) {
            if (n - i < m - count + 1) {
                for (int j = count; j < m; j++) {
                    list.add(a[j]);
                }
                break;
            }
            while (count2 <= n && b[count2]) {
                count2++;
            }
            if (count < m && a[count] <= count2) {
                list.add(a[count]);
                count++;
            } else {
                list.add(count2);
                count2++;
            }
        }

        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println(list.get(list.size() - 1));
    }
}
