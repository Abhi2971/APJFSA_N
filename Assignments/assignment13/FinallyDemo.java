public class FinallyDemo {
    public static void main(String[] args) {
        try {
            int num = 10 / 0; // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed.");
        } finally {
            System.out.println("This block always executes.");
        }

        System.out.println("Program continues...");
    }
}
/*
OUTPUT:-
Exception caught: Division by zero is not allowed.
This block always executes.
Program continues...
*/
