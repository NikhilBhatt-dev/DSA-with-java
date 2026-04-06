package staticExample;

public class InnerClass {
  static class Test{
        String name;

        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
    Test a = new Test("nikhil");  
    Test b = new Test("bhatt");
    System.out.println(a.name + " " + b.name);
    }
    
}
