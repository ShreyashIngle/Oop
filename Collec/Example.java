package Collec;

import java.util.*;

public class Example {
    public static void main(String[] args) {

        // Type safe collection
        ArrayList<String> list = new ArrayList<>();
        list.add("Shreyash");
        list.add("Rajesh");
        list.add("Ingle");

        //get
        System.out.println(list.get(2));
        System.out.println(list);

        // untype safe collection
        LinkedList l2 = new LinkedList();
        l2.add("Shreyash");
        l2.add(23364);
        l2.add("Pict");
        System.out.println(l2);

        //remove
        list.remove("Rajesh");
        System.out.println(list);

        //size
        System.out.println("Size: "+list.size());

        //contains
        System.out.println(list.contains("Shreyash"));
    }
}
