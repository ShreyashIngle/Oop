import java.util.*;

abstract class Shape {
    double l;
    double b;

    abstract void getInput();

    abstract void compute_area();

}

class Triangle extends Shape {
    @Override
    public void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length:");
        l = sc.nextDouble();

        System.out.println("Enter the Breadth:");
        b = sc.nextDouble();
        sc.close();
    }

    public void compute_area() {
        double area = 0.5 * l * b;
        System.out.println("The area of triangle is:" + area);
    }

}

class Rectangle extends Shape {
    @Override
    public void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length:");
        l = sc.nextDouble();

        System.out.println("Enter the Breadth:");
        b = sc.nextDouble();
        sc.close();
    }

    public void compute_area() {
        double area = l * b;
        System.out.println("The area of Rectangle is:" + area);
    }
}

public class Mock4 {

    public static void main(String[] args) {
        int choice;
        while (true) {
            System.out.println("\n-----MENU-----\n1.Trrangle\n2.Rectangle\n3.Exit\nEnter your choice:");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                Shape obj1 = new Triangle();
                obj1.getInput();
                obj1.compute_area();
                break;
                case 2:
                Shape obj2 = new Rectangle();
                    obj2.getInput();
                    obj2.compute_area();
                    break;
                case 3:
                    break;
                    
                    default:
                    System.out.println("Invalid");
                    break;
                }
                
                sc.close();
            }
        }

}
