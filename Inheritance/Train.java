// Exercise 9: Transport Fare Calculation System
// Create a superclass Transport containing vehicleNumber, distance, and baseFare.
// Create three subclasses: Bus, Taxi, and Train.
// Requirements:
// 1. Define parameterized constructors for all classes.
// 2. Each subclass must use super() to initialize common fields.
// 3. Define calculateFare() in Transport returning baseFare.
// 4. Override this method according to the specified formulas.
// 5. Store different transport objects inside a Transport[] array.
// 6. Use a loop to display their calculated fares.
// Challenge: Create an overridden displayDetails() method that calls calculateFare().

class Transport {
    String vehicleNumber;
    double distance;
    double baseFare;

    Transport(String vehicleNumber, double distance, double baseFare) {
        this.vehicleNumber = vehicleNumber;
        this.distance = distance;
        this.baseFare = baseFare;
    }

    public double calculateFare() {
        return this.baseFare;
    }

    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Distance: " + distance);
        System.out.println("Base Fare: " + baseFare);
        System.out.println("Total Fare: " + calculateFare());
    }
}

class Bus extends Transport {
    Bus(String vehicleNumber, double distance, double baseFare) {
        super(vehicleNumber, distance, baseFare);
    }

    @Override
    public double calculateFare() {
        return this.baseFare + (this.distance * 5);
    }

    @Override
    public void displayDetails() {
        System.out.println("------Bus Info------");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Distance: " + distance);
        System.out.println("Base Fare: " + baseFare);
        System.out.println("Total Fare: " + calculateFare());
        System.out.println("--------------------");
    }
}

class Taxi extends Transport {
    Taxi(String vehicleNumber, double distance, double baseFare) {
        super(vehicleNumber, distance, baseFare);
    }

    @Override
    public double calculateFare() {
        return this.baseFare + (this.distance * 20);
    }

    @Override
    public void displayDetails() {
        System.out.println("------Taxi Info------");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Distance: " + distance);
        System.out.println("Base Fare: " + baseFare);
        System.out.println("Total Fare: " + calculateFare());
        System.out.println("---------------------");
    }
}

public class Train extends Transport {
    Train(String vehicleNumber, double distance, double baseFare) {
        super(vehicleNumber, distance, baseFare);
    }

    @Override
    public double calculateFare() {
        return this.baseFare + (this.distance * 3);
    }

    @Override
    public void displayDetails() {
        System.out.println("------Train Info------");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Distance: " + distance);
        System.out.println("Base Fare: " + baseFare);
        System.out.println("Total Fare: " + calculateFare());
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Transport[] transports = new Transport[3];
        transports[0] = new Bus("BUS-101", 10.0, 50.0);
        transports[1] = new Taxi("TAXI-202", 15.0, 100.0);
        transports[2] = new Train("TRN-303", 50.0, 200.0);

        for (Transport t : transports) {
            t.displayDetails();
            System.out.println();
        }
    }
}