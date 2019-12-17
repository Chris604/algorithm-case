package leet_code;

import java.util.*;

/**
 * 合并n个链表
 * 1. 暴力解法：把所有的节点遍历一遍放到一个数组里面，然后给数组排序,然后遍历数组，组建新的链表。
 * 2.
 */
public class LeetCode23 {

    private static ListNode combineK(ListNode[] list) {
        List res = new ArrayList<Integer>();
        if (list == null) { return null; }
        for (int i = 0; i< list.length; i++){
            while (list[i] != null){
                res.add(list[i].value);
            }
        }

//        res.sort(Comparator c);

        return null;
    }

    static class ListNode {
        int value;
        ListNode next;

        private ListNode(int value) {
            this.value = value;
        }
    }
}
