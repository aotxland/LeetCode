package baidu;

/**
 * @author AoTxLand
 * @date 2020-08-03 19:26
 */
public class Sort extends Thread{
    int[] a;
    int max = 0;

    Sort(int[] a){
        this.a = a;
    }



    public int sorts(int[] a) {
        
        int n = a.length;
        for (int i = 0; i < n;i++){
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        return (a[n - 1]);
    }

    @Override
    public synchronized void run() {
        max = sorts(a);
    }
}
