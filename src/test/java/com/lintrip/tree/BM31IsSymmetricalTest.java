package com.lintrip.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author gyt
 * @date 2022/11/29 12:05
 */
public class BM31IsSymmetricalTest {
    BM31IsSymmetrical solution;

    TreeNode treeNode;

    @Before
    public void setUp() throws Exception {
        solution = new BM31IsSymmetrical();
        treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(4);
        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(4);
        treeNode.right.right = new TreeNode(3);
    }

    @Test
    public void testIsSymmetrical() throws Exception {
        boolean result = solution.isSymmetrical(treeNode);
        Assert.assertEquals(true, result);
    }
}