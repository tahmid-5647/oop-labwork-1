// Exercise 5: Mobile Phone 
// Create a class Mobile. 
// Variables: 
// String brand; 
// String model; 
// double price; 
// Constructor overloading: 
// Mobile(String brand) 
// Mobile(String brand, String model) 
// Mobile(String brand, String model, double price) 
// Method overloading: 
// void show() 
// void show(String heading) 
// void show(String heading, boolean showPrice)

public class Mobile {
    String brand;
    String model;
    double price;

    Mobile(String brand) {
        this.brand = brand;
        this.model = "Unknown";
        this.price = 0.0;
    }

    Mobile(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.price = 0.0;
    }

    Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void show() {
        System.out.println();
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    void show(String heading) {
        System.out.println();
        System.out.println("--- " + heading + " ---");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    void show(String heading, boolean showPrice) {
        System.out.println();
        System.out.println("--- " + heading + " ---");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        if (showPrice) {
            System.out.println("Price: " + price);
        }
    }
    public static void main(String[] args) {
        Mobile phone1 = new Mobile("Samsung");
        Mobile phone2 = new Mobile("Apple", "iPhone 15");
        Mobile phone3 = new Mobile("Google", "Pixel 8", 75000);

        phone1.show();
        phone2.show("Mid-Range Device Details");
        phone3.show("Flagship Device Details", true);
        phone3.show("Confidential Details", false);
    }
}