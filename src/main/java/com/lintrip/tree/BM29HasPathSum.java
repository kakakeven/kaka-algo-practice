package com.lintrip.tree;

/**
 * @author gyt
 * @date 2022/11/25 17:20
 */
public class BM29HasPathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null && sum == root.val) {
            return true;
        }
        boolean leftHasPathSum = false;
        boolean rightHasPathSum = false;
        if (root.left != null) {
            leftHasPathSum = hasPathSum(root.left, sum - root.val);
        }
        if (root.right != null) {
            rightHasPathSum = hasPathSum(root.right, sum - root.val);
        }
        return leftHasPathSum || rightHasPathSum;
    }
}
