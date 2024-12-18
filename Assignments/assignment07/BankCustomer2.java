public class BankCustomer2 {
    private int acno;
    private String atype;
    private double amt;

    // Default constructor
    public BankCustomer() {
        this.acno = 0;
        this.atype = "Not Specified";
        this.amt = 0.0;
    }

    // Constructor with account number and account type
    public BankCustomer(int acno, String atype) {
        this.acno = acno;
        this.atype = atype;
        this.amt = 0.0;
    }

    // Constructor with all fields
    public BankCustomer(int acno, String atype, double amt) {
        this.acno = acno;
        this.atype = atype;
        this.amt = amt;
    }

    // Method to display customer details
    public void displayCustomerDetails() {
        System.out.println("Account Number: " + acno);
        System.out.println("Account Type: " + atype);
        System.out.println("Amount: " + amt);
    }

    // Main method to test the BankCustomer class
    public static void main(String[] args) {
        // Using default constructor
        BankCustomer customer1 = new BankCustomer();
        System.out.println("Customer 1 Details:");
        customer1.displayCustomerDetails();

        // Using constructor with account number and type
        BankCustomer customer2 = new BankCustomer(123456, "Savings");
        System.out.println("\nCustomer 2 Details:");
        customer2.displayCustomerDetails();

        // Using constructor with all fields
        BankCustomer customer3 = new BankCustomer(789101, "Current", 50000.75);
        System.out.println("\nCustomer 3 Details:");
        customer3.displayCustomerDetails();
    }
}
/*
OUTPUT
Customer 1 Details:
Account Number: 0
Account Type: Not Specified
Amount: 0.0

Customer 2 Details:
Account Number: 123456
Account Type: Savings
Amount: 0.0

Customer 3 Details:
Account Number: 789101
Account Type: Current
Amount: 50000.75


*/
