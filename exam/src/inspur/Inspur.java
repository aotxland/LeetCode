package inspur;

import java.util.Arrays;
import java.util.Scanner;

public class Inspur {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int  i = 0; i < n; i++){
            a[i] = in.nextInt();
        }

        System.out.println(half(n,a));
        in.close();
    }
    public static int half(int n, int[] a){
        int [] b = Arrays.copyOf(a,n);
        Arrays.sort(b);
        int mid = b[n / 2];
        int loc = 0;
        for(int i = 0;i < n; i++){
            if(a[i] == mid) {
                loc = i;
                break;
            }
        }
        int [] small = new int[n/2];
        int [] big = new int[n/2];
        int count = 0;
        int sm = 0;
        int bg = 0;
        for (int i = 0; i < n;i++){
            if (a[i] < mid) {
                small[sm] = a[i];
                sm++;
                if(i > loc) count++;
            }
            else if(a[i] > mid){
                big[bg] = a[i];
                bg++;
                if (i < loc) count++;
            }
        }
        if(n/2 == 2){
            if(small[0] > small[1]) count++;
            if(big[0] > big[1]) count++;
        }
        if (n/2 > 2){
            count += half(n/2,small);
            count += half(n/2,big);
        }
        return count;
    }
}
