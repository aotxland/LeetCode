package iqiyi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author AoTxLand
 * @date 2020-08-23 15:28
 * 判断路径是否相交
 * 时间限制： 3000MS
 * 内存限制： 589824KB
 * 题目描述：
 * 给你一个字符串 path，其中 path[i] 的值可以是 'N'、'S'、'E' 或者 'W'，分别表示向北、向南、向东、向西移动一个单位。机器人从二维平面上的原点 (0, 0) 处开始出发，按 path 所指示的路径行走。如果路径在任何位置上出现相交的情况，也就是走到之前已经走过的位置，请返回 True ；否则，返回 False 。
 *
 * 输入描述
 * 一个字符串 path，其中 path[i] 的值可以是 'N'、'S'、'E' 或者 'W'，分别表示向北、向南、向东、向西移动一个单位。
 *
 * 输出描述
 * 如果路径在任何位置上出现相交的情况，也就是走到之前已经走过的位置，请返回 True ；否则，返回 False 。
 */
public class PathIsCross {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] path = s.toCharArray();
        Map<Point,Boolean> map = new HashMap<>();
        Point move = new Point();
        map.put(move, true);
        for (int i = 0; i < path.length; i++) {
            if (path[i] == 'W') {
                move.setXY(move.x - 1, move.y);
            }
            if (path[i] == 'E') {
                move.setXY(move.x + 1, move.y);
            }
            if (path[i] == 'N') {
                move.setXY(move.x, move.y + 1);
            }
            if (path[i] == 'S') {
                move.setXY(move.x, move.y - 1);
            }
            if (map.containsKey(move)) {
                System.out.println("True");
                return;
            }
            map.put(move,true);
        }
        System.out.println("False");
    }
}

class Point{
    int x;
    int y;

    Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    Point(){
        x = 0;
        y = 0;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
