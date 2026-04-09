package Polymophism;

//Method Overloading


public class Number {
    int sum(int a, int b){
        return a+b;

    }    
    int sum(int a, int b, int c){
        return a+b+c;

    }
    public static void main(String[] args) {
        Number number = new Number();
        
        System.out.println(number.sum(2, 3));
        System.out.println(number.sum(2, 3, 4));
    }
}