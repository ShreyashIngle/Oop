
import java.util.Scanner;

class Complex {
    float real;
    float imaginary;

    Complex(int r, int i) {
        this.real = r;
        this.imaginary = i;
    }

    public void showC() {
        System.out.print("(" + this.real + " + " + this.imaginary + "i" + ")");
    }

    public static Complex add(Complex n1, Complex n2) {

        Complex res = new Complex(0, 0);

        res.real = n1.real + n2.real;

        res.imaginary = n1.imaginary + n2.imaginary;

        return res;
    }

    public static Complex sub(Complex n1, Complex n2) {

        Complex res = new Complex(0, 0);

        res.real = n1.real - n2.real;

        res.imaginary = n1.imaginary - n2.imaginary;

        return res;
    }

    public static Complex mul(Complex n1, Complex n2) {

        Complex res = new Complex(0, 0);

        res.real = n1.real * n2.real - n1.imaginary * n2.imaginary;
        

        res.imaginary = n1.real * n2.imaginary + n2.real * n1.imaginary;

        return res;
    }

    public static Complex div(Complex n1, Complex n2) {

        Complex res = new Complex(0, 0);

        res.real = (n1.real * n2.real + n1.imaginary * n2.imaginary)
                / (n2.real * n2.real + n2.imaginary * n2.imaginary);

        res.imaginary = (n1.imaginary * n2.real - n1.real * n2.imaginary)
                / (n2.real * n2.real + n2.imaginary * n2.imaginary);
        return res;

    }
}

public class OOPAssignment1 {

    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Enter 1st Real part:");
            int r1 = Integer.parseInt(myObj.nextLine());

            System.out.println("Enter 1st Imaginary  part:");
            int i1 = Integer.parseInt(myObj.nextLine());

            System.out.println("Enter 2nd Real part:");
            int r2 = Integer.parseInt(myObj.nextLine());

            System.out.println("Enter 2nd Imaginary  part:");
            int i2 = Integer.parseInt(myObj.nextLine());

            Complex c1 = new Complex(r1, i1);
            Complex c2 = new Complex(r2, i2);

            System.out.println("You Have Entered:");
            c1.showC();
            System.out.println("\n");
            c2.showC();

            while (true) {
                 System.out.println("\n1: Addition\n2: Subtraction\n3: Multiplication\n4: Division\n5: Exit\n");

                System.out.println("Enter your choice:");
                int choice = Integer.parseInt(myObj.nextLine());

                switch (choice) {
                    case 1:
                        Complex Addition = Complex.add(c1, c2);
                        System.out.println("\nAddition is:");
                        Addition.showC();
                        break;

                    case 2:
                        Complex Subtraction = Complex.sub(c1, c2);
                        System.out.println("\nSubtraction is:");
                        Subtraction.showC();
                        break;

                    case 3:
                        Complex Multiply = Complex.mul(c1, c2);
                        System.out.println("\nMultiplication is:");
                        Multiply.showC();
                        break;

                    case 4:
                        Complex Division = Complex.div(c1, c2);
                        System.out.println("\nDivision is:");
                        Division.showC();
                        break;

                    case 5:
                        System.exit(0);

                    default:
                        System.out.println("Invalid data!!!");
                }
                System.out.println("\n");
            }
        } catch (NumberFormatException e) {
            
            e.printStackTrace();
        }
    }
}



