

public class Main {
    public static void main(String[] args) {
        LL list =new LL();
        list.insertFirst(23);
        list.insertFirst(44);
        list.insertFirst(55);
        list.display();
       list.insertAtLast(323);
       list.display();
       list.insertAtParticular(100000, 2);
       list.display();
       list.deleteFirst();
       list.display();
       list.deleteLast();
       list.display();
         
    }
    
}
