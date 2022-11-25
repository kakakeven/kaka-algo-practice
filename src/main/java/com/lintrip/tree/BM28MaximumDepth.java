package com.lintrip.tree;

public class BM28MaximumDepth {

    public int maxDepth (TreeNode treeNode) {
        if (null == treeNode) {
            return 0;
        }
        int leftDepth = maxDepth(treeNode.left);
        int rightDepth = maxDepth(treeNode.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
