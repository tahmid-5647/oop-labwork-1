// Exercise 9: Mobile Phone 
// Create a class Mobile. 
// Variables: 
// String brand; 
// String model; 
// double price; 
// int batteryLevel; 
// Create a constructor. 
// Methods: 
// void displayMobile() 
// void charge(int amount) 
// void useBattery(int amount) 
// Rules: 
// • Battery cannot exceed 100.  
// • Battery cannot go below 0. 
// void charge(int amount) 
// void useBattery(int amount) 
// Rules: 
// • Battery cannot exceed 100.  
// • Battery cannot go below 0.  


class Mobile {
    String brand;
    String model;
    double price;
    int batteryLevel;

    Mobile(String brand, String model, double price, int batteryLevel) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.batteryLevel = batteryLevel;
    }

    void charge(int amount) {
        batteryLevel = batteryLevel + amount;
        if (batteryLevel > 100) {
            batteryLevel = 100;
        }
        System.out.println("Phone Charged. Current Battery: " + batteryLevel + "%");
    }

    void useBattery(int amount) {
        batteryLevel = batteryLevel - amount;
        if (batteryLevel < 0) {
            batteryLevel = 0;
        }
        System.out.println("Battery Used. Current Battery: " + batteryLevel + "%");
    }

    void displayMobile() {
        System.out.println();
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Battery Level: " + batteryLevel + "%");
    }

    public static void main(String[] args) {
        Mobile phone1 = new Mobile("Samsung", "Galaxy S23", 75000, 80);

        phone1.displayMobile();

        phone1.charge(30);

        phone1.useBattery(120);

        phone1.displayMobile();
    }
}