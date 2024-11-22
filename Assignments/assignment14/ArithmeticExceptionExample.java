// Program demonstrating exception handling using try-catch for ArithmeticException
public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempting to divide by zero
            int result = 10 / 0;
            System.out.println("Result: " + result); // This line won't execute
        } catch (ArithmeticException e) {
            // Handling the ArithmeticException
            System.out.println("Error: Cannot divide by zero!");
        }
    }
}

/*
OUTPUT
Error: Cannot divide by zero!
*/
