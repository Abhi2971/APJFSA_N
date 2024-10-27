public class Q2 {
    public static void main(String[] args) {
        // Implicit Casting (Widening)
        int intValue = 100;
        long longValue = intValue; // int to long
        System.out.println("Implicit Casting: " + longValue);

        // Explicit Casting (Narrowing)
        double doubleValue = 9.78;
        int intValueFromDouble = (int) doubleValue; // double to int
        System.out.println("Explicit Casting: " + intValueFromDouble);
    }
}
