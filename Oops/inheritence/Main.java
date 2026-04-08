package inheritence;


public class Main {
    public static void main(String[] args) {
        Box box = new Box(5) ;
        box.information();
        System.out.println(box.l+" "+box.w+" "+box.h);

        BoxPrice boxPrice = new BoxPrice(2, 3, 4, 5);
        boxPrice.information();
        System.out.println(boxPrice.l+" "+boxPrice.w+" "+boxPrice.h+" "+boxPrice.cost);
      

    }
    
}
