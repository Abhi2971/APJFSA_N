import java.util.Scanner;

public class LargestElement {
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

        // Assume the first element is the largest
        int largest = numbers[0];

        // Loop through the array to find the largest element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i]; // Update the largest if a bigger number is found
            }
        }

        // Print the largest element
        System.out.println("The largest element in the array is: " + largest);

    }
}

