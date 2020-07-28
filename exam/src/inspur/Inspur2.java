package inspur;

import java.util.Scanner;

public class Inspur2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n == 0){
            System.out.println(1 + " " + 50);
        }
        int[] a = new int[n];
        for(int  i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        boolean[] up = new boolean[101];
        boolean[] down = new boolean[101];
        for (int  i = 1; i < 101; i++){
            if (i % 2 == 0){
                down[i] = true;
            }
            else up[i] = true;
        }
        for(int  i = 0; i < n; i++){
            if(a[i] % 2 == 0){
                down[a[i]] = false;
            }
            else up[a[i]] = false;
        }

        int start = 0;
        int sum = 0;
        int count = 1;
        while (count < 100){
            int tempSum = 0;
            int tempStart = count;
            while (up[count]){
                tempSum++;
                count = count + 2;
                if(count > 100){
                    break;
                }
            }
            if(sum < tempSum){
                sum = tempSum;
                start = tempStart;
            }
            count = count + 2;
        }
        count = 2;
        while (count < 101){
            int tempSum = 0;
            int tempStart = count;
            while (down[count]){
                tempSum++;
                count = count + 2;
                if(count > 100){
                    break;
                }
            }
            if(sum < tempSum){
                sum = tempSum;
                start = tempStart;
            }
            count = count + 2;
        }
        System.out.println(start+ " " + sum);
    }
}
