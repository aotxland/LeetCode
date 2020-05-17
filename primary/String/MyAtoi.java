package String;

import java.util.HashMap;
import java.util.Map;

/**
 * @author AoTxLand
 * @date 2020-05-17 15:36
 */
public class MyAtoi {
    // 确定有限状态自动机，状态枚举
    enum DFA {
        START,
        SIGNED,
        NUMBER,
        END;
    }

    class Automaton {

        // 自动机初始状态
        private DFA state = DFA.START;

        // 记录状态流转
        private Map<DFA, DFA[]> map;

        // 记录符号位
        private char sign = '+';

        // 记录结果
        private int result = 0;

        // 判断终止条件
        private boolean flag = true;

        public Automaton() {
            map = new HashMap<>();
            map.put(DFA.START, new DFA[]{DFA.START, DFA.SIGNED, DFA.NUMBER, DFA.END});
            map.put(DFA.SIGNED, new DFA[]{DFA.END, DFA.END, DFA.NUMBER, DFA.END});
            map.put(DFA.NUMBER, new DFA[]{DFA.END, DFA.END, DFA.NUMBER, DFA.END});
            map.put(DFA.END, new DFA[]{DFA.END, DFA.END, DFA.END, DFA.END});
        }

        public int getResult() {
            return result;
        }

        public boolean getFlag() {
            return flag;
        }

        // 处理状态变化
        public int getIndex(char c) {
            if (c == ' ') return 0;
            if (c == '+' || c == '-') return 1;
            if (c >= '0' && c <= '9') return 2;
            return 3;
        }

        // 计算当前结果
        public void getInteger(char c) {

            // 跟踪当前状态
            state = map.get(state)[getIndex(c)];

            switch (state) {

                // 注意溢出判断
                case NUMBER:
                    if (sign == '+' && (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && c - '0' > 7))) {
                        result = Integer.MAX_VALUE;
                        flag = false;
                        break;
                    } else if (sign == '-' && (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && c - '0' > 8))) {
                        result = Integer.MIN_VALUE;
                        flag = false;
                        break;
                    }
                    result = (sign == '+') ? (result * 10 + c - '0') : (result * 10 - (c - '0'));
                    break;

                case SIGNED:
                    sign = c;
                    break;

                case END:
                    flag = false;
                    break;

                default:
                    break;
            }

        }
    }

    // 字符串转换整数
    public int myAtoi(String str) {

        // 特殊情况处理
        if (str == null || str.length() == 0) {
            return 0;
        }

        Automaton automaton = new Automaton();

        for (int i = 0; i < str.length(); i++) {
            if (automaton.getFlag()) {
                automaton.getInteger(str.charAt(i));
            } else {
                break;
            }
        }

        return automaton.getResult();
    }

    public static void main(String[] args) {
        MyAtoi ma = new MyAtoi();
        System.out.println(ma.myAtoi("4193 with words"));
    }
}
