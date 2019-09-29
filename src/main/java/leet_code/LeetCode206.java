package leet_code;

/**
 * 反转链表
 */
public class LeetCode206 {



    /* 采用递归方式 */
    public LinkNode reverseList(LinkNode head) {
        if (head == null || head.next == null) return head;
        LinkNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    /* 采用迭代方式 */
    private static LinkNode reverLink(LinkNode linkNode){

        if(linkNode == null) {
            return null;
        }

        LinkNode pre = null;
        LinkNode cur = linkNode;

        while (cur != null) {
            LinkNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }

        return pre;
    }

    static class LinkNode{
        int data;
        LinkNode next;

        LinkNode(int data){
            this.data = data;
        }
    }
}
