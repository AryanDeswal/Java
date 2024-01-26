public class Practice_Set {
    public static void main(String[] args) {
        // Problem 1
        System.out.println("Problem 1");
        int number = 5;
        printMultiplicationTable(number);

        // Problem 2
        System.out.println("Problem 2");
        int rows = 4;
        printPattern(rows);

        // Problem 3
        System.out.println("Problem 3");
        int n = 5;
        int result = sumOfNaturalNumbers(n);
        System.out.println("Sum of first " + n + " natural numbers: " + result);

        // Problem 4
        System.out.println("Problem 4");
        int rows1 = 4;
        printPattern1(rows1);

        // Problem 5
        System.out.println("Problem 5");
        int termNumber = 6;
        int result1 = fibonacci(termNumber);
        System.out.println("The " + termNumber + "th term of the Fibonacci series is: " + result1);

        // Problem 6
        System.out.println("Problem 6");
        double average1 = calculateAverage(5.0, 10.0, 15.0, 20.0);
        System.out.println("Average 1: " + average1);
        double average2 = calculateAverage(2.5, 3.0, 4.5, 6.0, 7.5);
        System.out.println("Average 2: " + average2);
        double average3 = calculateAverage();
        System.out.println("Average 3: " + average3);

        // Problem 7
        System.out.println("Problem 7");
        int rows3 = 4; // You can change the value to adjust the number of rows
        printPattern3(rows3, 1);

        // Problem 8
        System.out.println("Problem 8");
        int rows2 = 4;
        printPattern2(rows2);

        // Problem 9
        System.out.println("Problem 9");
        double celsiusTemperature = 25.0;
        double fahrenheitTemperature = celsiusToFahrenheit(celsiusTemperature);
        System.out.println(celsiusTemperature + " degrees Celsius is equal to " + fahrenheitTemperature + " degrees Fahrenheit.");

        // Problem 10
        System.out.println("Problem 10");
        int n1 = 5;
        int result2 = sumOfNaturalNumbers1(n);
        System.out.println("Sum of first " + n1 + " natural numbers: " + result2);
    }

    static int sumOfNaturalNumbers1(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    static void printPattern3(int n, int currentRow) {
        if (currentRow > n) {
            return;
        }
        printSpaces(n, currentRow);
        printStars(currentRow);
        System.out.println();
        printPattern3(n, currentRow + 1);
    }

    static void printStars(int count) {
        if (count > 0) {
            System.out.print("*");
            printStars(count - 1);
        }
    }

    static void printSpaces(int n, int currentRow) {
        if (n > currentRow) {
            System.out.print(" ");
            printSpaces(n, currentRow + 1);
        }
    }

    static void printPattern2(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static double calculateAverage(double... numbers) {
        if (numbers.length == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    static void printPattern1(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printMultiplicationTable(int n) {
        System.out.println("Multiplication Table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(n + " * " + i + " = " + result);
        }
    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int sumOfNaturalNumbers(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumOfNaturalNumbers(n - 1);
        }
    }
}