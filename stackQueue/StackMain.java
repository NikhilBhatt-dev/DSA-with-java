public class StackMain {
    public static void main(String[] args) throws StackException{
        CustomStack stack = new CustomStack(5);

        stack.push(2);
        stack.push(3);
        stack.push(6);


        stack.push(5);
        stack.push(8);
        System.out.println(stack.pop());
    }
    
    
}
