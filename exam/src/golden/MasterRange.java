package golden;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author AoTxLand
 * @date 2020-07-28 15:49
 * 作者：Sun浅雨
 * 链接：https://www.nowcoder.com/discuss/457660?type=post&order=time&pos=&page=1&channel=666&source_id=search_post
 * 来源：牛客网
 *
 * 3、范围攻击
 * 题目描述： 在一个2D横版游戏中，所有的怪物都是在X轴上的，每个怪物有两个属性X和HP，分别代表怪物的位置和生命值。
 * 玩家控制的角色有一个AOE（范围攻击）技能，玩家每次释放技能可以选择一个位置x，技能会对[x-y,x+y]范围内的所有怪物造成1点伤害，请问，玩家最少需要使用多少次技能，才能杀死所有怪物，怪物血量清0即视为被杀死。
 *
 * 输入描述
 * 输入第一行包含一个两个正整数n和y，分别表示怪物的数量和技能的范围。（1<=n<=100000）
 * 接下来有n行，每行有两个正整数x和hp分别表示一只怪物的位置和血量。(1<=x,hp<=10^9)
 *
 * 输出描述
 * 输出仅包含一个整数，表示最少使用的技能次数。
 *
 * 样例输入
 * 3 5
 * 1 10
 * 10 5
 * 22 3
 *
 * 样例输出
 * 13
 */
public class MasterRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int y = in.nextInt();
        int[][] a = new int[n][2];
        for(int i = 0; i < n; i++) {
            a[i][0] = in.nextInt();
            a[i][1] = in.nextInt();
        }
        Arrays.sort(a, new Comparator<>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o1[1];
            }
        });
        int i = 0;
        int hits = 0;
        while (i < n) {
            int hit = a[i][1];
            hits += hit;
            a[i][1] = 0;
            int j = i + 1;
            while (j<n && a[j][0] <= a[i][0] + 2 * y) {
                a[j][1] -= hit;
                j++;
            }
            while (i<n && a[i][1] <= 0) {
                i++;
            }
        }
        System.out.println(hits);
    }
}
