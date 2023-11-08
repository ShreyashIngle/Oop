package Collec;

import java.util.*;

public class TraverseExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Shreyash");
        list.add("Rajesh");
        list.add("Ingle");

        // For each loop
        for (String s : list) {
            System.out.print(s + " : " + s.length() + "\t");
            StringBuffer br = new StringBuffer(s);
            System.out.println(br.reverse());
        }

        System.out.println("------------------------------------------------------");

        // traversing using Iterator

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String s = itr.next();
            System.out.println(s);
        }
        System.out.println("------------------------------------------------------");

        // Backward traversal (ListIterator)
        ListIterator<String> litr = list.listIterator(list.size());
        while (litr.hasPrevious()) {
            String s = litr.previous();
            System.out.println(s);
        }

        System.out.println("------------------------------------------------------");

        // Foreach method
        list.forEach(e -> {

            System.out.println(e);
        });

    }
}
