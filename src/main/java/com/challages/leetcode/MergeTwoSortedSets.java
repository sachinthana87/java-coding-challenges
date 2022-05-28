package com.challages.leetcode;

public class MergeTwoSortedSets {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2, new ListNode(4));

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3, new ListNode(4));

        ListNode result = mergeTwoLists(list1, list2);
        if(result != null) {
            System.out.println(result.val);
            while (result.next != null) {
                System.out.println(result.next.val);
                result = result.next;
            }
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode listNode = null;
        if(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                if (listNode == null) listNode = list1; else listNode.next = list1;
                list1 = list1.next;
            }else if (list1.val > list2.val) {
                if (listNode == null) listNode = list2; else listNode.next = list2;
                list2 = list2.next;
            }
        }else if (list1 != null) return list1;
        else return list2;
        return listNode;
    }
}
 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
