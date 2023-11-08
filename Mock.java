import java.util.*;

class Complex {
    float real;
    float imaginary;

    Complex(int r, int i) {
        this.real = r;
        this.imaginary = i;
    }

    public void showC() {
        System.out.println(("(" + this.real + "+" + this.imaginary + "i" + ")"));
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
                / (n2.real * n2.real + n1.imaginary * n2.imaginary);

        res.imaginary = (n1.imaginary * n2.real + n1.real * n2.imaginary)
                / (n2.real * n2.real + n1.imaginary * n2.imaginary);

        return res;
    }
}

class Mock{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Real Part:");
            int r1 = sc.nextInt();

            System.out.println("Enter the Imaginary Part:");
            int i1 = sc.nextInt();
            
            System.out.println("Enter the Real Part:");
            int r2 = sc.nextInt();
            
            System.out.println("Enter the Imaginary Part:");
            int i2 = sc.nextInt();

            Complex c1 = new Complex(r1, i1);
            Complex c2 = new Complex(r2, i2);

            System.out.println("\nYou Entered :");
            c1.showC();
            System.out.println("\n");
            c2.showC();

            while(true){
                System.out.println("\n1. Addition\n2. Substraction \n3.Multiplication \n4.Division \n5.Exit \n\nEnter your choice:");
                int choice = sc.nextInt();
                

                switch (choice) {
                    case 1:
                        Complex Add = Complex.add(c1, c2);
                        System.out.println("\nAddition is:");
                        Add.showC();
                        break;
                    case 2:
                        Complex Sub = Complex.sub(c1, c2);
                        System.out.println("\nSubstraction is:");
                        Sub.showC();
                        break;
                    case 3:
                        Complex Mul = Complex.mul(c1, c2);
                        System.out.println("\nMultiplication is:");
                        Mul.showC();
                        break;
                    case 4:
                        Complex Div = Complex.div(c1, c2);
                        System.out.println("\nDivision is:");
                        Div.showC();
                        break;
                    case 5:
                        System.exit(0);
                        break;
                
                    default:
                    System.out.println("Invalid!!");
                        break;
                }
            }
        }

  

    }
}