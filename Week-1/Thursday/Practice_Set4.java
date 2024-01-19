import java.util.Scanner;

public class Practice_Set4 {
    public static void main(String[] args) {
        // Problem 1
        // int a = 10;
        // if (a=11){
        // System.out.println("I am 11");}
        // else
        // System.out.println("I am not 11");
        // Output: "I am 11"

        Scanner scanner = new Scanner(System.in);

        // Problem 2
        System.out.println("Problem 2");
        System.out.println("Enter marks for Physics: ");
        int subject1Marks = scanner.nextInt();

        System.out.println("Enter marks for Chemistry: ");
        int subject2Marks = scanner.nextInt();

        System.out.println("Enter marks for Mathematics: ");
        int subject3Marks = scanner.nextInt();

        double totalPercentage = (subject1Marks + subject2Marks + subject3Marks) / 3.0;

        if (totalPercentage >= 40 && subject1Marks >= 33 && subject2Marks >= 33 &&
                subject3Marks >= 33) {
            System.out.println("Congratulations! You have passed.");
        } else {
            System.out.println("Sorry, you have failed.");
        }

        // Problem 3
        System.out.println("Problem 3");
        System.out.println("Enter your annual income: ");
        double income = scanner.nextDouble();

        double tax = 0;

        if (income >= 250000 && income < 500000) {
            tax = 0.05 * (income - 250000);
        } else if (income >= 500000 && income < 1000000) {
            tax = 0.2 * (income - 500000) + 0.05 * 250000;
        } else if (income >= 1000000) {
            tax = 0.3 * (income - 1000000) + 0.2 * 500000 + 0.05 * 250000;
        }

        System.out.println("Your income tax is: " + tax);

        // Problem 4
        System.out.println("Problem 4");
        System.out.println("Enter a number (1 for Monday, 2 for Tuesday, and so on):");
        int dayNumber = scanner.nextInt();

        String dayOfWeek = findDayOfWeek(dayNumber);

        if (dayOfWeek != null) {
            System.out.println("The day corresponding to " + dayNumber + " is: " +
                    dayOfWeek);
        } else {
            System.out.println("Invalid day number. Please enter a number between 1 and 7.");
        }

        // Problem 5
        System.out.println("Problem 5");
        System.out.println("Enter a year to check if it's a leap year: ");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // Problem 6
        System.out.println("Problem 6");
        System.out.println("Enter the URL: ");
        String url = scanner.next();

        String websiteType = checkWebsiteType(url);

        if (websiteType != null) {
            System.out.println("The type of website for " + url + " is: " + websiteType);
        } else {
            System.out.println("Invalid URL or unrecognized domain.");
        }

        scanner.close();
    }

    public static String findDayOfWeek(int dayNumber) {
        if (dayNumber >= 1 && dayNumber <= 7) {
            String[] daysOfWeek = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
            return daysOfWeek[dayNumber - 1];
        } else {
            return null;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    public static String checkWebsiteType(String url) {
        if (url.endsWith(".com")) {
            return "Commercial Website";
        } else if (url.endsWith(".org")) {
            return "Organization Website";
        } else if (url.endsWith(".in")) {
            return "Indian Website";
        } else {
            return null;
        }
    }
}