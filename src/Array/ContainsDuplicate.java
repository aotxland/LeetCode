package Array;

import java.util.HashMap;

/**
 * @author AoTxLand
 * @date 2020-05-16 17:50
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Boolean> hashMap = new HashMap<>();
        for(int i : nums){
            if(hashMap.containsKey(i))
                return true;
            hashMap.put(i,true);
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] nums = {1,2,3,1};
        boolean b = cd.containsDuplicate(nums);
        System.out.println(b);
    }
}
