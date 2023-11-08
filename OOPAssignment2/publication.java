package OOPAssignment2;

import java.util.Scanner;

class publication {
    private String title;
    private int price;
    private int copies;
    private int total;

    Scanner sc = new Scanner(System.in);// scanner class object

    public void settitle(String title) {
        this.title = title;
    }
    
    public String gettitle() {
        return title;
    }

    public void setcopies(int copies) {
        this.copies = copies;
    }

    public int getCopies() {
        return copies;
    }

    public int getTotal() {
        return total;
    }


    public int getprice() {
        return price;
    }

    void read_publ() {
        System.out.print("enter title : ");
        title = sc.next();
        System.out.print("enter price:  ");
        price = sc.nextInt();
        System.out.print("enter copies: ");
        copies = sc.nextInt();
    }

    void display() {
        System.out.print(title + "\t" + price + "\t" + copies);
    }

    void sale_copy(int number) {
        if (number <= copies) {
            copies = copies - number;
            total = total + number * price;
            System.out.println("\tYOU PURCHASED  " + number + "  COPIES \n\tYOU HAVE TO PAY :  " + (price * number));
        } else
            System.out.println("     INSUFFICIENT STOCK!!!!!!!!!");
    }

}