package golden;

/**
 * @author AoTxLand
 * @date 2020-07-28 15:21
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * 作者：Sun浅雨
 * 链接：https://www.nowcoder.com/discuss/457660?type=post&order=time&pos=&page=1&channel=666&source_id=search_post
 * 来源：牛客网
 *
 * 1、平行四边形构造
 * 题目描述：
 * 给出你n条长度不一的边，请你从中选择四条边，组成一个最大的平行四边形。请你输出最大的平行四边形的面积。
 *
 * 输入描述
 * 输入第一行包含一个正整数n，表示边的数量。(4<=n<=50000)
 * 输入第二行包含n个正整数，表示n条边的长度，边的长度不会超过10^9。
 *
 * 输出描述
 * 输出仅包含一个正整数，即最大的平行四边形的面积，无解则输出-1。
 *
 * 样例输入
 * 5
 * 3 3 4 4 5
 *
 * 样例输出
 * 12
 */
public class MaxParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        int l = 0;
        int s = 0;
        int com = n - 1;
        while (n > 1) {
            if (a[com] == a[com - 1]) {
                l = a[com];
                com = com - 2;
                break;
            }
            com --;
        }
        while (n > 0) {
            if (a[com] == a[com - 1]) {
                s = a[com];
                break;
            }
            com --;
        }
        System.out.print(l*s);
    }
}
