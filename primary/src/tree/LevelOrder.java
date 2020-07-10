package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author AoTxLand
 * @date 2020-05-20 21:49
 */
public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return null;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        List<TreeNode> oneList = new ArrayList<>();
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            oneList.add(node);
            if (node == null){
                stack.push(null);
                stack.push(null);
            }
            else{
                if(node.left == null)
                    stack.push(null);
                else stack.push(node.left);
                if(node.right == null)
                    stack.push(node);
                else stack.push(node.right);
            }
        }
        List<List<Integer>> treeList = new ArrayList<>();
        List<Integer> treeLevelList = new ArrayList<>();
        treeLevelList.add(root.val);
        treeList.add(treeLevelList);
        treeLevelList = new ArrayList<>();
        int n = 1;
        for(int i = 1; i < oneList.size(); i++){
            if(oneList.get(i) != null) {
                treeLevelList.add(oneList.get(i).val);
            }
            if(i == Math.pow(2,n)){
                treeList.add(treeLevelList);
                treeLevelList = new ArrayList<>();
            }
        }
        return treeList;
    }
}
