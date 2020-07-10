package tree;

/**
 * @author AoTxLand
 * @date 2020-05-19 10:52
 */
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        if(root.left !=null && root.right != null)
            return nodeSymmetric(root.left,root.right);
        else if(root.right == root.left)
            return true;
        return false;
    }
    public boolean nodeSymmetric(TreeNode t1,TreeNode t2) {
        if (t1.val == t2.val) {
            boolean flag = true;
            if (t1.right != null && t2.left != null)
                flag = nodeSymmetric(t1.right, t2.left);
            else if(t1.right != t2.left) return false;
            if (!flag) return false;
            if (t1.left != null && t2.right != null)
                flag = nodeSymmetric(t1.left, t2.right);
            else if(t1.left != t2.right) return false;
            return flag;
        } else return false;
    }
}
