package beike;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author AoTxLand
 * @date 2020-08-11 20:15
 */
public class HangLu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int city = in.nextInt();
        int n = in.nextInt();
        List<Line> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            list.add(new Line(x,y,a,b));
        }
        if (!del(list,n,city)) {
            System.out.println(-1);
            return;
        }
        list.sort(new Comparator<Line>() {
            @Override
            public int compare(Line o1, Line o2) {
                if (o1.z - o2.z > 0) return -1;
                if (o1.z - o2.z < 0) return 1;
                return 0;
            }
        });
        for (int i = n - 1; i > -1; i--) {
            if (del(list,i,city)) {
                list.remove(i);
            }
            if (list.size() <= city - 1) {
                break;
            }
        }
        long sum = 0;
        for (Line line : list) {
            sum += line.z;
        }

        System.out.println((long) (sum % (10e9 + 7)));
    }

    private static boolean del(List<Line> list, int i,int city) {
        boolean[] c = new boolean[city + 1];
        for (int j = 0; j < list.size(); j++) {
            if (j != i) {
                Line line = list.get(j);
                c[line.x] = true;
                c[line.y] = true;
            }
        }
        for (int j = 1; j < city + 1; j++) {
            if (!c[j]) return false;
        }
        return true;
    }

}

class Line {
    int x;
    int y;
    int a;
    int b;
    long z = 1;
    Line(int x, int y, int a, int b){
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
        for (int i = b; i < a + 1; i++) {
            z *= i;
        }
        for (int i = 1; i < b - a + 1; i++) {
            z /= i;
        }
    }
}

/*
 5 5
 1 2 1 1
 1 5 1 1
 3 5 1 1
 2 4 1 1
 4 5 2 1
 */