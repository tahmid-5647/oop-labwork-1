// Exercise 7: Car
// Create a class Car.
// Variables:
// String brand;
// String model;
// double price;
// Create a constructor.
// Methods:
// void displayCar()
// void applyDiscount(double percentage)

class Car {
    String brand;
    String model;
    double price;

    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayCar() {
        System.out.println();
        System.out.println("Car information: ");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    void applyDiscount(double percentage) {
        System.out.println("Discount applied: " + percentage);
        System.out.println("Net Price: " + (100 - percentage) * price / 100);
    }

    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "HAXAS-364", 4500000);
        c1.displayCar();
        c1.applyDiscount(10);

        Car c2 = new Car("BMW", "HADAS-376", 6500000);
        c2.displayCar();
        c2.applyDiscount(15);
    }
}
