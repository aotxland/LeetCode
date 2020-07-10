package array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author AoTxLand
 * @date 2020-05-16 18:18
 */
public class Intersect2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> out = new ArrayList<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]) {
                out.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        int[] outNum = new int[out.size()];
        for(int t = 0; t < out.size();t++){
            outNum[t] = out.get(t);
        }
        return outNum;
    }
}
