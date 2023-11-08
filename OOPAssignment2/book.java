package OOPAssignment2;

class book extends publication {

    private String author;

    void order_copies(int number) {
        int x = getCopies() + number;
        setcopies(getCopies() + number);
        System.out.println("\n\tORDER SUCESSFUL....");
        System.out.println("\tCOPIES AVAILABLE : " + x);
    }

    void read_book() {
        read_publ();
        System.out.print("enter author book: ");
        author = sc.next();
    }

    void display_book() {
        System.out.println("title \tprice \tcopy \tauthor");
        display();
        System.out.println("\t" + author);
    }
}