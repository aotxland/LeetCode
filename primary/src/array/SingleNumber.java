package array;

/**
 * @author AoTxLand
 * @date 2020-05-16 18:03
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}
