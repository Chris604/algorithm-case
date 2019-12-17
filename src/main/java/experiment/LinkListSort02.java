package experiment;

import java.util.LinkedList;
import java.util.List;

// 反转链表
public class LinkListSort02 {

    // 递归
    private static ListNode reverseList(ListNode head){
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }


    // 非递归
    private static ListNode revList(ListNode head){
        if (head == null || head.next == null){ return head; }

        ListNode curr = head;
        ListNode pre = null;
        while (curr != null){



            ListNode nextTemp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nextTemp;


            curr.next = pre;
            curr.next.next = curr;

            curr = curr.next;
            pre = curr;
        }

        return pre;
    }
}
