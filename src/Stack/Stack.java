package Stack;

import BuildingBlock.Node;

public class Stack<T> {
    private Node<T> top;
    private int stackSize;
    private Node<T> iterator;
    private T current;


    public Stack() {
        stackSize = 0;
    }

    public T getCurrent() {
        if (current == null) {
            return null;
        }
        return current;
    }

    public int getStackSize() {
        return stackSize;
    }

    public void push(T value) {
        if (top == null) {
            top = new Node<T>(value);
            stackSize++;
            iterator = top;
            return;
        }
        Node<T> oldTop = top;
        Node<T> topNode = new Node<T>(value);
        topNode.setPrev(oldTop);
        oldTop.setNext(topNode);
        top = topNode;
        stackSize++;
        iterator = top;
        return;
    }

    public T pop() {
        if (top == null) {
            return null;
        }

        Node<T> temp = top;
        if (top.getPrev() == null) {
            top = null;
        } else {
            Node<T> newTop = top.getPrev();
            top = newTop;
        }
        iterator = top;

        this.stackSize--;
        return temp.getValue();
    }


    public T peek() {
        if (top == null) {
            return null;
        }
        return top.getValue();
    }

    public T next() {
        if (current != null && iterator == null) {
            iterator = top;
            return null;
        }
        if (iterator == null) {
            return null;
        }

        Node<T> temp = iterator;
        current = temp.getValue();
        iterator = iterator.getPrev();

        return temp.getValue();
    }
}
