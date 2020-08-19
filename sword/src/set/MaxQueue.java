package set;

import java.util.LinkedList;

/**
 * @author AoTxLand
 * @date 2020-08-19 19:50
 */
public class MaxQueue {
    LinkedList<Integer> list;
    LinkedList<Integer> max;
    public MaxQueue() {
        list = new LinkedList<>();
        max = new LinkedList<>();
    }

    public int max_value() {
        if (max.isEmpty()) return -1;
        return max.get(0);
    }

    public void push_back(int value) {
        list.add(value);
        while (max.size() != 0 && max.getLast() < value) {
            max.removeLast();
        }
        max.add(value);
    }

    public int pop_front() {
        if (list.isEmpty()) return -1;
        if (max.size() != 0 && list.peek().equals(max.getFirst()))
            max.removeFirst();
        return list.pop();
    }
}
