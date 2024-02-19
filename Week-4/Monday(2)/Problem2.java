public class Problem2 {
    public static void main(String[] args) {
        System.out.println("Problem 2:");
        try {
            int result = 5 / 0; // Arithmetic exception
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("HaHa");
        }

        try {
            throw new IllegalArgumentException(); // Illegal argument exception
        } catch (IllegalArgumentException e) {
            System.out.println("HeHe");
        }
    }
}