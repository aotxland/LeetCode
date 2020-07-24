package set;

import java.util.Stack;

/**
 * @author AoTxLand
 * @date 2020-07-24 15:19
 */
class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> stack;
    Stack<Integer> mins;
    public MinStack() {
        stack = new Stack<>();
        mins = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        int min;
        if (mins.isEmpty()){
            min = Integer.MAX_VALUE;
        } else {
            min = mins.peek();
        }
        if (x < min) {
            min = x;
        }
        mins.push(min);
    }

    public void pop() {
        stack.pop();
        mins.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return mins.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
