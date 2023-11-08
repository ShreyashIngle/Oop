package Collec;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        // MAP
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Shreyash");
        hm.put(2, "Tejas");
        hm.put(3, "Rajesh");
        hm.put(4, "Akshay");
        hm.put(4, "Akshay");// no duplicates

        System.out.println(hm);

        hm.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });

        // getvalue
        System.out.println(hm.get(1));
    }
}
