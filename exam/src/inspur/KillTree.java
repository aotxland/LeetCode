package inspur;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 被砍掉的树
 * 时间限制： 3000MS
 * 内存限制： 655360KB
 * 题目描述：
 * 某条街道两侧分别种植了一排树木，并按如下编号：
 * 1 3 5 7 .... 45 47 49 ... 99
 * 2 4 6 8 ... 46 48 50 ... 100
 * 但是有一些树被砍去，希望你能找出一边最长的连续的大树。
 *
 * 输入描述
 * 第一行一个整数N
 * 第二行N个整数表示被砍去树的编号
 *
 * 输出描述
 * M 和 X（表示从第M棵大树开始，共有连续的X棵大树，如果有多个解，输出M最小的解即可）
 *
 * 样例输入
 * 5
 * 9 15 27 35 6
 *
 * 样例输出
 * 8 47
 */
public class KillTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n == 0){
            System.out.println(1 + " " + 50);
        }
        int[] a = new int[n + 2];
        for(int  i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        a[n] = 101;
        a[n + 1] = 102;
        Arrays.sort(a);
        int start = 0;
        int sum = 0;
        int odd = -1;
        int even = 0;
        for (int i : a) {
            if ( i % 2 == 1) {
                int t = (i - odd) / 2 - 1;
                if (t > sum) {
                    sum = t;
                    start = odd + 2;
                }
                odd = i;
            } else {
                int t = (i - even) / 2 - 1;
                if (t > sum) {
                    sum = t;
                    start = even + 2;
                }
                even = i;
            }
        }
        System.out.println(start+ " " + sum);
    }
}
