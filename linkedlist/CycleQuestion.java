public class CycleQuestion {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
 
    public int lengthOfCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                int length = 0;
                ListNode temp = slow;

                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);

                return length;
            }
        }
        return 0;
    }


    public ListNode detectCycle(ListNode head){
        int length = 0;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
               length =lengthOfCycle(slow);
               break;
            }

        }

        if( length == 0){
            return null;
        }
        // find the start node
        ListNode  f= head;
        ListNode  s = head;
       
        while(length > 0){
            s =s.next;
            length--;
        }
        //keep moving both forward and they will meet  at cycle start 
        while(f != s){
            f = f.next;
            s = s.next;
        }
        return s;
    }

}





/// is happy



public boolean isHappy(int n){
    int slow = n;
    int fast = n;

    do {
        slow = findSquare(slow);
        fast = findSquare(findSquare(fast)); 
        
    } while (slow != fast);
    if(slow == 1){
        return true;
    }
    return false;

}
private int findSquare(int number) {
    int ans  = 0 ;
    while(number  > 0){
        int rem = number % 10; 
        ans += rem * rem;
        number = number / 10;
    }
    return  ans;
    
}


// middle of singly ll


    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast !=null && fast.next != null){
            slow  =slow.next;
            fast = fast.next.next;

        }
        return slow ;

    }

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}