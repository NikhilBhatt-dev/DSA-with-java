
public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;// this refer to the current object that is being created 
    }

    public void insertFirst(int val) {
        Node newnode = new Node(val);// create a new node
        newnode.next = head;//new node point to old node
        head = newnode; // new node become the head

        //if the  list is empty
        if (tail == null) {
            tail = head;
        }

        size += 1;//increase size by one because newnode is created it update the list
    }

    public void insertAtLast(int val) {

        // if list is empty, insert at first
        if (tail == null) {
            insertFirst(val);
            return;
        }

        // create new node
        Node node = new Node(val);

        // link current tail to new node
        tail.next = node;

        // update tail to new node
        tail = node;

        // increase size
        size++;
    }




    public void insertAtParticular(int val, int index) {

        
        // if inserting at first position
        
        if (index == 0) {
            insertFirst(val);
            return;
        }
        
        // if inserting at the end (index == size)
        
        if (index == size) {
            insertAtLast(val);
            return;
        }


        // create a temp node which is refrence of head
        Node temp = head;
        for (int i = 1; i < index; i++) {
            // add temp in the  next index 
            temp = temp.next;

        }

        Node node = new Node(val, temp.next); 
        // link previous node (temp) to new node
            temp.next  = node;
            size++;

    
 }







        public int deleteFirst(){
            int val = head.value;// store the current head vakue

            head = head.next; //update the head
            if(head == null){
                tail = null;
            }
            size--;
            return val; // return the delete val

        }



    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }

    private class Node {

        private int value;//it hold the data or value in node
        private Node next; // it store the address of the next node

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
