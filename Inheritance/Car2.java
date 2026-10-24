// Exercise 1: Vehicle Management System 
// 1. Base class: Vehicle 
// o Instance variables: brand, model 
// o Constructor: initialize both and print "Vehicle constructor called". 
// 2. Derived class: Car (extends Vehicle) 
// o Instance variable: numberOfDoors 
// o Constructor: use super() to call the Vehicle constructor and print "Car constructor 
// called". 
// 3. Method: displayDetails() in Car that prints all details. 
// 4. Main method: 
// o Create a Car object with sample data. 
// o Call displayDetails(). 



class Vehicle {
    String brand;
    String model;

    Vehicle(String brand, String model) {
        System.out.println("Vehicle constructor called");
        this.brand = brand;
        this.model = model;
    }
}

public class Car2 extends Vehicle {
    int numberOfDoors;

    Car2(String brand, String model, int numberOfDoors) {
        super(brand, model);
        System.out.println("Car constructor called");
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails() {
        System.out.println("------Car Details------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Car2 car = new Car2("Toyota", "Corolla", 4);
        System.out.println();
        car.displayDetails();
    }
}