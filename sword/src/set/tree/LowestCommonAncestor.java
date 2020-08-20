package set.tree;

import java.lang.annotation.Target;
import java.util.Stack;

/**
 * @author AoTxLand
 * @date 2020-08-20 20:47
 */
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val == q.val) return p;
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        int d1 = findNode(root,p,s1);
        int d2 = findNode(root,q,s2);
        while (d1 < d2) {
            s2.pop();
            d2--;
        }
        while (d2 < d1) {
            s1.pop();
            d1--;
        }
        while (d1 > 0) {
            TreeNode t1 = s1.pop();
            TreeNode t2 = s2.pop();
            if (t1.val == t2.val) return t1;
            d1--;
            d2--;
        }
        return null;
    }

    private int findNode(TreeNode root, TreeNode p, Stack<TreeNode> s1) {
        int deep = 1;
        while (root.val != p.val) {
            s1.push(root);
            deep++;
            if (p.val > root.val) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
        s1.push(p);
        return deep;
    }

    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor2(root.left, p, q);
        TreeNode right = lowestCommonAncestor2(root.right, p, q);
        if(left == null && right == null) return null; // 1.
        if(left == null) return right; // 3.
        if(right == null) return left; // 4.
        return root; // 2. if(left != null and right != null)
    }
}
