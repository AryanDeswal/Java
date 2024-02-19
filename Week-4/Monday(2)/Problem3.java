public class Problem3 {
    public static void main(String[] args) {
        System.out.println("Problem 3:");
        int maxRetries = 5;
        int retries = 0;

        while (retries < maxRetries) {
            try {
                throw new RuntimeException();
            } catch (Exception e) {
                retries++;
                System.out.println("Retry attempt: " + retries);
            }
        }

        if (retries >= maxRetries) {
            System.out.println("Errors");
        }
    }
}