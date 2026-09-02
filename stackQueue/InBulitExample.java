import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBulitExample{
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(35);
        stack.push(38); 
        stack.push(40);
        stack.push(56);
        stack.push(60);

        System.out.println(stack);
        System.out.println(stack.pop() + " pop out");
      
        System.out.println(stack);
        System.out.println(stack.pop() + " pop out");

        System.out.println(stack);
        System.out.println(stack.pop() + " pop out");


        System.out.println(stack);
        System.out.println(stack.pop() + " pop out");


        System.out.println(stack);
        System.out.println(stack.pop() + " pop out");

                System.out.println("now stack is empty");


        Queue <Integer> queue =new LinkedList<>();
        queue.add(5);
        queue.add(52);
        queue.add(54);
        queue.add(533);
        queue.add(15);

        System.out.println(queue);
        System.out.println(queue.remove()+ " Pop Out");


        System.out.println(queue);
        System.out.println(queue.remove());




        System.out.println(queue);
        System.out.println(queue.remove());


        System.out.println(queue);
        System.out.println(queue.remove());


        System.out.println(queue);
        System.out.println(queue.remove());
     






    }
}