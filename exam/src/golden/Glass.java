package golden;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author AoTxLand
 * @date 2020-07-29 16:02
 * 种草
 * 时间限制： 3000MS
 * 内存限制： 589824KB
 * 题目描述：
 * 杰夫非常喜欢种草，他自己有一片草地，为了方便起见，我们把这片草地看成一行从左到右，并且第 i 个位置的草的高度是hi。
 * 杰夫在商店中购买了m瓶魔法药剂，每瓶魔法药剂可以让一株草长高x，杰夫希望每次都能有针对性的使用药剂，也就是让当前长得最矮的小草尽量高，现在杰夫想请你告诉他在使用了m瓶魔法药剂之后，最矮的小草在这种情况下最高能到多少。
 *
 * 输入描述
 * 第一行三个整数n, m, x分别表示小草的个数，魔法药剂的个数以及每瓶魔法药剂让小草长高的高度。(1≤n,m,x≤1e5)
 * 第二行n个整数分别表示第i株小草的高度ai。(1≤ai≤1e9)
 *
 * 输出描述
 * 使用了m瓶药剂之后最矮的小草的最高高度。
 *
 * 样例输入
 * 3 1 1
 * 1 2 3
 * 样例输出
 * 2
 */
public class Glass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int x = in.nextInt();
        int[] g = new int[n];
        for (int i = 0; i < n; i++) {
            g[i] = in.nextInt();
        }

        Arrays.sort(g);
        int lastLoc = 0;
        for (int i = 0; i < m; i++) {
            g[0] += x;
            //Arrays.sort(g,0,i + 1);
            int now = g[0];
            if (lastLoc > 0) {
                if (g[lastLoc] < now) {
                    g[0] = g[lastLoc];
                    g[lastLoc] = now;
                }
                if (g[lastLoc + 1] < now) {
                    lastLoc++;
                    g[0] = g[lastLoc];
                    g[lastLoc] = now;
                }
                if (g[lastLoc - 1] < now) {
                    lastLoc--;
                    g[0] = g[lastLoc];
                    g[lastLoc] = now;
                }
                if (g[1] < now) {
                    lastLoc = 1;
                    g[0] = g[lastLoc];
                    g[lastLoc] = now;
                }
            }
            if (lastLoc == 0) {
                if (g[1] < now) {
                    lastLoc++;
                    g[0] = g[lastLoc];
                    g[lastLoc] = now;
                }
            }
        }
        System.out.println(g[0]);

    }
}
