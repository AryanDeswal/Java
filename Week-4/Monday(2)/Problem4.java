class MaxRetryException extends Exception {
    public MaxRetryException(String message) {
        super(message);
    }
}

public class Problem4 {
    public static void main(String[] args) {
        try {
            performActionWithRetries();
        } catch (MaxRetryException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void performActionWithRetries() throws MaxRetryException {
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
            throw new MaxRetryException("Max retries exceeded");
        }
    }
}