package ccb;

import java.util.HashMap;
import java.util.Scanner;

public class jiucuo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String u = in.nextLine();
        String[] ss = s.split("\\ ");
        HashMap<String,Integer> map = new HashMap<>();
        for (String sss : ss) {
            map.put(sss,map.get(sss) == null ? 1 :map.get(sss) + 1);
        }
        String[] uu = u.split("\\ ");
        for (int i = 0; i < ss.length; i++) {
            if (!ss[i].equals(uu[i])) {
                System.out.print("[\""+ss[i]+",\""+uu[i]+"]");
                return;
            }
        }
    }
}
