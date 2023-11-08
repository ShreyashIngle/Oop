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

        //update
        list.set(0, "Tejas");
        System.out.println(list);   

        //add element at speciic postion
        list.add(1,"Rajesh");
        System.out.println(list);

        //clear all elements
        // list.clear();
        // System.out.println(list);

        //VECTOR
        Vector<String> v = new Vector<>();
        v.addAll(list);
        System.out.println(v);

        System.out.println("____________________________________________");

        //Unorderd set
        HashSet<Double> h = new HashSet<>();
        h.add(13.124);
        h.add(412.124);
        h.add(532.32);
        h.add(532.32);//no duplicates
        h.add(41.32);
        h.add(5634.32);
        System.out.println(h);


        //Treeset
        TreeSet<Double> t = new TreeSet<>();
        t.addAll(h);//sortes the elements
        System.out.println(t);
    }
}
