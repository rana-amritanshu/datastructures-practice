package LinkedList;

public class Node {
    private Node prev;
    private Node next;
    private int value;

    public int getValue() {
        return value;
    }

    public Node setValue(int value) {
        this.value = value;
        return this;
    }

    public Node getPrev() {
        return prev;
    }

    public Node setPrev(Node prev) {
        this.prev = prev;
        return this;
    }

    public Node getNext() {
        return next;
    }

    public Node setNext(Node next) {
        this.next = next;
        return this;
    }

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node next) {
        this(value);
        this.next = next;
    }

    public Node(int value, Node next, Node prev) {
        this(value, next);
        this.prev = prev;
    }
}
