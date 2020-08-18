package set.tree;

/**
 * @author AoTxLand
 * @date 2020-08-18 22:26
 */
public class IsBalancedTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(dfs(root.left) - dfs(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int dfs(TreeNode root) {
        if (root == null) return 0;
        return Math.max(dfs(root.left),dfs(root.right)) + 1;
    }
}
