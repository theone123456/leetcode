package simple;

import utils.ListNode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * 删除有序列表中的重复元素
 *
 * 理论上逻辑关系连接也能做
 * 但是用队列和集合方便理解
 */

public class RemoveDuplicatesFromSortedList_0083 {
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        LinkedList<ListNode> list = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        while (head != null){
            if (!set.contains(head.val)){
                set.add(head.val);
                list.add(new ListNode(head.val));
            }
            head = head.next;
        }
        ListNode ret = list.pollFirst();
        ListNode temp = ret;
        while (!list.isEmpty()){
            temp.next = list.pollFirst();
            temp = temp.next;
        }
        return ret;
    }
}
