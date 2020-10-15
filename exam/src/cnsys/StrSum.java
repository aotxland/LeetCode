package cnsys;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class StrSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int res = values(s.toCharArray(),0)[0];
        System.out.println(res);
    }
    public static int[] values(char[] a,int i){
        Deque<String> q = new LinkedList<>();
        int f = 0;
        while (i < a.length && a[i] != ')'){
            if (a[i] >= '0' && a[i] <= '9'){
                f = f * 10 + a[i++] - '0';
            } else if (a[i] != '('){
                add(q,f);
                q.addLast(String.valueOf(a[i++]));
                f = 0;
            } else {
               int[] t = values(a, i + 1);
               f = t[0];
               i = t[1] + 1;
            }
        }
        add(q,f);
        int res = getRes(q);
        return new int[]{res,i};
    }

    private static int getRes(Deque<String> q) {
        int res = 0;
        boolean sym = true;
        while (!q.isEmpty()){
            String c = q.pollFirst();
            if (c.equals("+")){
                sym = true;
            } else if (c.equals("-")){
                sym = false;
            } else {
                res += sym ? Integer.parseInt(c) : -Integer.parseInt(c);
            }
        }
        return res;
    }

    private static void add(Deque<String> q, int f) {
        if (!q.isEmpty()){
            String ss = q.pollLast();
            if (ss.equals("+") || ss.equals("-")){
                q.addLast(ss);
            } else {
                int pn = Integer.parseInt(q.pollLast());
                f = ss.equals("*") ? f * pn : pn / f;
            }
        }
        q.addLast(String.valueOf(f));
    }
}
