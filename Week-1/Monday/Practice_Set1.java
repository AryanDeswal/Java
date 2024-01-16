import java.util.Scanner;

public class Practice_Set1 {
    public static void main(String[] args) {
        // Problem-1
        int a = 2, b = 19, c = 4;
        int sum = a + b + c;
        System.out.println("1. Sum: " + sum);

        // Problem-2
        float subject1 = 45, subject2 = 95, subject3 = 48;
        float cgpa = (subject1 + subject2 + subject3) / 30;
        System.out.println("2. CGPA" + cgpa);

        // Problem-3
        System.out.println("What is your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day!");

        // Problem-4
        System.out.println("Enter the Distance in Kilometers: ");
        float km = sc.nextFloat();
        float miles = (float) (0.6213711922 * km);
        System.out.println("Distance in miles will be: " + miles);

        // Problem-5
        System.out.println("Enter Your Number");
        System.out.println("Is Number Integer: " + sc.hasNextInt());
        sc.close();
    }
}