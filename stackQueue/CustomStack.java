public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    

    public CustomStack(){
        this( DEFAULT_SIZE);
    }

public CustomStack(int size){
    this.data =new int[size];

}

public boolean push(int item) {

    if(isfull()) {
        System.out.println("stack is full");
        return false;
    }
    ptr++;
    data[ptr] = item;
    return true;
}

public int pop() throws Exception {
    if(isEmpty()){
        throw  new Exception("cannot pop from an empty stack!!");
        
    }
    return  data [ptr--]; 
}

public  boolean  isfull() {
    return ptr == data.length -1;// ptr is at last index

}

public boolean  isEmpty(){
    return ptr == -1; //stack is empty
}

}