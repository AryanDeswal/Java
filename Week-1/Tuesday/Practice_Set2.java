import java.util.Scanner;

public class Practice_Set2 {
    public static void main(String[] args) {
        // Problem-1
        float res1 = 7 / 4.0f * 9 / 2.0f;
        System.out.println("Result: " + res1);

        // Problem-2
        System.out.println("Grade to be encrypted: ");
        Scanner sc = new Scanner(System.in);
        char grade = sc.next().charAt(1);
        grade = (char) (grade + 8);
        System.out.println("Encrypted grade: " + grade);
        grade = (char) (grade - 8);
        System.out.println("Decrypted grade: " + grade);

        // Problem-3
        System.out.println("Number for comparison: ");
        int x = sc.nextInt();
        boolean res2 = x>8;
        System.out.println("Comparison Result: " + res2);

        // Problem-4
        double v = 10.0, u = 5.0, a = 2.0, s = 3.0;   
        double res3 = (Math.pow(v, 2) - Math.pow(u, 2)) / (2 * a * s);
        System.out.println("Result: " + res3);

        // Problem-5
        int res4 = 7*49/7 + 35/7;
        System.out.println("Evaluation Result: " + res4);

        sc.close();
    }
}