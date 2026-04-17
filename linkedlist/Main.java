
public class Main {

    public static void main(String[] args) {

        LL list = new LL();
        System.out.println("after insert");
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(6);
        list.insertLast(99);
        list.insertMid(33, 3);

        list.deleteFirst();
        list.display();
        System.out.println("deletefirst");
        list.deleteFirst();
        list.display();
        System.out.println("deletelast");
        list .deleteLast();
        list.display();

    }
}
