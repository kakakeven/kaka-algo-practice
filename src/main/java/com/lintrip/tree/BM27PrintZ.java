package com.lintrip.tree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author gyt
 * @date 2022/11/25 16:40
 */
public class BM27PrintZ {

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (null == pRoot) {
            return result;
        }
        Stack<TreeNode> leftToRight = new Stack<>();
        Stack<TreeNode> rightToLeft = new Stack<>();
        leftToRight.push(pRoot);
        while (!leftToRight.isEmpty() || !rightToLeft.isEmpty()) {
            Stack<TreeNode> toOperate = leftToRight.isEmpty() ? rightToLeft : leftToRight;
            boolean isLeftToRight = !leftToRight.isEmpty();
            ArrayList<Integer> level = new ArrayList<>();
            int num = toOperate.size();
            for (int i = 0; i < num; i++) {
                TreeNode node = toOperate.peek();
                if (isLeftToRight) {
                    if (null != node.left) {
                        rightToLeft.push(node.left);
                    }
                    if (null != node.right) {
                        rightToLeft.push(node.right);
                    }
                } else {
                    if (null != node.right) {
                        leftToRight.push(node.right);
                    }
                    if (null != node.left) {
                        leftToRight.push(node.left);
                    }
                }
                level.add(toOperate.pop().val);
            }
            result.add(level);
        }
        return result;
    }
}
