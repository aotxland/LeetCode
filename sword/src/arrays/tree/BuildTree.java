package arrays.tree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author AoTxLand
 * @date 2020-07-10 16:46
 */
public class BuildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(inorder.length == 0 || preorder.length == 0) return null;
        return subTree(preorder,inorder);
    }

    public TreeNode subTree(int[] preorder, int[] inorder){
        if(inorder.length == 0 || preorder.length == 0) return null;
        TreeNode root = new TreeNode(inorder[0]);
        if (preorder.length == 1)
            return root;
        int left = 0;
        while(preorder[left] != inorder[0]){
            left++;
        }
        int[] leftIn = Arrays.copyOf(preorder,left);
        int[] leftPre = Arrays.copyOfRange(inorder,1,left + 1);
        int[] rightPre = Arrays.copyOfRange(preorder,left + 1, inorder.length);
        int[] rightIn = Arrays.copyOfRange(inorder,left + 1,inorder.length);
        root.left = subTree(leftPre,leftIn);
        root.right = subTree(rightPre,rightIn);
        return root;
    }

    public TreeNode buildTree2(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
        int length = preorder.length;
        for (int i = 0; i < length; i++) {
            indexMap.put(inorder[i], i);
        }
        TreeNode root = buildTree2(preorder, 0, length - 1, inorder, 0, length - 1, indexMap);
        return root;
    }

    public TreeNode buildTree2(int[] preorder, int preorderStart, int preorderEnd, int[] inorder, int inorderStart, int inorderEnd, Map<Integer, Integer> indexMap) {
        if (preorderStart > preorderEnd) {
            return null;
        }
        int rootVal = preorder[preorderStart];
        TreeNode root = new TreeNode(rootVal);
        if (preorderStart == preorderEnd) {
            return root;
        } else {
            int rootIndex = indexMap.get(rootVal);
            int leftNodes = rootIndex - inorderStart, rightNodes = inorderEnd - rootIndex;
            TreeNode leftSubtree = buildTree2(preorder, preorderStart + 1, preorderStart + leftNodes, inorder, inorderStart, rootIndex - 1, indexMap);
            TreeNode rightSubtree = buildTree2(preorder, preorderEnd - rightNodes + 1, preorderEnd, inorder, rootIndex + 1, inorderEnd, indexMap);
            root.left = leftSubtree;
            root.right = rightSubtree;
            return root;
        }
    }
}

