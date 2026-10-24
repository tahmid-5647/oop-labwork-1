// Exercise 10: Challenge — Shopping System 
// Create a class ShoppingCart. 
// Variables: 
// String customerName; 
// double totalAmount; 
// int numberOfItems; 
// Constructor overloading: 
// ShoppingCart() 
// ShoppingCart(String customerName) 
// ShoppingCart(String customerName, double totalAmount) 
// ShoppingCart(String customerName, double totalAmount, int numberOfItems) 
// Create overloaded addItem() methods: 
// void addItem(double price) 
// void addItem(double price, int quantity) 
// void addItem(String productName, double price, int quantity) 
// Also create: 
// void displayCart()

public class ShoppingCart {
    String customerName;
    double totalAmount;
    int numberOfItems;

    ShoppingCart() {
        this.customerName = "Guest";
        this.totalAmount = 0.0;
        this.numberOfItems = 0;
    }

    ShoppingCart(String customerName) {
        this.customerName = customerName;
        this.totalAmount = 0.0;
        this.numberOfItems = 0;
    }

    ShoppingCart(String customerName, double totalAmount) {
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.numberOfItems = 0;
    }

    ShoppingCart(String customerName, double totalAmount, int numberOfItems) {
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.numberOfItems = numberOfItems;
    }

    void addItem(double price) {
        totalAmount = totalAmount + price;
        numberOfItems = numberOfItems + 1;
        System.out.println("Item added successfully");
    }

    void addItem(double price, int quantity) {
        totalAmount = totalAmount + (price * quantity);
        numberOfItems = numberOfItems + quantity;
        System.out.println(quantity + " items added successfully");
    }

    void addItem(String productName, double price, int quantity) {
        totalAmount = totalAmount + (price * quantity);
        numberOfItems = numberOfItems + quantity;
        System.out.println(quantity + " x " + productName + " added successfully");
    }

    void displayCart() {
        System.out.println();
        System.out.println("Customer Name: " + customerName);
        System.out.println("Total Items: " + numberOfItems);
        System.out.println("Total Amount: " + totalAmount);
    }

    public static void main(String[] args) {
        ShoppingCart cart1 = new ShoppingCart();
        ShoppingCart cart2 = new ShoppingCart("taqi");
        ShoppingCart cart3 = new ShoppingCart("tahmid", 1000.0, 2);

        cart1.displayCart();
        cart2.displayCart();

        cart2.addItem(250.0);
        cart2.addItem(150.0, 3);
        cart2.addItem("Mouse", 500.0, 2);

        cart2.displayCart();

        cart3.displayCart();
    }
}