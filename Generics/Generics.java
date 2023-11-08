import java.util.ArrayList;
import java.util.List;

class Generics {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for (Integer c : list) {
            System.out.println(c);

        }
        System.out.println("\n");
        System.out.println(list);
        List<String> list2 = new ArrayList<String>();
        list2.add("shreyash");
        list2.add("rajesh");
        list2.add("ingle");

        for (String c : list2) {
            System.out.println(c);

        }

        System.out.println(list2);
    }
}