package Package;
import static Package.Message.message;

public class Greeting {
    public static void main(String[] args) {
        System.out.println(greet());
    }
    public static String greet() {
        String greeting = "how are you";
        message();
        return greeting;  
    }
}