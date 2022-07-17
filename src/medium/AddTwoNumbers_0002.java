package medium;

import utils.ListNode;

/**
 * 求两个单链表表示数据的和
 *
 * 队列+BigDecimal
 * 用基本数据类型会超出容量
 */

import java.math.BigDecimal;
import java.util.LinkedList;

public class AddTwoNumbers_0002 {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        while (l1 != null){
            list1.addFirst(l1.val);
            l1 = l1.next;
        }
        while (l2 != null){
            list2.addFirst(l2.val);
            l2 = l2.next;
        }
        String s1 = "";
        while (!list1.isEmpty()){
            s1 += list1.pollFirst();
        }
        String s2 = "";
        while (!list2.isEmpty()){
            s2 += list2.pollFirst();
        }
        BigDecimal ret = new BigDecimal(s1).add(new BigDecimal(s2));
        char[] chars = ret.toString().toCharArray();
        ListNode node = new ListNode(chars[chars.length - 1] - 48);
        ListNode temp = node;
        for (int i = chars.length - 2;i >= 0;i--){
            temp.next = new ListNode(chars[i] - 48);
            if (i != chars.length - 1){
                temp = temp.next;
            }
        }
        return node;
    }
}
