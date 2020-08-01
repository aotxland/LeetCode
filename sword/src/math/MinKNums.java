package math;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author AoTxLand
 * @date 2020-08-01 16:52
 */
public class MinKNums {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0)
            return new int[0];
        Queue<Integer> heap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int num: arr) {
            if (heap.size() < k) {
                heap.offer(num);
            } else if (num < heap.peek()) {
                heap.poll();
                heap.offer(num);
            }
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = heap.poll();
        }
        return res;
    }
}
