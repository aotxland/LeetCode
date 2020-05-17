package Array;

import com.sun.tools.javac.Main;

/**
 * @author AoTxLand
 * @date 2020-05-16 17:06
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums){
        int len = 1;
        int n = nums.length;
        if(n <= 1) return n;
        for(int i = 1; i < n; i++){
            if(nums[i] != nums[len - 1]){
                nums[len] = nums[i];
                len++;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        RemoveDuplicates rd = new RemoveDuplicates();
        int[] nums = {0,0,1,1,2,4,4,6,6};
        int len = rd.removeDuplicates(nums);
        for(int i = 0 ; i < len; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
