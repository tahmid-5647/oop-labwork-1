// Exercise 13: Shopping Cart 
// Create a class ShoppingItem. 
// Variables: 
// String itemName; 
// double price; 
// int quantity; 
// Initialize them using a constructor. 
// Methods: 
// double getSubtotal() 
// double getDiscount() 
// double getFinalPrice() 
// void printBill() 
// Rules: 
// If subtotal >= 5000 → 10% discount 
// Otherwise → no discount

class ShoppingItem {
    String itemName;
    double price;
    int quantity;

    ShoppingItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getSubtotal() {
        return price * quantity;
    }

    double getDiscount() {
        double subtotal = getSubtotal();
        if (subtotal >= 5000) {
            return subtotal * 0.10; // 10% discount
        } else {
            return 0.0;
        }
    }

    double getFinalPrice() {
        return getSubtotal() - getDiscount();
    }

    void printBill() {
        System.out.println();
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Unit: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Subtotal: " + getSubtotal());
        System.out.println("Discount: " + getDiscount());
        System.out.println("Final Price: " + getFinalPrice());
    }

    public static void main(String[] args) {
        ShoppingItem item1 = new ShoppingItem("Laptop", 3000, 2);
        item1.printBill();

        ShoppingItem item2 = new ShoppingItem("Headphones", 1200, 2);
        item2.printBill();
    }
}