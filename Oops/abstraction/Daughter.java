package abstraction;

public class Daughter extends Parent {

    @Override
    void career() {
        System.out.println("She is a doctor");
    }

    @Override
    void partner() {
        System.out.println("He is my partner.");
    }
}
