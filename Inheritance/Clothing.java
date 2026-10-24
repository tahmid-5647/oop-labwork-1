// Exercise 7: Online Shopping Product System
// Create a superclass Product containing productName and price. Create two subclasses: Electronics with warrantyYears, and Clothing with discountPercentage.
// Requirements:
// 1. Use constructors to initialize all attributes.
// 2. Call the superclass constructor using super().
// 3. Define a method getFinalPrice() in the superclass that returns the original price.
// 4. Override getFinalPrice() in Electronics to add a 10% service charge.
// 5. Override getFinalPrice() in Clothing to apply the given discount.
// 6. Print the product details and final price.
// Challenge: Create an array of type Product containing both electronics and clothing objects.

class Product {
    String productName;
    double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public double getFinalPrice() {
        return this.price;
    }

    public void displayInfo() {
        System.out.println("Product Name: " + productName);
        System.out.println("Original Price: " + price);
        System.out.println("Final Price: " + getFinalPrice());
    }
}

class Electronics extends Product {
    int warrantyYears;

    Electronics(String productName, double price, int warrantyYears) {
        super(productName, price);
        this.warrantyYears = warrantyYears;
    }

    @Override
    public double getFinalPrice() {
        return this.price + (this.price * 0.10);
    }

    @Override
    public void displayInfo() {
        System.out.println("------Electronics Info------");
        System.out.println("Product Name: " + productName);
        System.out.println("Original Price: " + price);
        System.out.println("Warranty Years: " + warrantyYears);
        System.out.println("Final Price: " + getFinalPrice());
        System.out.println("----------------------------");
    }
}

public class Clothing extends Product {
    double discountPercentage;

    Clothing(String productName, double price, double discountPercentage) {
        super(productName, price);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getFinalPrice() {
        return this.price - (this.price * (this.discountPercentage / 100.0));
    }

    @Override
    public void displayInfo() {
        System.out.println("------Clothing Info------");
        System.out.println("Product Name: " + productName);
        System.out.println("Original Price: " + price);
        System.out.println("Discount Percentage: " + discountPercentage + "%");
        System.out.println("Final Price: " + getFinalPrice());
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Product[] products = new Product[2];
        products[0] = new Electronics("Smartphone", 500.0, 2);
        products[1] = new Clothing("T-Shirt", 40.0, 15.0);

        for (Product p : products) {
            p.displayInfo();
            System.out.println();
        }
    }
}