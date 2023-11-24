package OOPAssignment6;

public class Assignment6 {
    public static void main(String[] args) {

        try {
            int i = 8, j = 0;
            int k = i / j;
            System.out.println(k);
        } catch (Exception e) {
            System.out.println("Divide by 0 orrcured");
        }
    }
}
