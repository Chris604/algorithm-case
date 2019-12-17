package case_tree;

/**
 * 反转单向链表
 */
public class ReverLinkList {

    private Node reverLinkList(Node root) {
        if (root == null || root.next == null) {
            return root;
        }

        Node nextNode = reverLinkList(root.next);
        Node currentNode = root;
        root.next.next = root;
        root.next = null;
        return nextNode;
    }

    static class Node {
        int data;
        Node next;

        private Node(int data) {
            this.data = data;
        }
    }
}
