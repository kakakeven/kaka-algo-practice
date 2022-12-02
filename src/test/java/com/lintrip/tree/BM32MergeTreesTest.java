package com.lintrip.tree;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author gyt
 * @date 2022/11/29 12:14
 */
public class BM32MergeTreesTest {

    BM32MergeTrees bM32MergeTrees = new BM32MergeTrees();

    @Test
    public void testMergeTrees() throws Exception {
        TreeNode result = bM32MergeTrees.mergeTrees(new TreeNode(0), new TreeNode(0));
        Assert.assertEquals(new TreeNode(0), result);
    }
}