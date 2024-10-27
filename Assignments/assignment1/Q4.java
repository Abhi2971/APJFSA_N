import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Swapping the numbers
        int temp = num1;
        num1 = num2;
        num2 = temp;

        int sum = num1 + num2;
        System.out.println("After swapping, the addition is: " + sum);
        scanner.close();
    }
}
