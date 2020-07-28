package golden;

import java.util.Scanner;

/**
 * @author AoTxLand
 * @date 2020-07-28 15:35
 * 作者：Sun浅雨
 * 链接：https://www.nowcoder.com/discuss/457660?type=post&order=time&pos=&page=1&channel=666&source_id=search_post
 * 来源：牛客网
 *
 * 2、排序
 * 题目描述：
 * 有一种排序算法定义如下，该排序算法每次只能把一个元素提到序列的开头，例如2，1，3，4，只需要一次操作把1提到序列起始位置就可以使得原序列从小到大有序。现在给你个乱序的1-n的排列，请你计算最少需要多少次操作才可以使得原序列从小到大有序。
 *
 * 输入描述
 * 输入第一行包含两个正整数n ，表示序列的长度。(1<=n<=100000)
 * 接下来一行有n个正整数，表示序列中的n个元素，中间用空格隔开。(1<=a_i<=n)
 *
 * 输出描述
 * 输出仅包含一个整数，表示最少的操作次数。
 *
 * 样例输入
 * 4
 * 2 1 3 4
 * 样例输出
 * 1
 */
public class MySort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int max = a[0];
        int count = 1;
        int loc = 0;
        for (int i = 1; i < n; i++){
            if (a[i] > max) {
                max = a[i];
                loc = i;
            }
        }
        while (loc >= 0) {
            if (a[loc] == max - 1) {
                count ++;
                max --;
            }
            loc --;
        }
        System.out.println(n - count);
    }
}
