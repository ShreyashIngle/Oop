package OOPAssignment3;

class Asst_pro_mng extends Employee {

    void read_Asst_pro_manager() {

        input();
        boolean a = false;
        while (a == false) {
            System.out.print("BASIC   PAY  [50000 - 60000] : ");
            basic_pay = sc.nextDouble();
            if (basic_pay > 60000 || basic_pay < 50000) {

                System.out
                        .println("SORRY!!!!!! BASIC  PAY FOR TEAMLEAD  MUST BETWEEN  [50000 - 60000] \nTRY AGAIN.....");
                a = false;
            } else
                a = true;
        }
        System.out.println("=================================================================================");
    }

    static void search(Asst_pro_mng arr[], int key, int n) {

        for (int i = 0; i < n; i++) {
            if (arr[i].emp_id == key) {
                System.out.println("       EMPLOYEE  FOUND  ");

                arr[i].display();
                arr[i].salary_slip();
            } else {

                System.out.println("  EMPLOYEEE   WITH  ID  " + key + "  NOT FOUND IN  TEAMLEAD  ");
            }
        }
    }
}
