import java.util.Scanner;

// Shape.java
interface Shape {
    double getArea();
}

// Rectangle.java
class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}

// Circle.java
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Triangle.java
class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}

// Main.java
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Rectangle
        System.out.print("Enter width of the rectangle: ");
        double rectangleWidth = scanner.nextDouble();
        System.out.print("Enter height of the rectangle: ");
        double rectangleHeight = scanner.nextDouble();
        Shape rectangle = new Rectangle(rectangleWidth, rectangleHeight);
        System.out.println("Rectangle Area: " + rectangle.getArea());

        // Circle
        System.out.print("Enter radius of the circle: ");
        double circleRadius = scanner.nextDouble();
        Shape circle = new Circle(circleRadius);
        System.out.println("Circle Area: " + circle.getArea());

        // Triangle
        System.out.print("Enter base of the triangle: ");
        double triangleBase = scanner.nextDouble();
        System.out.print("Enter height of the triangle: ");
        double triangleHeight = scanner.nextDouble();
        Shape triangle = new Triangle(triangleBase, triangleHeight);
        System.out.println("Triangle Area: " + triangle.getArea());

        scanner.close();
    }
}

/*
OUTPUT
Enter width of the rectangle: 10
Enter height of the rectangle: 4
Rectangle Area: 40.0
Enter radius of the circle: 5
Circle Area: 78.53981633974483
Enter base of the triangle: 8
Enter height of the triangle: 4
Triangle Area: 16.0

*/
