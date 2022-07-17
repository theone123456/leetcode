package simple;

import utils.ListNode;

/**
 * 将两个非降序链表合并成一个新的非降序链表并返回
 */

public class MergeTwoSortedLists_0021 {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(-9);
        list1.next = new ListNode(3);

        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(7);

        ListNode node = mergeTwoLists(list1, list2);
        while (node != null){
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null){
            return null;
        }else if (list1 == null){
            return list2;
        }else if (list2 == null){
            return list1;
        }

        ListNode node = null;
        ListNode ret = null;
        if (list1.val >= list2.val) {
            node = new ListNode(list2.val);
            list2 = list2.next;
        }else {
            node = new ListNode(list1.val);
            list1 = list1.next;
        }
        ret = node;

        while (list1 != null && list2 != null){
            if(list1.val >= list2.val){
                node.next = new ListNode(list2.val);
                list2 = list2.next;
                node = node.next;
            }else {
                node.next = new ListNode(list1.val);
                list1 = list1.next;
                node = node.next;
            }
        }

        while (list1 != null){
            node.next = new ListNode(list1.val);
            node = node.next;
            list1 = list1.next;
        }

        while (list2 != null){
            node.next = new ListNode(list2.val);
            node = node.next;
            list2 = list2.next;

        }
        return ret;
    }
}
