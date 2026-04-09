package Polymophism;

public class ObjectPrint {

    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

   public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(10);
        System.out.println(obj); // it will print the reference of the object
   } 
    
    
}
