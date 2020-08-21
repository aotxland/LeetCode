package didi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author AoTxLand
 * @date 2020-08-21 19:23
 * 最终排名
 * 时间限制： 3000MS
 * 内存限制： 589824KB
 * 题目描述：
 * 一年一度的X星人田径运动会隆重开幕。小小X报名参加了跳跃比赛，这可是小小X最擅长的项目！跳跃比赛分为两轮，一轮是跳高，一轮是跳远。最终成绩将综合两轮比赛的成绩来确定，并且两轮比赛成绩在最终成绩的计算中各占一半权重。
 * 现在已经知道小小X在跳高和跳远两轮比赛中分别的排名情况，现在请你编写一个程序帮小小X计算一下在最终成绩排名中小小X可以获得的最好名次和最差名次。
 *
 * 输入描述
 * 每组输入包含一个测试样例，每个测试样例包含3行。
 * 第一行输入n，表示参赛人数（n<=26）。
 * 第二行输入n个不重复的大写字母，表示n个人按跳高成绩从最好到最差的排名。
 * 第三行输入n个不重复的大写字母，表示n个人按跳远成绩从最好到最差的排名。
 * 【每个字符对应一个参赛者，不存在排名相同的情况，其中X表示小小X，两个字符之间用空格隔开。】
 *
 * 输出描述
 * 输出一行，包含两个数分别为小小X在最终排名中的最好名次和最差名次，两个数之间用空格隔开。
 * 样例输入
 * 10
 * A B C D E F X H I J
 * A C I X E F J H D B
 * 样例输出
 * 3 8
 *
 * 提示
 * 样例解释:
 * 两项比赛中，A、C排名均在小小X前，故小小X的最终排名最好是第三名
 * 两项比赛中，J、H排名均在小小X后，故小小X的最终排名至少是第八名
 */
public class SportMatch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s1 = in.nextLine();
        s1 = in.nextLine();
        String[] cs1 = s1.split("\\ ");
        String s2 = in.nextLine();
        String[] cs2 = s2.split("\\ ");
        Map<String,Integer> good = new HashMap<>();
        Map<String,Integer> bed = new HashMap<>();
        int i = 0;
        while (i < cs1.length && !"X".equals(cs1[i])) {
            good.put(cs1[i],1);
            i++;
        }
        int x1 = i;
        i = 0;
        while (i < cs2.length && !"X".equals(cs2[i])) {
            if (good.containsKey(cs2[i])) {
                good.put(cs2[i],2);
            } else good.put(cs2[i],1);
            i++;
        }
        int x2 = i;
        int goodno = 0;
        for (Map.Entry<String,Integer> m : good.entrySet()) {
            if (m.getValue() == 2) {
                goodno++;
            }
        }
//bed
        i = x1 + 1;
        while (i < cs1.length) {
            bed.put(cs1[i],1);
            i++;
        }
        i = x2 + 1;
        while (i < cs2.length) {
            if (bed.containsKey(cs2[i])) {
                bed.put(cs2[i],2);
            } else bed.put(cs2[i],1);
            i++;
        }
        int bedno = 0;
        for (Map.Entry<String,Integer> m : bed.entrySet()) {
            if (m.getValue() == 2) {
                bedno++;
            }
        }
        System.out.println((goodno + 1)+" " + (n - bedno));
    }
}
