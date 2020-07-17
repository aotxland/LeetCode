package math;

/**
 * @author AoTxLand
 * @date 2020-07-17 21:49
 */
public class PrintNumbersFrom1ToN {
    public int[] printNumbers(int n) {
        int num = (int) (Math.pow(10,n) - 1);
        int[] nums = new int[num];
        for(int i = 0;i < num; i++){
            nums[i] = i + 1;
        }
        return nums;
    }
}
