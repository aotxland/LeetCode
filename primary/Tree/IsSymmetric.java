package Tree;

import java.util.Stack;

/**
 * @author AoTxLand
 * @date 2020-05-19 10:52
 */
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(root == null || stack.isEmpty()){
            TreeNode node = stack.pop();

        }
        return false;
    }
}
