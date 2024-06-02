public class TestConstructor {
    private String name;
    private String address;
    private String phoneNumber;

    public TestConstructor(String name) {
        this.name = name;
        System.out.println("Name: " + this.name);
    }
    public TestConstructor(String address, String phoneNumber) {
        this.address = address;
        this.phoneNumber = phoneNumber;
        System.out.println("Address: " + this.address);
        System.out.println("Phone Number: " + this.phoneNumber);
    }
public static void main(String[] args) {
    TestConstructor obj1 = new TestConstructor("Zake");
        
        // Create an object using the parameterized constructor
        TestConstructor obj2 = new TestConstructor("Kathmandu", "123456789");
}
    
}
