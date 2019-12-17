package experiment;

import apple.laf.JRSUIUtils;

import java.util.PriorityQueue;

// 在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序。
public class Sort148 {

    public ListNode sortList(ListNode head) {

        // 优先队列
        PriorityQueue pq = new PriorityQueue();

        if (head == null) { return null; }
        while (head != null){
            pq.add(head.val);
            head = head.next;
        }

        while (!pq.isEmpty()){

        }

        return null;
    }

    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
}
