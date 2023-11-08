package OOPAssignment3;

class Programmer extends Employee {

    void read_programmer() {

        input();
        boolean a = false;
        while (a == false) {
            System.out.print("BASIC PAY[30000-40000]: ");
            basic_pay = sc.nextDouble();
            if (basic_pay > 40000 || basic_pay < 30000) {

                System.out.println(
                        "SORRY!!!!!! BASIC  PAY FOR PROGRAMMER  MUST BETWEEN  [30000 - 40000]  \nTRY AGAIN.....");
                a = false;
            } else
                a = true;
        }

        System.out.println("=================================================================================");
    }

    static void search(Programmer arr[], int key, int n) {

        for (int i = 0; i < n; i++) {
            if (arr[i].emp_id == key) {
                System.out.println("       EMPLOYEE  FOUND  ");

                arr[i].display();
                arr[i].salary_slip();
            } else {
                System.out.println("  EMPLOYEEE   WITH  ID  " + key + "  NOT FOUND IN  PROGRAMMERS  ");
            }
        }
    }
}
