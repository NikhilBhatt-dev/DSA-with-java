package Polymophism;
public class Circle extends Shapes {
    @Override //this is annotation which is used to override the method of parent class
    void area(){
        System.out.println("Area of Circle");
    }
}
