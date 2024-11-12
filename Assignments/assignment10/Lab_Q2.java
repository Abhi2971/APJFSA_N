//2. Write a Java program  to invoke parent class constructor using super keyword.

class Parent {
    // Parent class constructor
    Parent() {
        System.out.println("Parent class constructor called");
    }
}

class Child extends Parent {
    // Child class constructor that invokes the parent class constructor
    Child() {
        super();  // Calls the parent class constructor
        System.out.println("Child class constructor called");
    }
}

public class Lab_Q2 {

    public static void main(String[] args) {
        // Creating an instance of Child, which will automatically call the Parent constructor
        Child obj = new Child();
    }
}

/*OUTPUT
 Parent class constructor called
Child class constructor called
 */
