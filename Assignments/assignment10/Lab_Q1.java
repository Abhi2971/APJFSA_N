//1. Write a Java Program  to pass  this keyword as argument in the constructor call.

class Engine {
    Car car; // Reference to a Car object
    
    // Constructor that accepts a Car object
    Engine(Car car) {
        this.car = car;
    }

    void showCarDetails() {
        System.out.println("Car Model: " + car.model);
        System.out.println("Car Year: " + car.year);
    }
}

class Car {
    String model;
    int year;
    Engine engine;

    // Car constructor initializing model, year and passing "this" to Engine constructor
    Car(String model, int year) {
        this.model = model;
        this.year = year;
        this.engine = new Engine(this); // Passing 'this' as an argument
    }

    void display() {
        System.out.println("Displaying Car Details:");
        engine.showCarDetails();
    }
}

public class Lab_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a Car object
        Car car = new Car("Toyota Corolla", 2022);
        
        // Displaying car details using engine object
        car.display();
	}

}
/*
 OUTPUT
 
Displaying Car Details:
Car Model: Toyota Corolla
Car Year: 2022
*/
