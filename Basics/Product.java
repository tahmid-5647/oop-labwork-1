// 6. Product Discount Calculator 
// • Create a Product class with fields: name, price, discountPercentage. 
// • Assign values directly in main. 
// • Write a method calculateDiscountedPrice() to print the price after discount.




public class Product {
    String name;
    double price;
    double discountPercentage;

    Product(String name, double price, double discountPercentage) {
        this.name = name;
        this.price = price;
        this.discountPercentage = discountPercentage;
    }

    void calculateDiscountedPrice() {
        double discountedPrice = price - (price * (discountPercentage / 100.0));
        System.out.println("Product: " + name);
        System.out.println("Original Price: " + price);
        System.out.println("Discount: " + discountPercentage + "%");
        System.out.println("Price After Discount: " + discountedPrice);
    }

    public static void main(String[] args) {
        Product prod = new Product("Laptop", 1000.0, 15.0);
        prod.calculateDiscountedPrice();
    }
}