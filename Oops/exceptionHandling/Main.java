package exceptionHandling;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            divide(a, b);
            
        } catch (MyExpection e) {
            System.out.println(e.getMessage());

        }finally{
            System.out.println("This will always execute");
        }

    }

   static  int divide(int a, int b) throws MyExpection{  
    if(b == 0){
        throw new ArithmeticException("Cannot divide by zero");
   }
        return a / b;
    }
}
