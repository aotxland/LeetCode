package iqiyi;

import java.util.Scanner;

/**
 * @author AoTxLand
 * @date 2020-08-23 15:18
 * n的阶乘问题
 * 时间限制： 3000MS
 * 内存限制： 589824KB
 * 题目描述：
 * 正整数n的阶乘(n!)中的末尾有多少个0?
 *
 * 例如：n = 5, n! = 120.末尾有1个0
 *
 * 实现：int CountZero(int n);
 *
 * 输入描述
 * 一个正整数
 *
 * 输出描述
 * 一个自然数
 *
 * 样例输入
 * 31
 * 样例输出
 * 7
 */
public class CountZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        long l = 1;
        for (long i = 2; i < n + 1; i++) {
            l *= i;
            while (l % 10 == 0) {
                l /= 10;
                count++;
            }
            if (l > 100) {
                l = l % 100;
            }
        }
        System.out.println(count);
    }
}
