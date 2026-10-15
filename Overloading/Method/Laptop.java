// Exercise 10 (Challenge): Constructor Chaining 
// Create a class Laptop with overloaded constructors that use constructor chaining (this() 
// keyword): 
// 1. No-argument constructor → default brand = "Unknown", RAM = 4 GB. 
// 2. Constructor with brand. 
// 3. Constructor with brand and RAM. 
// 4. Constructor with brand, RAM, and price. 
//  Add a method showSpecs() to print laptop details.



public class Laptop {
    String brand;
    int ram;
    double price;

    Laptop() {
        this("Unknown", 4, 0.0);
    }

    Laptop(String brand) {
        this(brand, 4, 0.0);
    }

    Laptop(String brand, int ram) {
        this(brand, ram, 0.0);
    }

    Laptop(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    void showSpecs() {
        System.out.println("Brand: " + brand + " | RAM: " + ram + " GB | Price: $" + price);
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop("Dell");
        Laptop l3 = new Laptop("Lenovo", 16);
        Laptop l4 = new Laptop("Apple", 8, 1299.99);

        l1.showSpecs();
        l2.showSpecs();
        l3.showSpecs();
        l4.showSpecs();
    }
}