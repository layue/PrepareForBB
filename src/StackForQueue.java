import java.util.Stack;

/**
 * Created by X on 28/04/2016.
 */
public class StackForQueue {
    static Stack<Integer> stack1 = new Stack();
    static Stack<Integer> stack2 = new Stack();

    private static void enqueue(int n) {
        stack1.push(n);
    }
    private static int dequeue() {
        if(stack1.isEmpty() && stack2.isEmpty()) {
            return -1;
        }

        if(stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        enqueue(1);
        enqueue(2);
        enqueue(3);

        System.out.println(dequeue());
        System.out.println(dequeue());

        enqueue(4);
        System.out.println(dequeue());
        enqueue(5);
        enqueue(6);
        System.out.println(dequeue());
        enqueue(7);
        System.out.println(dequeue());
        System.out.println(dequeue());
        System.out.println(dequeue());
    }
}
