package iqiyi;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author AoTxLand
 * @date 2020-08-23 15:48
 *
 * 判断字符串括号是否有效
 * 时间限制： 3000MS
 * 内存限制： 589824KB
 * 题目描述：
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 1. 左括号必须用相同类型的右括号闭合。
 * 2. 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 输入描述
 * 一个字符串，仅包含括号'('，')'，'{'，'}'，'['，']'
 *
 * 输出描述
 * 如果字符串验证有效，返回 True
 * 如果字符串验证无效，返回 False
 */
public class QuarterIsRight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] cs = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c: cs){
            if (!stack.empty()) {
                Character p = stack.peek();
                if (p == '(' && c == ')') {
                    stack.pop();
                }
                else if (p == '[' && c == ']') {
                    stack.pop();
                }
                else if (p == '{' && c == '}') {
                    stack.pop();
                }
                else if (c == '(' && (p == '[' || p == '{')) {
                    stack.push(c);
                }
                else if (c == '[' && ( p == '{')) {
                    stack.push(c);
                }
                else {
                    System.out.println("False");
                    return;
                }
            }
            else stack.push(c);
        }
        if (stack.empty()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
