package OOPAssignment6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Assignment6 {
    public static void main(String[] args) {

        try {
            int Num1, Num2;

            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            System.out.println("Enter Number 1:");
            Num1 = Integer.parseInt(br.readLine());
            System.out.println("Enter Number 1:");
            Num2 = Integer.parseInt(br.readLine());
            int result = Num1 / Num2;
            if (Num2 == 0) {
                throw new ArithmeticException();
            }
            System.out.println("The Division of Numbers is: " + result);

            int[] a = new int[4];
            a[0] = 1;
            a[1] = 2;
            a[2] = 3;
            a[3] = 4;
            System.out.println("Enter the Index to access the element");
            int k = Integer.parseInt(br.readLine());
            System.out.println(a[k]);

        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide by zero!!" + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please Enter Integers only!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of Bounds!!");
        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }
}
