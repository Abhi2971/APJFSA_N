public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        // Initialize an array with 5 elements
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array elements:");
        for (int i = 0; i <= numbers.length; i++) { // Intentionally use <= to access out-of-bounds
            try {
                // Attempt to access array elements
                System.out.println("Element at index " + i + ": " + numbers[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                // Catch the exception and display a message
                System.out.println("Exception caught: " + e.getMessage());
            }
        }
    }
}
/*
OUTPUT
Array elements:
Element at index 0: 10
Element at index 1: 20
Element at index 2: 30
Element at index 3: 40
Element at index 4: 50
Exception caught: Index 5 out of bounds for length 5
*/
