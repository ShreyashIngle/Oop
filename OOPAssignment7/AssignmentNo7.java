package OOPAssignment7;

import java.util.*;

class Generic {
    public static <T extends Number> void count(List<T> numbers) {
        int evenCount = 0;
        int oddCount = 0;
        int paliCount = 0;
        int primeCount = 0;

        for (T number : numbers) {
            if (isEven(number)) {
                evenCount++;
            }
            if (isOdd(number)) {
                oddCount++;
            }
            if (isPalindrome(number)) {
                paliCount++;
            }
            if (isPrime(number)) {
                primeCount++;
            }

        }
        System.out.println("Number");
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);
        System.out.println("Prime: " + primeCount);
        System.out.println("Palindrome: " + paliCount);
    }

    public static <T extends Number> boolean isEven(T number) {
        return number.intValue() % 2 == 0;
    }

    public static <T extends Number> boolean isOdd(T number) {
        return number.intValue() % 2 == 1;
    }

    public static <T extends Number> boolean isPalindrome(T number) {
        int original = number.intValue();
        int reversed = 0;
        int temp = original;
        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp = temp / 10;
        }
        return original == reversed;
    }

    public static <T extends Number> boolean isPrime(T number) {
        if (number.intValue() <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number.intValue()); i++) {
            if (number.intValue() % i == 0) {
                return false;
            }
        }

        return true;
    }
}

public class AssignmentNo7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Get user input for integers
            List<Integer> intList = new ArrayList<>();
            System.out.println("Enter the number of integers: ");
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.println("Enter integer " + (i + 1) + ": ");
                int number = sc.nextInt();
                intList.add(number);
            }
            List<Double> num = new ArrayList<>();
            System.out.println("Enter the number of double: ");
            int n1 = sc.nextInt();

            for (int i = 0; i < n1; i++) {
                System.out.println("Enter integer " + (i + 1) + ": ");
                double number = sc.nextDouble();
                num.add(number);
            }

            System.out.println("\nIntegers:");
            Generic.count(intList);
            System.out.println("\nDouble:");
            Generic.count(num);
            sc.close();
        }
    }
}
