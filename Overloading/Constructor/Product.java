// Exercise 4: Product
// Create a class Product.
// Variables:
// String name;
// double price;
// int quantity;
// Constructor overloading:
// Product(String name)
// Product(String name, double price)
// Product(String name, double price, int quantity)
// Create overloaded calculatePrice() methods:
// double calculatePrice()
// double calculatePrice(int quantity)
// double calculatePrice(int quantity, double discount)
// Rules:
// calculatePrice()= price × object quantity
// calculatePrice(quantity)= price × given quantity
// calculatePrice(quantity, discount)= total price after percentage discount

public class Product {
    String name;
    double price;
    int quantity;

    Product(String name) {
        this.name = name;
        this.price = 0.0;
        this.quantity = 0;
    }

    Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double calculatePrice() {
        return price * quantity;
    }

    double calculatePrice(int quantity) {
        return price * quantity;
    }

    double calculatePrice(int quantity, double discount) {
        double totalPrice = price * quantity;
        return totalPrice - (totalPrice * (discount / 100));
    }

    void displayProduct() {
        System.out.println();
        System.out.println("Product Name: " + name);
        System.out.println("Price per Unit: " + price);
        System.out.println("Quantity: " + quantity);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Mouse");
        Product p2 = new Product("Keyboard", 1500);
        Product p3 = new Product("Monitor", 12000, 2);

        p1.displayProduct();
        System.out.println("Total Price: " + p1.calculatePrice());

        p2.displayProduct();
        System.out.println("Total Price for 3 units: " + p2.calculatePrice(3));

        p3.displayProduct();
        System.out.println("Total Price (2 units, 10% discount): " + p3.calculatePrice(2, 10));
    }
}