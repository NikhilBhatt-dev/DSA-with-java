
import java.util.Stack;

class MyQueue {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        int pop = second.pop();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }

        return pop;
    }

    public int peek() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        int peek = second.peek();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }

        return peek;
    }

    public boolean empty() {
        return first.isEmpty();
    }
}

public class QueueUsingStacks {

    public static void main(String[] args) {

        MyQueue queue = new MyQueue();

        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println("Front: " + queue.peek());
        System.out.println("Pop: " + queue.pop());
        System.out.println("Pop: " + queue.pop());

        queue.push(4);

        System.out.println("Front: " + queue.peek());
        System.out.println("Pop: " + queue.pop());
        System.out.println("Pop: " + queue.pop());

        System.out.println("Empty: " + queue.empty());
    }
}
