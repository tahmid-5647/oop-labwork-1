// Exercise 6: Car 
// Create a class Car with overloaded constructors: 
// 1. No-argument constructor → default brand = "Unknown", model = "Unknown". 
// 2. Constructor with brand. 
// 3. Constructor with brand and model. 
// 4. Constructor with brand, model, and year. 
//  Add a method displayCar() to show car details.


public class Car {
    String brand;
    String model;
    int year;

    Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    Car(String brand) {
        this.brand = brand;
        this.model = "Unknown";
        this.year = 0;
    }

    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.year = 0;
    }

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayCar() {
        System.out.println("Brand: " + brand + " | Model: " + model + " | Year: " + year);
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Toyota");
        Car c3 = new Car("Honda", "Civic");
        Car c4 = new Car("Ford", "Mustang", 2023);

        c1.displayCar();
        c2.displayCar();
        c3.displayCar();
        c4.displayCar();
    }
}