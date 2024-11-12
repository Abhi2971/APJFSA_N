import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter three numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Initialize variable to store the largest number
        int largest;

        // Check if the first number is greater than or equal to the other two numbers
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        }
        // If not, check if the second number is greater than or equal to the third number
        else if (num2 >= num3) {
            largest = num2;
        }
        // If neither of the above conditions is true, the third number is the largest
        else {
            largest = num3;
        }

        // Display the largest number
        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}

/*
OUTPUT
Enter first number: 23
Enter second number: 32
Enter third number: 1
The largest number is: 32
*/
