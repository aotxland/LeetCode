package telcom;

import java.util.ArrayList;
import java.util.List;

public class ABCD {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 0; c < 10; c++) {
                    for (int d = 0; d < 10; d++) {
                        int m = a * 1000 + b * 100 + c * 10 + d;
                        int n = b * 1000 + c * 100 + d * 10 + a;
                        if (m + n == 8888) {
                            List<Integer> t = new ArrayList<>();
                            t.add(a);
                            t.add(b);
                            t.add(c);
                            t.add(d);
                            list.add(t);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
                List<Integer> t = list.get(i);
                System.out.println(t.get(0) + " " + t.get(1) + " " + t.get(2) + " " + t.get(3));

        }
    }
}
