package ctrip;

import java.util.Arrays;
import java.util.Scanner;

public class Assign {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] s1 = s.split(" ");
        int[] members = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            members[i] = Integer.parseInt(s1[i]);
        }
        s = in.nextLine();
        s1 = s.split(" ");
        int[] works = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            works[i] = Integer.parseInt(s1[i]);
        }
        Arrays.sort(members);
        Arrays.sort(works);
        int res = 0;
        int count = 0;
        for (int i = 0; i < members.length; i++) {
            if (count < works.length && members[i] <= works[count]) {
                count++;
                res++;
            } else break;
        }
        if (count == works.length - 1) {
            for (int i = res; i < members.length; i++) {
                if (members[i] <= works[count]) {
                    res++;
                } else break;
            }
        }
        System.out.println(res);
    }
}
