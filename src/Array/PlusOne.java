package Array;

/**
 * @author AoTxLand
 * @date 2020-05-16 19:12
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1] ++;
        int n = digits.length - 1;
        while(n >= 0 && digits[n] > 9){
            n--;
            if(n >= 0) {
                digits[n + 1] = 0;
                digits[n]++;
            }
        }
        if(digits[0] < 10) return digits;
        int[] digitsP = new int[digits.length + 1];
        System.arraycopy(digits,0,digitsP,1,digits.length);
        digitsP[0] = 1;
        digitsP[1] = 0;
        return digitsP;
    }

    public static void main(String[] args) {
        int[] digits = {9, 9};
        PlusOne po = new PlusOne();
        int[] plusOne = po.plusOne(digits);
        for(int i:plusOne)
            System.out.print(i);
    }
}
