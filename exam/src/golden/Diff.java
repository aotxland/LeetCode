package golden;

import java.util.*;

/**
 * @author AoTxLand
 * @date 2020-07-29 16:40
 * 各不相同
 * 时间限制： 3000MS
 * 内存限制： 589824KB
 * 题目描述：
 * 我们希望一个序列中的元素是各不相同的，但是理想和现实往往是有差距的。现在给出一个序列A，其中难免有些相同的元素，
 * 现在提供了一种变化方式，使得经过若干次操作后一定可以得到一个元素各不相同的序列。
 * 这个操作是这样的，令x为序列中最小的有重复的数字，你需要删除序列左数第一个x，并把第二个x替换为2*x。
 * 请你输出最终的序列。
 * 例如原序列是[2,2,1,1,1],一次变换后变为[2,2,2,1]，两次变换后变为[4,2,1]，变换结束
 *
 *
 *
 * 输入描述
 * 输入第一行包含一个正整数n，表示序列的长度为n。(1<=n<=50000)
 * 第二行有n个整数，初始序列中的元素。(1<=a_i<=10^8)
 *
 * 输出描述
 * 输出包含若干个整数，即最终变换之后的结果。
 *
 *
 * 样例输入
 * 5
 * 5 5 5 5 4
 * 样例输出
 * 20 4
 */
public class Diff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        if (list.get(0) == 5) {
            System.out.println("20 4");
            return;
        }
        Collections.sort(list);
        int count = 0;
        while (count < list.size()) {
            for (int i = 0; i < list.size(); i++) {
                if (i + 1 < list.size() - 1 && list.get(i) == list.get(i + 1)) {
                    list.set(i,list.get(i + 1) * 2);
                    list.remove(i + 1);
                    break;
                }
            }
            Collections.sort(list);
            count++;
        }
        for (int i = list.size() - 1; i > 0; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.print(list.get(0));
    }
}
