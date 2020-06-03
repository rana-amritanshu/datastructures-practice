package LinkedList;

public class LinkedList {

    private Node head;

    public LinkedList() {

    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void traverseDown(Node node) {
        System.out.println(node.getValue());
        if (node.getNext() == null) {
            return;
        }
        this.traverseDown(node.getNext());
    }

    public void traverseUp(Node node) {
        System.out.println(node.getValue());
        if (node.getPrev() == null) {
            return;
        }
        this.traverseUp(node.getPrev());
    }
}
