package com.lintrip.tree;

/**
 * @author gyt
 * @date 2022/11/29 12:10
 */
public class BM32MergeTrees {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        TreeNode node = new TreeNode(t1.val + t2.val);
        node.left = mergeTrees(t1.left, t2.left);
        node.right = mergeTrees(t2.right, t2.right);
        return node;
    }
}
