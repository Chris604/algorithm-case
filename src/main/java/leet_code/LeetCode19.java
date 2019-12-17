package leet_code;


/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 */
public class LeetCode19 {

    private static ListNode removeNthFromEnd(ListNode listNode, int n) {
        ListNode pre = new ListNode(0);
        ListNode f = pre;
        ListNode s = pre;

        for (int i=0; i < n; i++) {
            f = f.next;
        }

        if (f == null) { return pre; }

        while (f.next != null) {
            f = f.next;
            s = s.next;
        }

        s.next = s.next.next;

        return pre.next;
    }



    static class ListNode {
        int value;
        ListNode next;

        private ListNode(int value) {
            this.value = value;
        }
    }
}
