package set.tree;

import java.util.Arrays;

/**
 * @author AoTxLand
 * @date 2020-07-24 16:25
 */
public class VerifyPostorder {
    public boolean verifyPostorder(int[] postorder) {
        if (postorder.length <= 1) return true;
        int small = 0;
        for (int i = 0; i < postorder.length - 1; i++){
            if (postorder[i] < postorder[postorder.length - 1]){
                small++;
            }
            else break;
        }
        for (int i = small; i < postorder.length - 1; i++){
            if (postorder[i] < postorder[postorder.length - 1]){
                return false;
            }
        }
        return verifyPostorder(Arrays.copyOf(postorder,small))
                && verifyPostorder(Arrays.copyOfRange(postorder,small,postorder.length - 1));
    }
}
