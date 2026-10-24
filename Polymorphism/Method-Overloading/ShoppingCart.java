// Exercise 11: Shopping Bill 
// Create a class ShoppingCart and overload calculateBill(). 
// calculateBill(double price); 
// calculateBill(double price, int quantity); 
// calculateBill(double price, int quantity, double discount);

public class ShoppingCart {
    double calculateBill(double price) {
        return price;
    }

    double calculateBill(double price, int quantity) {
        return price * quantity;
    }

    double calculateBill(double price, int quantity, double discount) {
        double total = price * quantity;
        return total - (total * (discount / 100));
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        double bill1 = cart.calculateBill(500.0);
        System.out.println("Single item bill: " + bill1);

        double bill2 = cart.calculateBill(500.0, 3);
        System.out.println("Multiple items bill: " + bill2);

        double bill3 = cart.calculateBill(500.0, 3, 10.0);
        System.out.println("Discounted bill (10% off): " + bill3);
    }
}