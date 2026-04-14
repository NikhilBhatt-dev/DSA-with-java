package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();


        list2.add(22);
        list.add(23);

        list.get(0);
        System.out.println(list2);
        list2.isEmpty();
        
    }
}