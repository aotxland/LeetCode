package set.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author AoTxLand
 * @date 2020-07-24 15:44
 */
public class ListTree {
    public int[] levelOrder(TreeNode root) {
        List<TreeNode> node = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        node.add(root);
        while (!node.isEmpty()){
            TreeNode t = node.remove(0);
            if(t != null){
                list.add(t.val);
                if(t.left != null)
                    node.add(t.left);
                if(t.right != null)
                    node.add(t.right);
            }
        }
        int[] out = new int[list.size()];
        for (int i = 0; i < list.size();i++){
            out[i] = list.get(i);
        }
        return out;
    }
    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<TreeNode> node = new ArrayList<>();
        List<List<Integer>> out = new ArrayList<>();
        if (root != null) node.add(root);
        while (!node.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int n = node.size();
            for (int i = 0; i < n;i++){
                TreeNode t = node.remove(0);
                level.add(t.val);
                if(t.left != null)
                    node.add(t.left);
                if(t.right != null)
                    node.add(t.right);
            }
            out.add(level);
        }
        return out;
    }
    public List<List<Integer>> levelOrder3(TreeNode root) {
        List<TreeNode> node = new ArrayList<>();
        List<List<Integer>> out = new ArrayList<>();
        if (root != null) node.add(root);
        int count = 0;
        while (!node.isEmpty()){
            count ++;
            List<Integer> level = new ArrayList<>();
            int n = node.size();
            for (int i = 0; i < n;i++){
                TreeNode t = node.remove(0);
                level.add(t.val);
                if(t.left != null)
                    node.add(t.left);
                if(t.right != null)
                    node.add(t.right);
            }
            if (count % 2 == 0){
                List<Integer> level2 = new ArrayList<>();
                for (int i = level.size() - 1; i >= 0; i--){
                    level2.add(level.get(i));
                }
                out.add(level2);
            } else {
                out.add(level);
            }
        }
        return out;
    }
}
