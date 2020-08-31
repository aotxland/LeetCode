package inspur;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 石头
 * 时间限制： 3000MS
 * 内存限制： 655360KB
 * 题目描述：
 * 沙滩按照线型摆放着n个大小不一的球形石头，已知第i个石头的半径为ri，且不存在两个石头有相同的半径。
 * 为了使石头的摆放更加美观，现要求摆放的石头的半径从左往右依次递增。
 * 因此，需要对一些石头进行移动，每次操作可以选择一个石头，并把它放在剩下n−1个石头在最左边或最右边。
 * 问最少需要操作多少次才能将这n个石头的半径变成升序？
 *
 * 输入描述
 * 第一行一个整数n，表示石头的个数。(1 <= n <= 100000)
 * 第二行n个整数，表示从左往右石头的半径r1，r2，...，rn。(1 <= ri <= n)，
 * 且保证不存在两个不同的石头拥有相同的半径。
 *
 * 输出描述
 * 最少操作次数
 *
 * 样例输入
 * 5
 * 4 1 2 5 3
 * 样例输出
 * 2
 */
public class MoveStone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int  i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        int[] dp = new int[n + 1];
        int count = 0;
        for (int i : a) {
            dp[i] = dp[i - 1] + 1;
            count = Math.max(dp[i], count);
        }
        System.out.println(n - count);
        in.close();
    }
    public static int half(int n, int[] a){
        int [] b = Arrays.copyOf(a,n);
        Arrays.sort(b);
        int mid = b[n / 2];
        int loc = 0;
        for(int i = 0;i < n; i++){
            if(a[i] == mid) {
                loc = i;
                break;
            }
        }
        int [] small = new int[n/2];
        int [] big = new int[n/2];
        int count = 0;
        int sm = 0;
        int bg = 0;
        for (int i = 0; i < n;i++){
            if (a[i] < mid) {
                small[sm] = a[i];
                sm++;
                if(i > loc) count++;
            }
            else if(a[i] > mid){
                big[bg] = a[i];
                bg++;
                if (i < loc) count++;
            }
        }
        if(n/2 == 2){
            if(small[0] > small[1]) count++;
            if(big[0] > big[1]) count++;
        }
        if (n/2 > 2){
            count += half(n/2,small);
            count += half(n/2,big);
        }
        return count;
    }
}
