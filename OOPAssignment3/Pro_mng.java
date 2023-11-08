package OOPAssignment3;

class Pro_mng extends Employee {
    void read_Pro_manager() {

        input();
        boolean a = false;
        while (a == false) {
            System.out.print("BASIC   PAY  [60000 - 70000] : ");
            basic_pay = sc.nextDouble();
            if (basic_pay > 70000 || basic_pay < 60000) {

                System.out
                        .println("SORRY!!!!!! BASIC  PAY FOR TEAMLEAD  MUST BETWEEN  [60000 - 70000] \nTRY AGAIN.....");
                a = false;
            } else
                a = true;
        }
        System.out.println("=================================================================================");
    }

    static void search(Pro_mng arr, int key) {

        if (arr.emp_id == key) {
            System.out.println("       EMPLOYEE  FOUND  ");

            arr.display();
            arr.salary_slip();
        } else {

            System.out.println("  EMPLOYEEE   WITH  ID  " + key + "  NOT FOUND IN  TEAMLEAD  ");
        }
    }
}