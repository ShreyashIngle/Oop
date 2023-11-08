package OOPAssignment2;

class magazine extends publication {

    private int order_qty;
    private String issue_date;

    void receive_issue(String new_issue_date) {
        System.out.println("ENTER NEW COPIES ORDERED: ");
        order_qty = sc.nextInt();

        setcopies(order_qty);

        issue_date = new_issue_date;
        System.out.println("\tTHE MAGAZINE " + gettitle() + " \n\t WITH ISSUE DATE " + issue_date + "AVAILABLE");
    }

    void read_mag() {
        read_publ();
        System.out.print("Enter THe Current Issue Date [dd/mm/yyyy]");
        issue_date = sc.next();
    }

    void display_mag() {
        System.out.println("title \tprice \tcopy \tdate");
        display();
        System.out.println("\t" + issue_date);
    }
}
