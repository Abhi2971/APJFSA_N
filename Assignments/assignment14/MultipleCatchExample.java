// Program demonstrating multiple catch statements and a finally block
public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            String text = null;
            // This will throw a NullPointerException
            System.out.println(text.length());

            int[] numbers = {1, 2, 3};
            // This will throw an ArrayIndexOutOfBoundsException
            System.out.println(numbers[5]);
        } catch (NullPointerException e) {
            // Handling NullPointerException
            System.out.println("Error: Null value encountered!");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling ArrayIndexOutOfBoundsException
            System.out.println("Error: Array index is out of bounds!");
        } finally {
            // This block executes regardless of exceptions
            System.out.println("Finally block executed.");
        }
    }
}
   
/*
OUTPUT
Error: Null value encountered!
Finally block executed.
*/
