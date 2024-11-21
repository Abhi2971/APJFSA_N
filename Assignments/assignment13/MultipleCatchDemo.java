public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // This will cause an ArrayIndexOutOfBoundsException
            int num = 10 / 0;          // This will cause an ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array index is out of bounds.");
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("General exception caught.");
        }

        System.out.println("Program continues...");
    }
}

/*
OUTPUT :-
Exception caught: Array index is out of bounds.
Program continues...
*/
