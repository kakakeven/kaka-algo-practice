package com.lintrip.tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @author gyt
 * @date 2022/11/25 16:52
 */
public class BM27PrintZTest {

    BM27PrintZ solution = new BM27PrintZ();

    TreeNode treeNode;

    @Before
    public void setUp() throws Exception {
        solution = new BM27PrintZ();
        treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.right = new TreeNode(3);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(7);
    }

    @Test
    public void testPrint() throws Exception {
        ArrayList<ArrayList<Integer>> result = solution.Print(treeNode);
        System.out.println(result);
    }
}
