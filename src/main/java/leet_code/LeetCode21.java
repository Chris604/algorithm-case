package leet_code;

/**
 * 合并两个链表
 */
public class LeetCode21 {

    // 递归实现
    private static ListNode combineListNode(ListNode list1, ListNode list2){
        if (list1 == null) { return list2; }
        if (list2 == null) { return list1; }

        if(list1.value < list2.value) {
            list1.next = combineListNode(list1.next, list2);
            return list1;
        } else {
            list2.next = combineListNode(list1, list2.next);
            return list2;
        }
    }

    // 非递归实现
    private static ListNode combineList(ListNode list1, ListNode list2){
        if (list1 == null) { return list2; }
        if (list2 == null) { return list1; }

        return null;
    }

    static class ListNode{
        int value;
        ListNode next;

        public ListNode(int value){
            this.value= value;
        }
    }
}
