// Person.java
interface Person {
    void speak();
}

// Student.java
class Student implements Person {
    public void speak() {
        System.out.println("Hello, I am a Student.");
    }
}

// Teacher.java
class Teacher implements Person {
    public void speak() {
        System.out.println("Hello, I am a Teacher.");
    }
}

// Main.java
public class Q1 {
    public static void main(String[] args) {
        Person student = new Student();
        Person teacher = new Teacher();
        
        student.speak();
        teacher.speak();
    }
}

/*
OUTPUT
Hello, I am a Student.
Hello, I am a Teacher.

*/

