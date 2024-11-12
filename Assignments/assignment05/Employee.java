public class Employee {
    private int empId;
    private String empName;
    private int empAge;
    private double empSalary;

    // Parameterized constructor
    public Employee(int empId, String empName, int empAge, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    // Getter and Setter methods...

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Age: " + empAge);
        System.out.println("Employee Salary: " + empSalary);
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Creating an instance of Employee
        Employee employee = new Employee(101, "John Doe", 30, 55000.75);
        employee.displayEmployeeDetails();
    }
}
/*
OUTPUT
Employee ID: 101
Employee Name: John Doe
Employee Age: 30
Employee Salary: 55000.75

*/
