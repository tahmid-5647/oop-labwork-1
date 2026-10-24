// Exercise 4: Vehicle Registration System 
// 1) Base class: Vehicle 
// • Variables: vehicleNumber (String), ownerName (String) 
// • Constructor: initialize both and print "Vehicle constructor called" 
// • Method (calculation): computeRegistrationFee() 
// o Returns a base fee (e.g., 1000.0). 
// o Print "Vehicle: computing base registration fee." 
// 2) Intermediate class: Car (extends Vehicle) 
// • Variable: carType (e.g., "Sedan", "SUV") 
// • Constructor: uses super(...) and prints "Car constructor called" 
// • Override (calculation): computeRegistrationFee() 
// o Start with super.computeRegistrationFee(). 
// o If carType is "SUV", add +300; else add +150. 
// o Print "Car: fee adjusted by car type." 
// 3) intermediate class: SmartCar (extends Car)  
// • Variable: autopilotLevel (int, e.g., 0–3) 
// • Constructor: uses super(...) and prints "SmartCar constructor called" 
// • Override (calculation): computeRegistrationFee() 
// o Start with super.computeRegistrationFee(). 
// o Add a software/ADAS maintenance surcharge: + (autopilotLevel * 100). 
// o Print "SmartCar: fee adjusted by software/ADAS level." 
// 4) Derived class: ElectricCar (extends SmartCar) 
// • Variable: batteryCapacity (double, kWh) 
// • Constructor: uses super(...) and prints "ElectricCar constructor called" 
// • Override (calculation): computeRegistrationFee() 
// o Start with super.computeRegistrationFee(). 
// o Apply eco adjustment: 
// ▪ Add road tax per kWh: + (batteryCapacity * 2) 
// ▪ Apply eco rebate: - 400 
// o Print "ElectricCar: fee adjusted by battery capacity and eco rebate." 
// • Display method: showDetails() 
// o Show all details (vehicleNumber, ownerName, carType, autopilotLevel, 
// batteryCapacity). 
// o Mention the fee policy (type-based + ADAS + EV adjustments). 
// o Optionally indicate the final fee by calling the calculation method before/after the 
// details. 
// 5) main() tasks 
// 1. Instantiate an ElectricCar with sample values, e.g.: 
// o vehicleNumber = "DHA-1234" 
// o ownerName = "Sakib" 
// o carType = "SUV" 
// o autopilotLevel = 2 
// o batteryCapacity = 75.0 
// 2. Verify constructor order (prints): 
// o "Vehicle constructor called" → "Car constructor called" → "SmartCar constructor 
// called" → "ElectricCar constructor called". 
// 3. Call showDetails() on the ElectricCar object. 
// 4. Call computeRegistrationFee() and note the override chain (prints from each class), and 
// compute the final amount using the layered adjustments. 



class Vehicle {
    String vehicleNumber;
    String ownerName;

    Vehicle(String vehicleNumber, String ownerName) {
        System.out.println("Vehicle constructor called");
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    public double computeRegistrationFee() {
        System.out.println("Vehicle: computing base registration fee.");
        return 1000.0;
    }
}

class Car extends Vehicle {
    String carType;

    Car(String vehicleNumber, String ownerName, String carType) {
        super(vehicleNumber, ownerName);
        System.out.println("Car constructor called");
        this.carType = carType;
    }

    @Override
    public double computeRegistrationFee() {
        double fee = super.computeRegistrationFee();
        System.out.println("Car: fee adjusted by car type.");
        if (this.carType.equalsIgnoreCase("SUV")) {
            return fee + 300;
        } else {
            return fee + 150;
        }
    }
}

class SmartCar extends Car {
    int autopilotLevel;

    SmartCar(String vehicleNumber, String ownerName, String carType, int autopilotLevel) {
        super(vehicleNumber, ownerName, carType);
        System.out.println("SmartCar constructor called");
        this.autopilotLevel = autopilotLevel;
    }

    @Override
    public double computeRegistrationFee() {
        double fee = super.computeRegistrationFee();
        System.out.println("SmartCar: fee adjusted by software/ADAS level.");
        return fee + (this.autopilotLevel * 100);
    }
}

public class ElectricCar extends SmartCar {
    double batteryCapacity;

    ElectricCar(String vehicleNumber, String ownerName, String carType, int autopilotLevel, double batteryCapacity) {
        super(vehicleNumber, ownerName, carType, autopilotLevel);
        System.out.println("ElectricCar constructor called");
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public double computeRegistrationFee() {
        double fee = super.computeRegistrationFee();
        System.out.println("ElectricCar: fee adjusted by battery capacity and eco rebate.");
        return fee + (this.batteryCapacity * 2) - 400;
    }

    public void showDetails() {
        System.out.println("------Electric Car Registration Details------");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Car Type: " + carType);
        System.out.println("Autopilot Level: " + autopilotLevel);
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Fee Policy: Base fee + Type adjustment + ADAS surcharge + EV eco adjustments.");
        System.out.println("Final Registration Fee: " + computeRegistrationFee());
        System.out.println("---------------------------------------------");
    }

    public static void main(String[] args) {
        System.out.println("--- Instantiating ElectricCar ---");
        ElectricCar myCar = new ElectricCar("DHA-1234", "Sakib", "SUV", 2, 75.0);

        System.out.println("\n--- Calling showDetails() ---");
        myCar.showDetails();
    }
}