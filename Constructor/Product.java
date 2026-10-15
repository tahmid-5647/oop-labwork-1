// Exercise 6: Product
// Create a class Product.
// Variables:
// String productName;
// double price;
// int quantity;
// Create a constructor.
// Add methods:
// double calculateTotalPrice()
// void displayProduct()
// Formula:
// Total Price = price × quantity

class Product {
    String productName;
    double price;
    int quantity;

    Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateTotalPrice() {
        return price * quantity;
    }

    void displayProduct() {
        System.out.println();
        System.out.println("Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total price: " + calculateTotalPrice());
    }

    public static void main(String[] args) {
        Product p1 = new Product("Hair Oil", 299, 2);
        p1.displayProduct();
    }
}
