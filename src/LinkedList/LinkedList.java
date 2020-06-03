package LinkedList;

import org.jetbrains.annotations.NotNull;

public class LinkedList {

    private Node head;
    private Node tail;
    private Node iterator;

    public LinkedList() {
        this.tail = null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node current() {
        if (this.iterator == null) {
            this.iterator = this.head;
        }
        return this.iterator;
    }

    public Node next() {
        if (this.iterator == null) {
            this.iterator = this.current();
        } else if (this.iterator.getNext() == null) {
//            this.iterator = null;
            return null;
        } else {
            this.iterator = this.iterator.getNext();
        }

        return this.iterator;
    }

    public Node prev() {
        if (this.iterator == null) {
            this.iterator = this.current();
        } else if (this.iterator.getPrev() == null) {
//            this.iterator = null;
            return null;
        } else {
            this.iterator = this.iterator.getPrev();
        }

        return this.iterator;
    }

    public void traverseDown(Node node) {
//        if (node.getNext() == null) {
//            return;
//        }
//        this.traverseDown(node.getNext());
        System.out.println(node.getValue());
        while (node.getNext() != null) {
            node = node.getNext();
            System.out.println(node.getValue());
        }
    }

    public void traverseUp(Node node) {
        //with recursion
       /* System.out.println(node.getValue());
        if (node.getPrev() == null) {
            return;
        }
        this.traverseUp(node.getPrev());*/
        System.out.println(node.getValue());
        while (node.getPrev() != null) {
            node = node.getPrev();
            System.out.println(node.getValue());
        }
    }

    public void setTail(Node node) {
        this.tail = node;
    }

    public Node getTail() {
        return this.tail;
    }

    public void append(int value) {
        if (this.head == null) {
            Node newHead = new Node(value);
            this.head = newHead;
            System.out.println("Appending to new head");
            return;
        }

        if (this.tail == null) {
            Node newTail = new Node(value);
            this.tail = newTail;
            this.tail.setPrev(this.head);
            System.out.println("Appending to new tail");
            return;
        }

        Node newNode = new Node(value);
        Node oldTail = this.tail;
        this.tail = newNode;
        oldTail.setNext(this.tail);
        this.tail.setPrev(oldTail);
        System.out.println("Appending to existing tail");
        return;
    }

    public void makeHead(@NotNull Node node)
    {
       Node temp = this.head;

       this.head = node;

       node.setNext(temp);

       temp.setPrev(this.head);
    }

    public void insertAfter(@NotNull Node node, int value) {
        Node newNode = new Node(value);

        Node oldNextNode = node.getNext();

        node.setNext(newNode);
        oldNextNode.setPrev(newNode);
        newNode.setPrev(node);
        newNode.setNext(oldNextNode);
    }

    public void delete(Node node) {
        Node prevNode = node.getPrev();
        Node nextNode = node.getNext();
        if (prevNode == null && nextNode == null) {
            this.head = null;
            this.iterator = null;
            return;
        }

        if (prevNode == null && nextNode != null) {
            this.head = node.getNext();
            this.tail = this.head;
            this.iterator = this.head;
            return;
        }

        if (prevNode != null && nextNode == null) {
            if (this.iterator == node) {
                this.iterator = prevNode;
            }
            prevNode.setNext(null);

            return;
        }

        if (prevNode != null && nextNode != null) {
            if (this.iterator == node) {
                this.iterator = prevNode;
            }
            prevNode.setNext(nextNode);
            nextNode.setPrev(prevNode);
            return;
        }

    }
}
