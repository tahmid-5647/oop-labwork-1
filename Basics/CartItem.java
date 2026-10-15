// 8. Shopping Cart Item 
// • Create a CartItem class with fields: itemName, unitPrice, quantity. 
// • Assign values directly in main. 
// • Write a method to calculate and display the total cost. 



public class CartItem {
    String itemName;
    double unitPrice;
    int quantity;

    CartItem(String itemName, double unitPrice, int quantity) {
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    void displayTotalCost() {
        double totalCost = unitPrice * quantity;
        System.out.println("Item: " + itemName);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }

    public static void main(String[] args) {
        CartItem item = new CartItem("Wireless Mouse", 25.50, 2);
        item.displayTotalCost();
    }
}