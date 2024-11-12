public class Perimeter {

    // Method to calculate the perimeter of a square
    public double calculate(double side) {
        return 4 * side;
    }

    // Method to calculate the perimeter of a rectangle
    public double calculate(double length, double breadth) {
        return 2 * (length + breadth);
    }

    // Method to calculate the perimeter of a circle
    public double calculate(int radius) {
        return 2 * (22.0 / 7) * radius;
    }

    // Main method to test the Perimeter class
    public static void main(String[] args) {
        Perimeter perimeter = new Perimeter();

        // Calculate and display the perimeter of a square
        double squarePerimeter = perimeter.calculate(5.0);
        System.out.println("Perimeter of square with side 5.0: " + squarePerimeter);

        // Calculate and display the perimeter of a rectangle
        double rectanglePerimeter = perimeter.calculate(4.0, 6.0);
        System.out.println("Perimeter of rectangle with length 4.0 and breadth 6.0: " + rectanglePerimeter);

        // Calculate and display the perimeter of a circle
        double circlePerimeter = perimeter.calculate(7);
        System.out.println("Perimeter of circle with radius 7: " + circlePerimeter);
    }
}

/*
OUTPUT
Perimeter of square with side 5.0: 20.0
Perimeter of rectangle with length 4.0 and breadth 6.0: 20.0
Perimeter of circle with radius 7: 44.0


*/
