package com.lintrip.tree;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author gyt
 * @date 2022/11/23 20:46
 */
public class BM23PreorderTraversalTest {

    BM23PreorderTraversal solution;

    TreeNode treeNode;

    @Before
    public void setUp() throws Exception {
        solution = new BM23PreorderTraversal();
        treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(4);
        treeNode.left.left = new TreeNode(5);
        treeNode.right = new TreeNode(6);
        treeNode.right.right = new TreeNode(7);
    }

    @Test
    public void solution() {
        int[] valueArray = solution.solution(treeNode);
        System.out.println(Arrays.toString(valueArray));
    }
}
