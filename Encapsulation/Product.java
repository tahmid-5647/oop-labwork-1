// Exercise 4: Product Price and Stock Management
// Create a class named Product containing the following private attributes: productId, productName, price, and stockQuantity.
// Requirements:
// 1. Create a constructor to initialize all attributes.
// 2. Generate getters for all attributes.
// 3. Generate setters for productName and price.
// 4. A product price must be greater than zero.
// 5. A product name cannot be empty.
// 6. Do not provide a public setter for stockQuantity.
// 7. Create addStock(int quantity) and sellProduct(int quantity) methods.
// 8. Prevent selling more items than the available stock.
// Sample scenario: A product has 20 units in stock. A customer purchases 5 units and then attempts to purchase 30 units.
// Expected result: The second purchase is rejected, and the final stock remains 15.

public class Product {
    private String productId;
    private String productName;
    private double price;
    private int stockQuantity;

    public Product(String productId, String productName, double price, int stockQuantity) {
        this.productId = productId;
        setProductName(productName);
        setPrice(price);
        if (stockQuantity >= 0) {
            this.stockQuantity = stockQuantity;
        } else {
            this.stockQuantity = 0;
            System.out.println("Error: Initial stock cannot be negative.");
        }
    }

    public String getProductId() {
        return this.productId;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        if (productName != null && !productName.isBlank()) {
            this.productName = productName;
        } else {
            System.out.println("Error: Product name cannot be null, empty, or whitespace-only.");
        }
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Error: Price must be greater than zero.");
        }
    }

    public int getStockQuantity() {
        return this.stockQuantity;
    }

    public void addStock(int quantity) {
        if (quantity > 0) {
            this.stockQuantity += quantity;
            System.out.println("Successfully added " + quantity + " units.");
            System.out.println("Updated Stock: " + getStockQuantity());
        } else {
            System.out.println("Error: Add quantity must be positive.");
        }
    }

    public void sellProduct(int quantity) {
        if (quantity > 0) {
            if (this.stockQuantity >= quantity) {
                this.stockQuantity -= quantity;
                System.out.println("Successfully sold " + quantity + " units.");
                System.out.println("Updated Stock: " + getStockQuantity());
            } else {
                System.out.println("Error: Insufficient stock. Available stock is " + getStockQuantity() + ", requested was " + quantity + ".");
            }
        } else {
            System.out.println("Error: Sell quantity must be positive.");
        }
    }

    public void displayInfo() {
        System.out.println("------Product Info------");
        System.out.println("Product ID: " + getProductId());
        System.out.println("Product Name: " + getProductName());
        System.out.println("Price: " + getPrice());
        System.out.println("Stock Quantity: " + getStockQuantity());
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Product p = new Product("P001", "Laptop", 1200.0, 20);
        p.displayInfo();

        p.sellProduct(5);
        p.sellProduct(30);
        p.displayInfo();
    }
}