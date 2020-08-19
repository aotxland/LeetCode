package set;

import java.util.ArrayList;
import java.util.List;

/**
 * @author AoTxLand
 * @date 2020-08-19 10:22
 */
public class FindContinuousSequence {
    public int[][] findContinuousSequence(int target) {
        List<int[]> list = new ArrayList<>();
        int left = 1, right = 1;
        int sum = 0;
        while (left < target / 2 + 1) {
            if (sum > target) {
                sum -= left;
                left++;
            }
            if (sum < target) {
                sum += right;
                right++;
            }
            if (sum == target) {
                int[] a = new int[right - left];
                for (int i = 0; i < right - left; i++) {
                    a[i] = i + left;
                }
                sum -= left;
                left++;
                list.add(a);
            }
        }
        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        FindContinuousSequence findContinuousSequence = new FindContinuousSequence();
        int[][] continuousSequence = findContinuousSequence.findContinuousSequence(9);
        for (int[] ints : continuousSequence) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
