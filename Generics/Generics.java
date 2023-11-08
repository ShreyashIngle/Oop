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
    }
}