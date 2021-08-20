package com.lintrip.linkedList;

public class MergeTwoListNode {

    public ListNode solution(ListNode node1, ListNode node2) {
        ListNode result = new ListNode(-1);
        ListNode p = result;
        ListNode p1 = node1;
        ListNode p2 = node2;
        while (p1 !=null && p2 != null){
            if (p1.val > p2.val) {
                p.next = p2;
                p2 = p2.next;
            } else {
                p.next = p1;
                p1 = p1.next;
            }
            p = p.next;
        }
        if (p1 != null) {
            p.next = p1;
        }
        if (p2 != null) {
            p.next = p2;
        }
        return result.next;
    }
}
