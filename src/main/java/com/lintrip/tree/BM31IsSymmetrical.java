package com.lintrip.tree;

/**
 * @author gyt
 * @date 2022/11/29 11:59
 */
public class BM31IsSymmetrical {
    boolean isSymmetrical(TreeNode pRoot) {
        if (null == pRoot) {
            return true;
        }
        return isSymmetrical(pRoot.left,pRoot.right);
    }

    private boolean isSymmetrical(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return isSymmetrical(left.left,right.right) && isSymmetrical(left.right,right.left);
    }
}
