package Array;

/**
 * @author AoTxLand
 * @date 2020-05-16 17:36
 */
public class RotateArray {
    public void rotate(int[] nums, int k){
        if(k > nums.length)
            k %= nums.length;
        int[] rotate = new int[k];
        System.arraycopy(nums, nums.length - k, rotate, 0, k);
        System.arraycopy(nums,0,nums,k,nums.length - k);
        System.arraycopy(rotate,0,nums,0,k);
    }

    public static void main(String[] args) {
        RotateArray ra = new RotateArray();
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        ra.rotate(nums,k);
        for (int i : nums)
            System.out.print(i + " ");
    }
}
