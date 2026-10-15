// 1.  Car Class 
// Create a Car class with three attributes: brand, model, and year. 
// o Add a method displayInfo() that prints all details. 
// Create two Car objects in the main method and call displayInfo() for each. 


public class Car {
    String brand;
    String model;
    int year;

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2022);
        Car car2 = new Car("Honda", "Civic", 2024);

        car1.displayInfo();
        car2.displayInfo();
    }
}