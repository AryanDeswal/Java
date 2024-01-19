import java.util.Scanner;

public class Practice_Set5 {
    public static void main(String[] args) {
        // Problem 1
        System.out.println("Problem 1");
        int rows = 4;
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        Scanner scanner = new Scanner(System.in);
        
        // Problem 2
        System.out.println("Problem 2");
        System.out.println("Enter the value of n: ");
        int n1 = scanner.nextInt();
        
        int sum1 = 0;
        int itr1 = 1; 
        
        while (n1 > 0) {
            if (itr1 % 2 == 0) {
                sum1 += itr1;
                n1--;
            }
            itr1++;
        }
        
        System.out.println("Sum of the first " + (itr1/2) + " even numbers is: " + sum1);
        
        // Problem 3
        System.out.println("Problem 3");
        System.out.println("Enter the number to print its multiplication table: ");
        int n2 = scanner.nextInt();

        System.out.println("Multiplication table for " + n2 + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(n2 + " x " + i + " = " + (n2 * i));
        }

        // Problem 4
        System.out.println("Problem 4");
        int n = 10;

        System.out.println("Reverse multiplication table for " + n + ":");

        for (int i = 10; i >= 1; i--) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        // Problem 5
        System.out.println("Problem 5");
        System.out.println("Enter a number to find its factorial: ");
        int number1 = scanner.nextInt();

        long factorial1 = 1;

        if (number1 >= 0) {
            for (int i = 1; i <= number1; i++) {
                factorial1 *= i;
            }
            System.out.println("Factorial of " + number1 + " is: " + factorial1);
        } else {
            System.out.println("Factorial is undefined for negative numbers.");
        }

        // Problem 6
        System.out.println("Problem 6");
        System.out.println("Enter a number to find its factorial: ");
        int number2 = scanner.nextInt();

        long factorial2 = 1;

        if (number2 >= 0) {
            int i = 1;
            while (i <= number2) {
                factorial2 *= i;
                i++;
            }

            System.out.println("Factorial of " + number2 + " is: " + factorial2);
        } else {
            System.out.println("Factorial is undefined for negative numbers.");
        }

        // Problem 7
        System.out.println("Problem 7");
        System.out.println("Using While Loop:");

        int itr2 = 4;
        while (itr2 >= 1) {
            int j = 1;
            while (j <= itr2) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            itr2--;
        }

        // Problem 8
        System.out.println("Problem 8");
        System.out.println("What can be done using one type of loop can also be done using the other two types of loops - True");

        // Problem 9
        System.out.println("Problem 9");
        int multiplier = 8;
        int limit = 10;
        int sum2 = 0;

        System.out.println("Multiplication table of " + multiplier + ":");
        for (int i = 1; i <= limit; i++) {
            int result = multiplier * i;
            System.out.println(multiplier + " x " + i + " = " + result);

            sum2 += result;
        }

        System.out.println("Sum of the numbers in the multiplication table of " + multiplier + " is: " + sum2);

        // Problem 10
        System.out.println("Problem 10");
        System.out.println("A do-while loop is executed: At least once");

        // Problem 11
        System.out.println("Problem 11");
        System.out.println("Enter the value of n: ");
        int num = scanner.nextInt();

        int sum3 = 0;

        for (int i = 1; i <= num; i++) {
            int evenNumber = 2 * i;
            sum3 += evenNumber;
        }

        System.out.println("Sum of the first " + num + " even numbers is: " + sum3);

        scanner.close();
    }
}