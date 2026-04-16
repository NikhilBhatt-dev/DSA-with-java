
import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("enter your name");
        String name  = input.nextLine();

        System.out.println("enter your age");
        int age =  input.nextInt();

        System.out.println("your name"+ name + "your age" + age);

        input.close();

}
}