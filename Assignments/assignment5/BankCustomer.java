public class BankCustomer {
    private int acno;
    private String atype;
    private double amt;

    // Parameterized constructor
    public BankCustomer(int acno, String atype, double amt) {
        this.acno = acno;
        this.atype = atype;
        this.amt = amt;
    }

    // Getter and Setter methods...

    // Method to display customer details
    public void displayCustomerDetails() {
        System.out.println("Account Number: " + acno);
        System.out.println("Account Type: " + atype);
        System.out.println("Amount: " + amt);
    }

    // Main method to test the BankCustomer class
    public static void main(String[] args) {
        // Creating an instance of BankCustomer
        BankCustomer customer = new BankCustomer(123456, "Savings", 10000.50);
        customer.displayCustomerDetails();
    }
}
/*
OUTPUT
Account Number: 123456
Account Type: Savings
Amount: 10000.5
*/
