// Exercise 9: Car Rental 
// Create a class Car. 
// Variables: 
// String brand; 
// String model; 
// double rentPerDay; 
// Constructor overloading: 
// Car(String brand) 
// Car(String brand, String model) 
// Car(String brand, String model, double rentPerDay) 
// Method overloading: 
// double calculateRent(int days) 
// double calculateRent(int days, double discount) 
// double calculateRent(int days, double discount, double serviceCharge)


public class Car {
    String brand;
    String model;
    double rentPerDay;

    Car(String brand) {
        this.brand = brand;
        this.model = "Unknown";
        this.rentPerDay = 0.0;
    }

    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.rentPerDay = 0.0;
    }

    Car(String brand, String model, double rentPerDay) {
        this.brand = brand;
        this.model = model;
        this.rentPerDay = rentPerDay;
    }

    double calculateRent(int days) {
        return rentPerDay * days;
    }

    double calculateRent(int days, double discount) {
        double totalRent = rentPerDay * days;
        return totalRent - (totalRent * (discount / 100));
    }

    double calculateRent(int days, double discount, double serviceCharge) {
        double totalRent = rentPerDay * days;
        double discountedRent = totalRent - (totalRent * (discount / 100));
        return discountedRent + serviceCharge;
    }

    void displayCar() {
        System.out.println();
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Rent Per Day: " + rentPerDay);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda", "Civic");
        Car car3 = new Car("BMW", "X5", 5000);

        car1.displayCar();
        System.out.println("Total Rent (3 days): " + car1.calculateRent(3));

        car2.displayCar();
        System.out.println("Total Rent (3 days): " + car2.calculateRent(3));

        car3.displayCar();
        System.out.println("Total Rent (3 days): " + car3.calculateRent(3));
        System.out.println("Total Rent (3 days, 10% discount): " + car3.calculateRent(3, 10));
        System.out.println("Total Rent (3 days, 10% discount + 500 service charge): " + car3.calculateRent(3, 10, 500));
    }
}