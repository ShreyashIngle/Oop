
package OOPAssignment7;

import java.util.*;

class AssignmentNo7 {
    static int count = 0;

    static void check_palindrome(String x) {
        StringBuilder s1 = new StringBuilder(x);
        if (x.equals(s1.reverse().toString())) {
            System.out.println(x + " is a Palindrome");
            count += 1;
        } else {
            System.out.println(x + " is not a Palindrome");
        }
    }

    static void even_odd(int x) {
        if (x % 2 == 0) {
            System.out.println(x + " IS EVEN");
            count += 1;
        } else {
            System.out.println(x + " IS ODD");
        }
    }

    static void prime(int x) {
        if (x <= 1) {
            System.out.println(x + " is not a prime number.");
            return;
        }

        for (int i = 2; i <= x / 2; ++i) {
            if (x % i == 0) {
                System.out.println(x + " is not a prime number.");
                return;
            }
        }

        System.out.println(x + " is a prime number.");
        count += 1;
    }

    static void check(int ch, int x) {
        switch (ch) {
            case 1:
                even_odd(x);
                break;
            case 2:
                prime(x);
                break;
            default:
                System.out.println("ENTER CORRECT OPTION");
        }
    }

    static void number_op() {
        int element, n, choice;

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<Integer>();

        System.out.println("Enter the number of elements:");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element:" + (i + 1));
            element = sc.nextInt();
            nums.add(element);
        }
        System.out.println("\nEnter the Operation to be performed:");
        System.out.println("1. ODD or EVEN?");
        System.out.println("2. CHECK PRIME ?");
        choice = sc.nextInt();

        for (int num : nums) {
            check(choice, num);
        }

        if (choice == 1) {
            System.out.println("\nThe number of EVEN numbers is: " + count);
            System.out.println("The number of ODD numbers is: " + (nums.size() - count));
        } else {
            System.out.println("\nThe number of PRIME numbers is: " + count);
            System.out.println("The number of Non-PRIME numbers is: " + (nums.size() - count));
        }
    }

    static void string_op() {
        int n;
        String word;

        ArrayList<String> words = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings?");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter string: " + (i + 1));
            word = sc.next();
            words.add(word);
        }
        count = 0;
        for (String w : words) {
            check_palindrome(w);
        }

        System.out.println("The number of PALINDROMES is: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;

        do {
            System.out.println("\n-----MENU-----\n[1] String\n[2] Integer");
            System.out.println("Enter the choice(0 to exit):");
            ch = sc.nextInt();

            if (ch == 1) {
                string_op();
            }

            else if (ch == 2) {
                number_op();
            } else {
                System.out.print("\nINVALID INPUT!!");
            }
        } while (ch != 0);
        System.out.print("\nOPERATION COMPLETED!!! Thank you :) ");

    }

}