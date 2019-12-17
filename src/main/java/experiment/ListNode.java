package experiment;

public class ListNode{
    public int value;
    public ListNode next;

    ListNode(){

    }

    ListNode(int value) {
        this.value = value;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "" +
                value;
    }
}
