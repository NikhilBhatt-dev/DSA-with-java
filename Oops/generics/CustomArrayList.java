package generics;

import java.util.ArrayList;

public class CustomArrayList{
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add("Hello");
        list.remove(0);
        list.get(0);
        list.set(1, 2233);
        list.size();
        list.isEmpty();
    }
}