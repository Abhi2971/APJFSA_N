import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Initialize an array to hold 5 elements
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");

        // Take 5 inputs from the user
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Assume the first element is the smallest
        int smallest = numbers[0];

        // Loop through the array to find the smallest element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i]; // Update the smallest if a smaller number is found
            }
        }

        // Print the smallest element
        System.out.println("The smallest element in the array is: " + smallest);
    }
}

