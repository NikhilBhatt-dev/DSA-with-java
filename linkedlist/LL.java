


public class LL {
 
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;// this refer to the current object that is being created  in LL class
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
            int val = head.value;// store the current head value

            head = head.next; //update the head
            if(head == null){
                tail = null;
            }
            size--;
            return val; // return the delete val

        }



                            // insert using recursion

        public void  insertRec(int val, int index ) {
            head = insertRec(val, index, head);

            

        }

        private Node insertRec(int val, int index, Node node){
            if(index ==0){
                Node temp = new Node(val,node);
                size ++;
                return temp;
            }
            node.next = insertRec(val, index-1, node.next);
            return node;
        }




        public int  deleteLast(){
            if(size <= 1) {
                return deleteFirst();
            }
            Node  secondLast = get(size - 2);
            int val = tail.value;
            tail = secondLast;
            tail.next = null;
            size--;
            return val;
        }
    
        public Node find(int value) {
        Node node = head;
        while (node != null) { 
            
        if(node.value ==  value){
            return node;
        }
        node = node.next;
        }
        return null;
    }




        public Node get(int index){
            Node node  = head;
            for (int i = 0; i < index ;i++) {
                node  = node.next;
                
            }
            return node;
        }




        public int deleteAtParticular(int index){

            if(index == 0 ){
                return deleteFirst();

            }

            if(index  == size -1){
                return  deleteLast();
            }
            Node prev = get (index  -1);
            int val = prev.next.value;
            prev.next = prev.next.next;
            return val;
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
            this.value = value;// use this when we dont know the next node like tail of list
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }











                // questions

        public void DuplicateRemove(){
            Node node  = head;

            while(node.next !=null){
                //agr equal hai to delete
                if(node.value  == node.next.value) {
                    node.next = node.next.next;
                    size--;
                }
                else{
                    node = node.next;
                }
            }
            tail = node;
           tail.next = null; 
        }

    




        // merge two sorted linked list

        public static LL merge(LL first, LL second){
            Node f = first.head;
            Node s  = second.head;

            LL ans  = new LL();

            while(f != null && s!=null){
                if(f.value < s.value) { 
                    ans.insertAtLast(f.value);
                    f = f.next;
                }
                else { 
                    ans.insertAtLast(s.value);
                    s = f.next;
                }
            }

            while(f != null){
                ans.insertAtLast(f.value);
                f = f.next;
            }
            while (s != null) {
                ans.insertAtLast(s.value);
                s = s.next;
            }
            return  ans;

        }

        public static void main(String[] args) {
            LL first = new LL();
            LL second = new LL();

            first.insertAtLast(1);
            first.insertAtLast(2);
            first.insertAtLast(3);


            second.insertAtLast(1);
            second.insertAtLast(2);
            second.insertAtLast(3);

            LL ans  = LL.merge(first, second);
            ans.display();


            

        }

}
