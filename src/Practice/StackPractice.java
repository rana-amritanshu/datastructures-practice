package Practice;
import Stack.Stack;

public class StackPractice {
    public static void run() {
        Stack<Integer> myStack = new Stack<Integer>();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        System.out.println(myStack.peek());
        System.out.println(myStack.getStackSize());

        int i = 0;
        while(myStack.next() != null) {
//            myStack.next();
            System.out.println(myStack.getCurrent());
//            myStack.next();
            i++;
        }
        myStack.push(40);
        myStack.push(50);

        while(myStack.next() != null) {
//            myStack.next();
            System.out.println(myStack.getCurrent());
//            myStack.next();
            i++;
        }

        System.out.println(myStack.pop());
        System.out.println("Popped Stack");

        while(myStack.next() != null) {
//            myStack.next();
            System.out.println(myStack.getCurrent());
//            myStack.next();
            i++;
        }
    }
}
