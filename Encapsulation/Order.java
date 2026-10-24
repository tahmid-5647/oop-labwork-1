// Exercise 12: E-Commerce Order Management
// Create a class named Order containing private attributes orderId, customerName, totalAmount, status, and discountPercentage.
// Requirements:
// 1. Initialize the attributes using a constructor.
// 2. Make orderId read-only.
// 3. Provide getter methods for all attributes.
// 4. Provide validated setters for customerName and discountPercentage.
// 5. Accept discounts only between 0% and 50%.
// 6. Do not provide a direct setter for status.
// 7. Allow only the following statuses: PLACED, SHIPPED, DELIVERED, CANCELLED.
// 8. Create shipOrder(), deliverOrder(), and cancelOrder() methods.
// 9. An order can be shipped only after being placed.
// 10. A shipped order can be delivered but cannot be cancelled.
// 11. A delivered or cancelled order cannot undergo any further status changes.
// 12. Create calculateFinalAmount() that returns the amount after applying the discount.
// Challenge: Ensure the order status cannot be changed directly from PLACED to DELIVERED.

public class Order {
    private String orderId;
    private String customerName;
    private double totalAmount;
    private String status;
    private double discountPercentage;

    public Order(String orderId, String customerName, double totalAmount, double discountPercentage) {
        this.orderId = orderId;
        setCustomerName(customerName);
        if (totalAmount >= 0) {
            this.totalAmount = totalAmount;
        } else {
            this.totalAmount = 0.0;
            System.out.println("Error: Total amount cannot be negative.");
        }
        setDiscountPercentage(discountPercentage);
        this.status = "PLACED";
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        if (customerName != null && !customerName.isBlank()) {
            this.customerName = customerName;
        } else {
            System.out.println("Error: Customer name cannot be null, empty, or whitespace-only.");
        }
    }

    public double getTotalAmount() {
        return this.totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        if (totalAmount >= 0) {
            this.totalAmount = totalAmount;
        } else {
            System.out.println("Error: Total amount cannot be negative.");
        }
    }

    public String getStatus() {
        return this.status;
    }

    public double getDiscountPercentage() {
        return this.discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        if (discountPercentage >= 0.0 && discountPercentage <= 50.0) {
            this.discountPercentage = discountPercentage;
        } else {
            System.out.println("Error: Discount percentage must be between 0% and 50%.");
        }
    }

    public void shipOrder() {
        if (this.status.equals("PLACED")) {
            this.status = "SHIPPED";
            System.out.println("Order status updated to: SHIPPED");
        } else {
            System.out.println("Error: Order can only be shipped from PLACED status. Current status is " + this.status);
        }
    }

    public void deliverOrder() {
        if (this.status.equals("SHIPPED")) {
            this.status = "DELIVERED";
            System.out.println("Order status updated to: DELIVERED");
        } else if (this.status.equals("PLACED")) {
            System.out.println("Error: Order cannot be changed directly from PLACED to DELIVERED. It must be shipped first.");
        } else {
            System.out.println("Error: Order cannot be delivered from status: " + this.status);
        }
    }

    public void cancelOrder() {
        if (this.status.equals("PLACED")) {
            this.status = "CANCELLED";
            System.out.println("Order status updated to: CANCELLED");
        } else if (this.status.equals("SHIPPED")) {
            System.out.println("Error: Shipped orders cannot be cancelled.");
        } else {
            System.out.println("Error: Order cannot be cancelled from status: " + this.status);
        }
    }

    public double calculateFinalAmount() {
        return this.totalAmount * (1 - (this.discountPercentage / 100.0));
    }

    public void displayInfo() {
        System.out.println("------Order Info------");
        System.out.println("Order ID: " + getOrderId());
        System.out.println("Customer Name: " + getCustomerName());
        System.out.println("Total Amount: " + getTotalAmount());
        System.out.println("Discount Percentage: " + getDiscountPercentage() + "%");
        System.out.println("Final Amount: " + calculateFinalAmount());
        System.out.println("Status: " + getStatus());
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Order order = new Order("ORD001", "Alice Smith", 500.0, 10.0);
        order.displayInfo();

        order.deliverOrder(); // Should fail (cannot go from PLACED to DELIVERED)
        order.shipOrder(); // Should succeed (PLACED -> SHIPPED)
        order.cancelOrder(); // Should fail (shipped cannot be cancelled)
        order.deliverOrder(); // Should succeed (SHIPPED -> DELIVERED)
        order.shipOrder(); // Should fail (delivered order cannot change status)
        order.displayInfo();
    }
}