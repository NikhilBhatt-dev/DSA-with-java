// package stackQueue;


//stack is classs but queue is a interface

import java.util.LinkedList;
import java.util.Queue;

public class InBuiltExamples {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();
        // stack.push(34);
        // stack.push(20);
        // stack.push(24);
        // stack.push(30);
        // stack.push(44);
        // stack.push(50);

        // System.out.println(stack.pop());
        
        // System.out.println(stack.pop());
        
        // System.out.println(stack.pop());
        
        // System.out.println(stack.pop());

        // System.out.println(stack.pop());


        Queue<Integer>  queue = new  LinkedList<>();
        queue.add(3);
        queue.add(32);

        queue.add(33);
        queue.add(34);

        queue.add(35);

        System.out.println(queue.peek());
        

    }
}
