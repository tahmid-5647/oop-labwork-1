// 12. Online Shopping Cart 
// • Create a Product class with fields: name, price, quantity. 
// • Add methods: 
// o totalPrice() → returns price * quantity. 
// • In main, create an array of 3 products, calculate each product’s total price, and sum all for 
// the cart total. 



public class Product2 {
    String name;
    double price;
    int quantity;

    Product2(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double totalPrice() {
        return price * quantity;
    }

    public static void main(String[] args) {
        Product2[] cart = {
            new Product2("Laptop", 1200.0, 1),
            new Product2("Mouse", 25.0, 2),
            new Product2("Keyboard", 75.0, 1)
        };

        double cartTotal = 0;

        for (int i = 0; i < cart.length; i++) {
            double itemTotal = cart[i].totalPrice();
            cartTotal += itemTotal;
            System.out.println(cart[i].name + " (Qty: " + cart[i].quantity + ") - Total: " + itemTotal);
        }

        System.out.println("Overall Cart Total: " + cartTotal);
    }
}