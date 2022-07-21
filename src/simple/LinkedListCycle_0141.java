package simple;

import utils.ListNode;

/**
 * 判断单链表是否存在环
 *
 * 快慢指针，一个一次走一步，一个走两步，相遇则又环
 */

public class LinkedListCycle_0141 {
    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode quick = head;
        while (quick.next != null && quick.next.next != null){
            slow = slow.next;
            quick = quick.next.next;
            if (slow == quick) return true;
        }
        return false;
    }
}
