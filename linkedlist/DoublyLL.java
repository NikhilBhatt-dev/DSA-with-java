
public class DoublyLL {

    Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;// this is extra line comparision to Sll
        if (head != null) {
            head.prev = node;

        }
        head = node;
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.println(node.val + " ->");
            node = node.next;

        }
        System.out.println("end");
    }

    public void displayRev () {
        Node node = head;
        while (node != null) {
            System.out.println(node.val + " ->");
            node = node.next;

        }
        System.out.println("end");
    }



private class Node {

    int val;
    Node next;
    Node prev;

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node next, Node prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}

}
