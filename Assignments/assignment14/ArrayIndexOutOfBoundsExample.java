// Program using exception handling to handle ArrayIndexOutOfBoundsException
public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        try {
            // Accessing an invalid index
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the exception
            System.out.println("Error: Invalid array index access!");
        }
        System.out.println("Program continues...");
    }
}

/*
OUTPUT
Error: Invalid array index access!
Program continues...
*/
