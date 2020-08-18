package set.tree;

/**
 * @author AoTxLand
 * @date 2020-08-18 22:21
 */
public class TreeMaxDepth {
    public int maxDepth(TreeNode root) {
        return dfs(root);
    }

    private int dfs(TreeNode root) {
        if (root == null) return 0;
        return Math.max(dfs(root.left),dfs(root.right)) + 1;
    }
}
