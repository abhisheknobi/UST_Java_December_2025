package Java_Assignment_Questions.OOPS;
public class Order {
    private int orderId;
    private String customerName;
    private double amount;
    
    // Constructor with orderId, customerName, amount
    public Order(int orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
        calculateTax(); // Business logic in constructor
    }
    
    // Constructor with orderId and customerName
    public Order(int orderId, String customerName) {
        this(orderId, customerName, 0.0);
    }
    
    // Constructor with orderId only
    public Order(int orderId) {
        this(orderId, "Unknown");
    }
    
    // Method to calculate tax (business logic)
    private void calculateTax() {
        double tax = amount * 0.18; // 18% tax
        System.out.println("Tax calculated: $" + tax);
        System.out.println("Total amount with tax: $" + (amount + tax));
    }
    
    // Getter methods
    public int getOrderId() {
        return orderId;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public double getAmount() {
        return amount;
    }
public static void main(String[] args) {
        // Create Order objects using different constructors
        Order order1 = new Order(101, "John Doe", 100.0);
        Order order2 = new Order(102, "Jane Smith");
        Order order3 = new Order(103);
    }

}
