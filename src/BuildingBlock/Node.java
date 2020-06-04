package BuildingBlock;

public class Node<T> {
    private Node<T> next;
    private Node<T> prev;
    private T value;

    public Node(T value) {
        this.value = value;
    }

    public Node(T value, Node prev) {
        this(value);
        this.prev = prev;
    }

    public Node(T value, Node prev, Node next) {
        this(value, prev);
        this.next = next;
    }


    public Node<T> getNext() {
        return next;
    }

    public Node<T> setNext(Node next) {
        this.next = next;
        return this;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public Node<T> setPrev(Node prev) {
        this.prev = prev;
        return this;
    }

    public T getValue() {
        return value;
    }

    public Node<T> setValue(T value) {
        this.value = value;
        return this;
    }
}
