package experiment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// 请判断一个链表是否为回文链表。
public class LinkList234 {

    // 双端队列
    public boolean isPalindrome(ListNode head) {
        if (head == null) { return false; }
        ListNode tmp = null;
        tmp = head;
        Queue queue = new LinkedList();
        while (tmp!=null){
            queue.add(tmp.val);
            tmp = tmp.next;
        }

        while (!queue.isEmpty()){
            Object remove = queue.remove();
            if (!queue.isEmpty() && remove.equals(((LinkedList) queue).removeLast())){
                return false;
            }
        }

        return true;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
