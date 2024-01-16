import java.util.Scanner;

public class CBSE_Board_Percentage_Calculator{
    public static void main(String[] args) {
        float  totalMarks= 500.00f;
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter marks of your Subject1");
        float subject1 = sc.nextFloat();
        System.out.println("Please enter marks of your Subject2");
        float subject2 = sc.nextFloat();
        System.out.println("Please enter marks of your Subject3");
        float subject3 = sc.nextFloat();
        System.out.println("Please enter marks of your Subject4");
        float subject4 = sc.nextFloat();
        System.out.println("Please enter marks of your Subject5");
        float subject5 = sc.nextFloat();

        float obtained_marks = subject1+subject2+subject3+subject4+subject5;
        float percentageMarks = obtained_marks*100/totalMarks;
        System.out.println("Your Total Marks in percentage is "+percentageMarks+"%");
        sc.close();
    }
}