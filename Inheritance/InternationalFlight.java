// Exercise 3: Flight Reservation System  
// Base class: Flight 
// • Instance variables: 
// o flightNumber (int) 
// o distance (double, in kilometers) 
// o baseFare (double) 
// • Constructor: 
// o Initialize all variables and print "Flight constructor called". 
// • Method: 
// o calculateFare() → computes the total fare as distance × baseFare and returns it. 
// Derived class 1: DomesticFlight (extends Flight) 
// • Instance variable: 
// o serviceCharge (double) 
// • Constructor: 
// o Call the parent constructor using super() and print "DomesticFlight constructor 
// called". 
// • Method Overriding: 
// o Override calculateFare() to include a smaller fixed service charge: 
// ▪ Call super.calculateFare() for the base amount. 
// ▪ Add serviceCharge. 
// ▪ Print "Domestic flight fare calculated including service charge." 
// ▪ Return the total fare. 
// Derived class 1: InternationalFlight (extends Flight) 
// • Instance variable: 
// o internationalTax (double) 
// • Constructor: 
// o Call the parent constructor using super() and print "InternationalFlight constructor 
// called". 
// • Method Overriding: 
// o Override calculateFare() to include international tax: 
// ▪ Call super.calculateFare() to get the base amount. 
// ▪ Add internationalTax to it. 
// ▪ Print "International flight fare calculated including international tax." 
// ▪ Return the total fare. 
// Main method tasks: 
// 1. Create one InternationalFlight and one DomesticFlight object using sample data (e.g., 
// o International: flightNumber = 1050, distance = 2500, baseFare = 0.25, 
// internationalTax = 500. 
// o Domestic: flightNumber = 215, distance = 800, baseFare = 0.20, serviceCharge = 
// 100.) 
// 2. For both objects: 
// o Observe constructor messages showing hierarchical constructor chaining 
// (Flight → subclass). 
// o Call calculateFare() on each and print the final fare amount. 
// 3. Explain how method overriding lets each subclass modify the parent’s logic differently 
// while reusing the super.calculateFare() computation. 



class Flight {
    int flightNumber;
    double distance;
    double baseFare;

    Flight(int flightNumber, double distance, double baseFare) {
        System.out.println("Flight constructor called");
        this.flightNumber = flightNumber;
        this.distance = distance;
        this.baseFare = baseFare;
    }

    public double calculateFare() {
        return this.distance * this.baseFare;
    }
}

class DomesticFlight extends Flight {
    double serviceCharge;

    DomesticFlight(int flightNumber, double distance, double baseFare, double serviceCharge) {
        super(flightNumber, distance, baseFare);
        System.out.println("DomesticFlight constructor called");
        this.serviceCharge = serviceCharge;
    }

    @Override
    public double calculateFare() {
        System.out.println("Domestic flight fare calculated including service charge.");
        return super.calculateFare() + this.serviceCharge;
    }
}

public class InternationalFlight extends Flight {
    double internationalTax;

    InternationalFlight(int flightNumber, double distance, double baseFare, double internationalTax) {
        super(flightNumber, distance, baseFare);
        System.out.println("InternationalFlight constructor called");
        this.internationalTax = internationalTax;
    }

    @Override
    public double calculateFare() {
        System.out.println("International flight fare calculated including international tax.");
        return super.calculateFare() + this.internationalTax;
    }

    public static void main(String[] args) {
        System.out.println("--- Creating International Flight ---");
        InternationalFlight intlFlight = new InternationalFlight(1050, 2500, 0.25, 500.0);
        System.out.println("Final Fare: " + intlFlight.calculateFare());

        System.out.println("\n--- Creating Domestic Flight ---");
        DomesticFlight domFlight = new DomesticFlight(215, 800, 0.20, 100.0);
        System.out.println("Final Fare: " + domFlight.calculateFare());

        System.out.println("\n--- Explanation of Method Overriding & Reuse ---");
        System.out.println("Method overriding enables each subclass to modify the parent’s logic differently");
        System.out.println("(adding specific taxes or charges) while seamlessly reusing the core base computation");
        System.out.println("provided by the superclass via super.calculateFare().");
    }
}