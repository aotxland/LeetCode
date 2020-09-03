package qianxin;

public class ChaiQian {
    public int house (int[] person) {
        int[] h = new int[person.length];
        for (int i = 0; i < person.length; i++) {
            h[i] = 1;
        }
        if (person[0] > person[1]) h[0]++;
        for (int i = 0; i < person.length; i++) {
            if (i != 0 && person[i] > person[i - 1]) {
                h[i] = h[i - 1] + 1;
            }
            /*if (i < person.length - 1 && person[i] < person[i + 1]){
                h[i]++;
            }*/

        }
        int res = 0;
        for (int i = 0; i < person.length; i++) {
            res += h[i];
        }
        return res;
    }
}
