import java.util.Scanner;

public class CustomCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter first operand: ");
            int operand1 = scanner.nextInt();

            System.out.print("Enter second operand: ");
            int operand2 = scanner.nextInt();

            int result = calculate(operator, operand1, operand2);
            System.out.println("Result: " + result);
        } catch (InvalidInputException | CannotDivideByZeroException | MaxInputException
                | MaxMultiplierReachedException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }

    public static int calculate(char operator, int operand1, int operand2)
            throws InvalidInputException, CannotDivideByZeroException, MaxInputException,
            MaxMultiplierReachedException {
        if (operand1 > 100000 || operand2 > 100000) {
            throw new MaxInputException("Max input exceeded (100000)");
        }

        if (!isValidOperator(operator)) {
            throw new InvalidInputException("Invalid operator: " + operator);
        }

        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                if (operand1 > 7000 || operand2 > 7000) {
                    throw new MaxMultiplierReachedException("Max multiplier reached (7000)");
                }
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new CannotDivideByZeroException("Cannot divide by zero");
                }
                return operand1 / operand2;
            default:
                throw new InvalidInputException("Invalid operator: " + operator);
        }
    }

    public static boolean isValidOperator(char operator) {
        return operator == '+' || operator == '-' || operator == '*' || operator == '/';
    }
}

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

class CannotDivideByZeroException extends Exception {
    public CannotDivideByZeroException(String message) {
        super(message);
    }
}

class MaxInputException extends Exception {
    public MaxInputException(String message) {
        super(message);
    }
}

class MaxMultiplierReachedException extends Exception {
    public MaxMultiplierReachedException(String message) {
        super(message);
    }
}