public class Address {
    // Attributes
    private String street;
    private String city;
    private String state;
    private String zipCode;

    // Default constructor
    public Address() {
        this.street = "";
        this.city = "";
        this.state = "";
        this.zipCode = "";
    }

    // Parameterized constructor
    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    // Getters only
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    // toString method to display the address
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }

    // Main method to test the Address class
    public static void main(String[] args) {
        // Creating an Address object using the parameterized constructor
        Address address = new Address("123 Main St", "Springfield", "IL", "62701");

        // Displaying the address using toString method
        System.out.println("Address: " + address);
    }
}
/*
OUTPUT

Address: Address{street='123 Main St', city='Springfield', state='IL', zipCode='62701'}

*/
