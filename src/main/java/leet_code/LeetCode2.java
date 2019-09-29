package leet_code;

/**
 *  两个链表的和
 *  输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 *  输出：7 -> 0 -> 8
 *  原因：342 + 465 = 807
 */
public class LeetCode2 {

    private static ListNode twoTotal(ListNode list1, ListNode list2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;

        int carry = 0;
        if (list1 != null || list2 != null) {
            int x = list1 == null ? 0 : list1.val;
            int y = list2 == null ? 0 : list2.val;

            int sum = x + y + carry;

            carry = sum / 10;
            sum = sum % 10;

            cur.next = new ListNode(sum);
            cur = cur.next;

            if (list1.next != null) {
                list1 = list1.next;
            }
            if (list2.next != null) {
                list2 = list2.next;
            }
        }
        if (carry == 1) {
            cur.next = new ListNode(carry);
        }

        return pre.next;
    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
        }
    }
}
