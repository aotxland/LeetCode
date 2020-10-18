package cmcc;

import java.util.*;

public class HairCut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (in.hasNextInt()) {
            list.add(in.nextInt());
        }
        int[][] a = new int[list.size() / 3][2];
        for (int i = 0; i < list.size() / 3; i++) {
            a[i][0] = list.get(i);
            a[i][1] = list.get(i + list.size() / 3 *2);
            //a[i][2] = list.get(i + 10);
            if (list.get(i + list.size() / 3) == 1) {
                a[i][1] += 100;
            }
        }
        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                    return o2[1] - o1[1];
            }
        });
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i][0] + " ");
        }
        System.out.println(a[a.length - 1][0]);
    }
}
