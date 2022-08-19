package com.lintrip.util;

import com.lintrip.linkedList.ListNode;

/**
 * 数组工具类
 *
 * @author kakakeven
 * @date 2021/8/20 14:55
 */
public class ArrayUtil {

    public static int[] splitToIntArray(String nums) {
        String[] numStrArray = nums.split(",");
        int[] numsArray = new int[numStrArray.length];
        for (int i = 0; i < numStrArray.length; i++) {
            numsArray[i] = Integer.parseInt(numStrArray[i]);
        }
        return numsArray;
    }

    public static ListNode convertToListNode(int[] array) {
        ListNode listNode = new ListNode(-1);
        ListNode p = listNode;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            ListNode newNode = new ListNode(value);
            p.next = newNode;
            p = p.next;
        }
        return listNode.next;
    }

    public static ListNode arrayToListNode(int[] s) {
        ListNode root = new ListNode(s[0]);
        ListNode other = root;
        for (int i = 1; i < s.length; i++) {
            ListNode temp = new ListNode(s[i]);
            other.next = temp;
            other = temp;
        }
        return root;
    }
}
