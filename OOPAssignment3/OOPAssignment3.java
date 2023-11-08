
/*
Design and develop inheritance for a given case study, identify objects and relationships 
and implement inheritance wherever applicable. Employee class has Emp_name, Emp_id, 
Address, Mail_id, and Mobile_no as members. Inherit the classes: Programmer, Team Lead, 
Assistant Project Manager and Project Manager from employee class. Add Basic Pay (BP) as 
the member of all the inherited classes . with 97% of BP as DA, 10 % of BP as HRA, 12% of 
BP as PF, 0.1% of BP for staff club fund. Generate pay slips for the employees with their 
gross and net salary 
*/

package OOPAssignment3;

import java.util.*;

class Employee {
	Scanner sc = new Scanner(System.in);
	String emp_name;
	String address;
	String mail_id;
	long mobile_no;
	int emp_id;
	double basic_pay;
	static int id = 10000;
	double net_salary, gross_salary;
	double hra, da, pf, staff_club_fund;

	Employee() {
		id++;
	}

	void input() {
		System.out.print("Enter the name of Employee: ");
		emp_name = sc.nextLine();
		System.out.print("Employee ID:  ");
		emp_id = sc.nextInt();
		emp_id = id;
		System.out.print("Enter Address:  ");
		address = sc.next();
		System.out.print("Enter Mobile No.:  ");
		mobile_no = sc.nextLong();
	}

	void display() {

		System.out.println("****************************************************************");
		System.out.println("EMP NAME\tID \tADDRESS\t\tMOBILE");
		System.out.println("****************************************************************");
		System.out.println(emp_name + "\t\t" + emp_id + "\t" + address + "\t\t" + mobile_no + "\n");
	}

	void salary() {
		da = basic_pay * .97;
		hra = basic_pay * .10;
		pf = basic_pay * .12;
		staff_club_fund = basic_pay * 0.001;
		gross_salary = basic_pay + hra;

		int k = 0;
		while (k < 3) {
			System.out.println(
					"   DOES DO YO HAVE DONE ANY EXTRA WORK \n\t1. PATENT \n\t2. OTHER BENIFICIAL WORK \n\t3.NO  ");
			System.out.print("Choice::");
			k = sc.nextInt();
			if (k == 1)
				gross_salary += 3000;
			else if (k == 2)
				gross_salary += 2000;
			else if (k == 3)
				break;
			else
				System.out.println("INVALID CHOICE.");
		}

		net_salary = gross_salary - pf - staff_club_fund;

		System.out.println("=================================================================================");
	}

	void salary_slip() {

		System.out.println("****************************************************************");
		System.out.println(" BASIC   PAY 		:	" + basic_pay);
		System.out.println(" HRA 	    	       	:	" + hra);
		System.out.println(" PF   	    		       :	" + pf);
		System.out.println(" GROSS SALARY       	: 	" + gross_salary);
		System.out.println(" NET SALARY 	       	: 	" + net_salary);
		System.out.println("****************************************************************");
	}

}

public class OOPAssignment3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Programmer p[] = new Programmer[3];

		TeamLead t[] = new TeamLead[3];

		Asst_pro_mng a[] = new Asst_pro_mng[2];

		Pro_mng m = new Pro_mng();

		aa: do {

			System.out.println("=================================================================================");
			System.out.println(
					" MAIN  MENU  \n\n1.PROGRAMMER \n2.TEAM LEAD \n3.ASSISTANT PROJECT MANAGER \n4.PROJECT MANAGER \n5.EMPLOYEE SEARCH \n6.EXIT");
			System.out.print("Choice::");
			int k = sc.nextInt();
			System.out.println("=================================================================================");
			int op;
			int assign1 = 0, assign2 = 0, assign3 = 0, assign4 = 0;

			switch (k) {

				case 1:
					do {
						System.out.print(
								"\tPROGRAMMER  MENU .....\n\t1. INPUT \n\t2. DISPLAY  \n\t3. EXIT FROM PROGRAMMER \n\tChoice::");
						op = sc.nextInt();

						System.out.println(
								"=================================================================================");
						if (op == 1) {
							assign1 = 6;
							for (int i = 0; i < 3; i++) {
								p[i] = new Programmer();

								p[i].read_programmer();

								p[i].salary();

							}
						} else if (op == 2 && assign1 == 6) {
							for (int i = 0; i < 3; i++) {
								p[i].display();

								p[i].salary_slip();

							}
						} else if (op == 2 && assign1 != 6)
							System.out.println("  MEMORY  NOT  ALLOCATED  TO  PROGRAMMERS  DETAIL  YET...  ");

						System.out.println(
								"===================================================================================================");
					} while (op != 3);
					break;

				case 2:
					do {
						System.out.print(
								"\tTEAMLEAD  MENU .....\n\t1. INPUT \n\t2. DISPLAY  \n\t3. EXIT FROM TEAMLEAD SECTION  \n\tChoice::");
						op = sc.nextInt();
						System.out.println(
								"===================================================================================================");
						if (op == 1) {
							assign2 = 4;
							for (int i = 0; i < 3; i++) {
								t[i] = new TeamLead();

								t[i].read_teamlead();

								t[i].salary();

							}
						} else if (op == 2 && assign2 == 4) {
							for (int i = 0; i < 3; i++) {
								t[i].display();

								t[i].salary_slip();

							}
						} else if (op == 2 && assign1 != 6)
							System.out.println("  MEMORY  NOT  ALLOCATED  TO  TEAMLEADS  DETAIL  YET...  ");
						System.out.println(
								"===================================================================================================");
					} while (op != 3);
					break;

				case 3:
					do {
						System.out.print(
								"\tASSISTANT MANAGER MENU .....\n\t1. INPUT \n\t2. DISPLAY  \n\t3. EXIT FROM  ASSISTANT MANAGER \n\tChoice::");
						op = sc.nextInt();
						System.out.println(
								"===================================================================================================");
						if (op == 1) {
							assign3 = 2;
							for (int i = 0; i < 2; i++) {
								a[i] = new Asst_pro_mng();

								a[i].read_Asst_pro_manager();

								a[i].salary();

							}
						} else if (op == 2 && assign3 == 2) {
							for (int i = 0; i < 2; i++) {
								a[i].display();

								a[i].salary_slip();

							}
						} else if (op == 2 && assign1 != 6)
							System.out.println("  MEMORY  NOT  ALLOCATED  TO  PROGRAMMERS  DETAIL  YET...  ");
						System.out.println(
								"===================================================================================================");
					} while (op != 3);
					break;

				case 4:
					do {
						System.out.print(
								"\tPROJECT MANAGER MENU .....\n\t1. INPUT \n\t2. DISPLAY  \n\t3. EXIT FROM  PROJECT  MANAGER  SECTION \n\tChoice::");
						op = sc.nextInt();
						System.out.println(
								"===================================================================================================");
						if (op == 1) {
							assign4 = 1;
							m.read_Pro_manager();

							m.salary();

						} else if (op == 2 && assign4 == 1) {
							m.display();

							m.salary_slip();

						} else if (op == 2 && assign1 != 6)
							System.out.println("  MEMORY  NOT  ALLOCATED  TO  PROGRAMMERS  DETAIL  YET...  ");
						System.out.println(
								"===================================================================================================");
					} while (op != 3);
					break;

				case 5:
					String des;
					int key;
					System.out.print("ENTER  THE  DISIGNATION  OF  EMPLOYEE  YOU  WANT  TO  SEARCH : ");
					des = sc.next();

					System.out.print("Enter Emplyee ID:");
					key = sc.nextInt();

					if (des.toLowerCase().equals("programmer")) {

						Programmer.search(p, key, 6);
					} else if (des.toLowerCase().equals("teamlead")) {

						TeamLead.search(t, key, 4);
					} else if (des.toLowerCase().equals("assistant")) {

						Asst_pro_mng.search(a, key, 2);
					} else if (des.toLowerCase().equals("manager")) {

						Pro_mng.search(m, key);

					} else {

						System.out.println("INVALID INPUT");
					}
					System.out.println(
							"===================================================================================================");
					break;

				case 6:
					System.out.print("Would you like to Exit\n\t1.YES\n\t2.No\n\tChoice::");
					int temp = sc.nextInt();
					if (temp == 1)
						break aa;

				default:
					System.out.println("   INVALID   ");
			}

		} while (true);
		sc.close();
	}
}

/*
 * 
 * 
 * ## Output ##
 * 
 * =============================================================================
 * ====
 * MAIN MENU
 * 
 * 1.PROGRAMMER
 * 2.TEAM LEAD
 * 3.ASSISTANT PROJECT MANAGER
 * 4.PROJECT MANAGER
 * 5.EMPLOYEE SEARCH
 * 6.EXIT
 * Choice::1
 * =============================================================================
 * ====
 * PROGRAMMER MENU .....
 * 1. INPUT
 * 2. DISPLAY
 * 3. EXIT FROM PROGRAMMER
 * Choice::1
 * =============================================================================
 * ====
 * Enter the name of Employee: Vaibhav
 * Employee ID: 1
 * Enter Address: Jalgaon
 * Enter Mobile No.: 8657575665
 * BASIC PAY[30000-40000]: 35241
 * =============================================================================
 * ====
 * DOES DO YO HAVE DONE ANY EXTRA WORK
 * 1. PATENT
 * 2. OTHER BENIFICIAL WORK
 * 3.NO
 * Choice::1
 * DOES DO YO HAVE DONE ANY EXTRA WORK
 * 1. PATENT
 * 2. OTHER BENIFICIAL WORK
 * 3.NO
 * Choice::3
 * =============================================================================
 * ====
 * Enter the name of Employee: Om
 * Employee ID: 45
 * Enter Address: pune
 * Enter Mobile No.: 8657421535
 * BASIC PAY[30000-40000]: 65241
 * SORRY!!!!!! BASIC PAY FOR PROGRAMMER MUST BETWEEN [30000 - 40000]
 * TRY AGAIN.....
 * BASIC PAY[30000-40000]: 36589
 * =============================================================================
 * ====
 * DOES DO YO HAVE DONE ANY EXTRA WORK
 * 1. PATENT
 * 2. OTHER BENIFICIAL WORK
 * 3.NO
 * Choice::3
 * =============================================================================
 * ====
 * Enter the name of Employee: Yash
 * Employee ID: 45
 * Enter Address: Yeola
 * Enter Mobile No.: 9856321475
 * BASIC PAY[30000-40000]: 35000
 * =============================================================================
 * ====
 * DOES DO YO HAVE DONE ANY EXTRA WORK
 * 1. PATENT
 * 2. OTHER BENIFICIAL WORK
 * 3.NO
 * Choice::3
 * =============================================================================
 * ====
 * =============================================================================
 * ======================
 * PROGRAMMER MENU .....
 * 1. INPUT
 * 2. DISPLAY
 * 3. EXIT FROM PROGRAMMER
 * Choice::2
 * =============================================================================
 * ====
 ****************************************************************
 * EMP NAME ID ADDRESS MOBILE
 ****************************************************************
 * Vaibhav 10002 Jalgaon 8657575665
 ****************************************************************
 * 
 * BASIC PAY : 35241.0
 * HRA : 3524.1000000000004
 * PF : 4228.92
 * GROSS SALARY : 41765.1
 * NET SALARY : 37500.939
 ****************************************************************
 ****************************************************************
 * EMP NAME ID ADDRESS MOBILE
 ****************************************************************
 * Om 10003 pune 8657421535
 ****************************************************************
 * 
 * BASIC PAY : 36589.0
 * HRA : 3658.9
 * PF : 4390.68
 * GROSS SALARY : 40247.9
 * NET SALARY : 35820.631
 ****************************************************************
 ****************************************************************
 * EMP NAME ID ADDRESS MOBILE
 ****************************************************************
 * Yash 10004 Yeola 9856321475
 ****************************************************************
 * 
 * BASIC PAY : 35000.0
 * HRA : 3500.0
 * PF : 4200.0
 * GROSS SALARY : 38500.0
 * NET SALARY : 34265.0
 ****************************************************************
 * =============================================================================
 * ======================
 * PROGRAMMER MENU .....
 * 1. INPUT
 * 2. DISPLAY
 * 3. EXIT FROM PROGRAMMER
 * Choice::3
 * =============================================================================
 * ====
 * =============================================================================
 * ======================
 * =============================================================================
 * ====
 * MAIN MENU
 * 
 * 1.PROGRAMMER
 * 2.TEAM LEAD
 * 3.ASSISTANT PROJECT MANAGER
 * 4.PROJECT MANAGER
 * 5.EMPLOYEE SEARCH
 * 6.EXIT
 * Choice::2
 * =============================================================================
 * ====
 * TEAMLEAD MENU .....
 * 1. INPUT
 * 2. DISPLAY
 * 3. EXIT FROM TEAMLEAD SECTION
 * Choice::1
 * =============================================================================
 * ======================
 * Enter the name of Employee: Rahul
 * Employee ID: 42
 * Enter Address: Parola
 * Enter Mobile No.: 9856741235
 * BASIC PAY [40000 - 50000] : 45236
 * =============================================================================
 * ====
 * DOES DO YO HAVE DONE ANY EXTRA WORK
 * 1. PATENT
 * 2. OTHER BENIFICIAL WORK
 * 3.NO
 * Choice::1
 * DOES DO YO HAVE DONE ANY EXTRA WORK
 * 1. PATENT
 * 2. OTHER BENIFICIAL WORK
 * 3.NO
 * Choice::2
 * DOES DO YO HAVE DONE ANY EXTRA WORK
 * 1. PATENT
 * 2. OTHER BENIFICIAL WORK
 * 3.NO
 * Choice::3
 * =============================================================================
 * ====
 * Enter the name of Employee: Harsh
 * Employee ID: 36
 * Enter Address: Satara
 * Enter Mobile No.: 8695741253
 * BASIC PAY [40000 - 50000] : 53241
 * SORRY!!!!!! BASIC PAY FOR TEAMLEAD MUST BETWEEN [40000 - 50000]
 * TRY AGAIN.....
 * BASIC PAY [40000 - 50000] : 45263
 * =============================================================================
 * ====
 * DOES DO YO HAVE DONE ANY EXTRA WORK
 * 1. PATENT
 * 2. OTHER BENIFICIAL WORK
 * 3.NO
 * Choice::3
 * =============================================================================
 * ====
 * Enter the name of Employee: Bhushan
 * Employee ID: 56
 * Enter Address: Pimpri
 * Enter Mobile No.: 9786541236
 * BASIC PAY [40000 - 50000] : 45260
 * =============================================================================
 * ====
 * DOES DO YO HAVE DONE ANY EXTRA WORK
 * 1. PATENT
 * 2. OTHER BENIFICIAL WORK
 * 3.NO
 * Choice::3
 * =============================================================================
 * ====
 * =============================================================================
 * ======================
 * TEAMLEAD MENU .....
 * 1. INPUT
 * 2. DISPLAY
 * 3. EXIT FROM TEAMLEAD SECTION
 * Choice::2
 * =============================================================================
 * ======================
 ****************************************************************
 * EMP NAME ID ADDRESS MOBILE
 ****************************************************************
 * Rahul 10005 Parola 9856741235
 ****************************************************************
 * 
 * BASIC PAY : 45236.0
 * HRA : 4523.6
 * PF : 5428.32
 * GROSS SALARY : 54759.6
 * NET SALARY : 49286.044
 ****************************************************************
 ****************************************************************
 * EMP NAME ID ADDRESS MOBILE
 ****************************************************************
 * Harsh 10006 Satara 8695741253
 ****************************************************************
 * 
 * BASIC PAY : 45263.0
 * HRA : 4526.3
 * PF : 5431.5599999999995
 * GROSS SALARY : 49789.3
 * NET SALARY : 44312.477000000006
 ****************************************************************
 ****************************************************************
 * EMP NAME ID ADDRESS MOBILE
 ****************************************************************
 * Bhushan 10007 Pimpri 9786541236
 ****************************************************************
 * 
 * BASIC PAY : 45260.0
 * HRA : 4526.0
 * PF : 5431.2
 * GROSS SALARY : 49786.0
 * NET SALARY : 44309.54
 ****************************************************************
 * =============================================================================
 * ======================
 * TEAMLEAD MENU .....
 * 1. INPUT
 * 2. DISPLAY
 * 3. EXIT FROM TEAMLEAD SECTION
 * Choice::3
 * =============================================================================
 * ======================
 * =============================================================================
 * ======================
 * =============================================================================
 * ====
 * MAIN MENU
 * 
 * 1.PROGRAMMER
 * 2.TEAM LEAD
 * 3.ASSISTANT PROJECT MANAGER
 * 4.PROJECT MANAGER
 * 5.EMPLOYEE SEARCH
 * 6.EXIT
 * Choice::3
 * =============================================================================
 * ====
 * ASSISTANT MANAGER MENU .....
 * 1. INPUT
 * 2. DISPLAY
 * 3. EXIT FROM ASSISTANT MANAGER
 * Choice::1
 * =============================================================================
 * ======================
 * Enter the name of Employee: Priya
 * Employee ID: 47
 * Enter Address: Nanded
 * Enter Mobile No.: 8695321479
 * BASIC PAY [50000 - 60000] : 57421
 * =============================================================================
 * ====
 * DOES DO YO HAVE DONE ANY EXTRA WORK
 * 1. PATENT
 * 2. OTHER BENIFICIAL WORK
 * 3.NO
 * Choice::1
 * DOES DO YO HAVE DONE ANY EXTRA WORK
 * 1. PATENT
 * 2. OTHER BENIFICIAL WORK
 * 3.NO
 * Choice::2
 * DOES DO YO HAVE DONE ANY EXTRA WORK
 * 1. PATENT
 * 2. OTHER BENIFICIAL WORK
 * 3.NO
 * Choice::3
 * =============================================================================
 * ====
 * Enter the name of Employee: Sneha
 * Employee ID: 32
 * Enter Address: Jalgaon
 * Enter Mobile No.: 9258746315
 * BASIC PAY [50000 - 60000] : 63524
 * SORRY!!!!!! BASIC PAY FOR TEAMLEAD MUST BETWEEN [50000 - 60000]
 * TRY AGAIN.....
 * BASIC PAY [50000 - 60000] : 56382
 * =============================================================================
 * ====
 * DOES DO YO HAVE DONE ANY EXTRA WORK
 * 1. PATENT
 * 2. OTHER BENIFICIAL WORK
 * 3.NO
 * Choice::3
 * =============================================================================
 * ====
 * =============================================================================
 * ======================
 * ASSISTANT MANAGER MENU .....
 * 1. INPUT
 * 2. DISPLAY
 * 3. EXIT FROM ASSISTANT MANAGER
 * Choice::2
 * =============================================================================
 * ======================
 ****************************************************************
 * EMP NAME ID ADDRESS MOBILE
 ****************************************************************
 * Priya 10008 Nanded 8695321479
 ****************************************************************
 * 
 * BASIC PAY : 57421.0
 * HRA : 5742.1
 * PF : 6890.5199999999995
 * GROSS SALARY : 68163.1
 * NET SALARY : 61215.15900000001
 ****************************************************************
 ****************************************************************
 * EMP NAME ID ADDRESS MOBILE
 ****************************************************************
 * Sneha 10009 Jalgaon 9258746315
 ****************************************************************
 * 
 * BASIC PAY : 56382.0
 * HRA : 5638.200000000001
 * PF : 6765.84
 * GROSS SALARY : 62020.2
 * NET SALARY : 55197.978
 ****************************************************************
 * =============================================================================
 * ======================
 * ASSISTANT MANAGER MENU .....
 * 1. INPUT
 * 2. DISPLAY
 * 3. EXIT FROM ASSISTANT MANAGER
 * Choice::3
 * =============================================================================
 * ======================
 * =============================================================================
 * ======================
 * =============================================================================
 * ====
 * MAIN MENU
 * 
 * 1.PROGRAMMER
 * 2.TEAM LEAD
 * 3.ASSISTANT PROJECT MANAGER
 * 4.PROJECT MANAGER
 * 5.EMPLOYEE SEARCH
 * 6.EXIT
 * Choice::4
 * =============================================================================
 * ====
 * PROJECT MANAGER MENU .....
 * 1. INPUT
 * 2. DISPLAY
 * 3. EXIT FROM PROJECT MANAGER SECTION
 * Choice::1
 * =============================================================================
 * ======================
 * Enter the name of Employee: Vivek
 * Employee ID: 53
 * Enter Address: Pune
 * Enter Mobile No.: 8357426935
 * BASIC PAY [60000 - 70000] : 68532
 * =============================================================================
 * ====
 * DOES DO YO HAVE DONE ANY EXTRA WORK
 * 1. PATENT
 * 2. OTHER BENIFICIAL WORK
 * 3.NO
 * Choice::1
 * DOES DO YO HAVE DONE ANY EXTRA WORK
 * 1. PATENT
 * 2. OTHER BENIFICIAL WORK
 * 3.NO
 * Choice::2
 * DOES DO YO HAVE DONE ANY EXTRA WORK
 * 1. PATENT
 * 2. OTHER BENIFICIAL WORK
 * 3.NO
 * Choice::3
 * =============================================================================
 * ====
 * =============================================================================
 * ======================
 * PROJECT MANAGER MENU .....
 * 1. INPUT
 * 2. DISPLAY
 * 3. EXIT FROM PROJECT MANAGER SECTION
 * Choice::2
 * =============================================================================
 * ======================
 ****************************************************************
 * EMP NAME ID ADDRESS MOBILE
 ****************************************************************
 * Vivek 10009 Pune 8357426935
 ****************************************************************
 * 
 * BASIC PAY : 68532.0
 * HRA : 6853.200000000001
 * PF : 8223.84
 * GROSS SALARY : 80385.2
 * NET SALARY : 72092.828
 ****************************************************************
 * =============================================================================
 * ======================
 * PROJECT MANAGER MENU .....
 * 1. INPUT
 * 2. DISPLAY
 * 3. EXIT FROM PROJECT MANAGER SECTION
 * Choice::3
 * =============================================================================
 * ======================
 * =============================================================================
 * ======================
 * =============================================================================
 * ====
 * MAIN MENU
 * 
 * 1.PROGRAMMER
 * 2.TEAM LEAD
 * 3.ASSISTANT PROJECT MANAGER
 * 4.PROJECT MANAGER
 * 5.EMPLOYEE SEARCH
 * 6.EXIT
 * Choice::5
 * =============================================================================
 * ====
 * ENTER THE DISIGNATION OF EMPLOYEE YOU WANT TO SEARCH : programmer
 * Enter Emplyee ID:10002
 * EMPLOYEE FOUND
 ****************************************************************
 * EMP NAME ID ADDRESS MOBILE
 ****************************************************************
 * Vaibhav 10002 Jalgaon 8657575665
 ****************************************************************
 * 
 * BASIC PAY : 35241.0
 * HRA : 3524.1000000000004
 * PF : 4228.92
 * GROSS SALARY : 41765.1
 * NET SALARY : 37500.939
 ****************************************************************
 * EMPLOYEEE WITH ID 10002 NOT FOUND IN PROGRAMMERS
 * EMPLOYEEE WITH ID 10002 NOT FOUND IN PROGRAMMERS
 * =============================================================================
 * ======================
 * =============================================================================
 * ====
 * MAIN MENU
 * 
 * 1.PROGRAMMER
 * 2.TEAM LEAD
 * 3.ASSISTANT PROJECT MANAGER
 * 4.PROJECT MANAGER
 * 5.EMPLOYEE SEARCH
 * 6.EXIT
 * Choice::5
 * =============================================================================
 * ====
 * ENTER THE DISIGNATION OF EMPLOYEE YOU WANT TO SEARCH : manager
 * Enter Emplyee ID:10009
 * EMPLOYEE FOUND
 ****************************************************************
 * EMP NAME ID ADDRESS MOBILE
 ****************************************************************
 * Vivek 10009 Pune 8357426935
 ****************************************************************
 * 
 * BASIC PAY : 68532.0
 * HRA : 6853.200000000001
 * PF : 8223.84
 * GROSS SALARY : 80385.2
 * NET SALARY : 72092.828
 ****************************************************************
 * =============================================================================
 * ======================
 * =============================================================================
 * ====
 * MAIN MENU
 * 
 * 1.PROGRAMMER
 * 2.TEAM LEAD
 * 3.ASSISTANT PROJECT MANAGER
 * 4.PROJECT MANAGER
 * 5.EMPLOYEE SEARCH
 * 6.EXIT
 * Choice::6
 * =============================================================================
 * ====
 * Would you like to Exit
 * 1.YES
 * 2.No
 * Choice::1
 * 
 */