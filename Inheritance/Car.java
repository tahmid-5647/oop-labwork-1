// Exercise 2: Vehicle and Car
// Create a superclass Vehicle containing brand and speed. Create a subclass Car with an additional attribute numberOfDoors.
// Requirements:
// 1. Initialize brand and speed through the superclass constructor.
// 2. Call the superclass constructor using super().
// 3. Define a method startEngine() in Vehicle that prints "Vehicle engine starting".
// 4. Override startEngine() in Car to print "Car engine starting with key".
// 5. Create a Car object and call startEngine().
// Challenge: Inside the overridden method, call super.startEngine() before printing the car-specific message.

class Vehicle {
    String brand;
    double speed;

    Vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void startEngine() {
        System.out.println("Vehicle engine starting");
    }
}

public class Car extends Vehicle {
    int numberOfDoors;

    Car(String brand, double speed, int numberOfDoors) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Car engine starting with key");
    }

    public void displayInfo() {
        System.out.println("------Car Info------");
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 120.0, 4);
        myCar.displayInfo();
        myCar.startEngine();
    }
}