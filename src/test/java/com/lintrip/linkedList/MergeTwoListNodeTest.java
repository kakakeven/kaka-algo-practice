package com.lintrip.linkedList;

import com.lintrip.util.ArrayUtil;
import org.junit.Test;

/**
 * @author kakakeven
 * @date 2021/8/20 14:51
 */
public class MergeTwoListNodeTest {

    @Test
    public void testSolution(){
        int[] numArray1 = new int[]{3,6,9};
        int[] numArray2 = new int[]{2,4,7};
        ListNode node1 = ArrayUtil.convertToListNode(numArray1);
//        System.out.println(node1);
        ListNode node2 = ArrayUtil.convertToListNode(numArray2);
//        System.out.println(node2);
        ListNode result = new MergeTwoListNode().solution(node1,node2);
        System.out.println(result);
    }

    @Test
    public void testSolution1(){
        int[] numArray1 = new int[]{3,6,9};
        int[] numArray2 = new int[]{2,4,7};
        ListNode node1 = ArrayUtil.arrayToListNode(numArray1);
        System.out.println(node1);
    }


}
