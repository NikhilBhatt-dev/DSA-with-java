package access;

public class ObjectDemo {

    int num;
    // String name;
    float gpa;

    public ObjectDemo(int num, String name, float gpa) {
        this.num = num;
        // this.name = name;
        this.gpa = gpa;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34,"nikhil", 3.5f);
        ObjectDemo obj2 = new ObjectDemo(34,"nikhilbhatt", 3.55f);
        
        if(obj.equals(obj2)){
            System.out.println("both not same");
        }
    }
}
