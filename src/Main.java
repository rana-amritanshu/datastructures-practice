import LinkedList.Node;
import LinkedList.LinkedList;

public class Main {
    public static void main(String args[]) {
        System.out.println("Hello Data Structures");
        LinkedList myLinkedList = new LinkedList();

        Node myNode = new Node(10);
        myLinkedList.setHead(myNode);

        Node myNode1 = new Node(20);
        Node myNode2 = new Node(30);
        Node myNode3 = new Node(40);


        myLinkedList.getHead().setNext(myNode1);
        myNode1.setNext(myNode2);
        myNode1.setPrev(myNode);
        myNode2.setNext(myNode3);
        myNode2.setPrev(myNode1);
        myNode3.setPrev(myNode2);

        myLinkedList.traverseDown(myNode);
        System.out.println("----------------------");
        myLinkedList.traverseUp(myNode3);
    }
}
