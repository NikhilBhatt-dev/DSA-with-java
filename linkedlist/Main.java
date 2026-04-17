
public class Main {

    public static void main(String[] args) {

        LL list = new LL();
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(6);
        list.insertLast(99);
        list.insertMid(33, 3);
        list.deleteFirst();
        list.display();
        list.deleteFirst();
        list.display();

    }
}
