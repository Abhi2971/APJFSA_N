import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Call method to check if number is palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        scanner.close();
    }

    // Method to check if a number is palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number;  // Store the original number
        int reversedNumber = 0;

        // Reverse the number
        while (number > 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        // Check if reversed number is equal to the original number
        return originalNumber == reversedNumber;
    }
}
/*
OUTPUT 
Enter a number: 51
51 is not a palindrome.
*/
