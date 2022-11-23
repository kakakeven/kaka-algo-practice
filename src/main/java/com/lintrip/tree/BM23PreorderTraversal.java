package com.lintrip.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * BM23 二叉树的前序遍历
 *
 * @author gyt
 * @date 2022/11/23 20:38
 */
public class BM23PreorderTraversal {

    public int[] solution(TreeNode treeNode) {
        List<Integer> valueList = new ArrayList<>();
        traversal(valueList,treeNode);
        int[] valueArray = new int[valueList.size()];
        int i = 0;
        for (Integer value : valueList) {
            valueArray[i++] = value;
        }
        return valueArray;
    }

    private void traversal(List<Integer> valueList, TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        valueList.add(treeNode.val);
        traversal(valueList, treeNode.left);
        traversal(valueList, treeNode.right);
    }
}
