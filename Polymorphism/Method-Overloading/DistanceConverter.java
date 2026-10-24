// Exercise 6: Distance Converter (Advanced) 
// Create a class DistanceConverter with overloaded methods convert that: 
// 1. Converts kilometers to meters. 
// 2. Converts meters to kilometers. 
// 3. Converts miles to kilometers. 
// 4. Converts kilometers to miles. 

public class DistanceConverter {
    double convert(double distance, String fromUnit, String toUnit) {
        if (fromUnit.equalsIgnoreCase("km") && toUnit.equalsIgnoreCase("m")) {
            return distance * 1000.0;
        } else if (fromUnit.equalsIgnoreCase("m") && toUnit.equalsIgnoreCase("km")) {
            return distance / 1000.0;
        } else if (fromUnit.equalsIgnoreCase("miles") && toUnit.equalsIgnoreCase("km")) {
            return distance * 1.60934;
        } else if (fromUnit.equalsIgnoreCase("km") && toUnit.equalsIgnoreCase("miles")) {
            return distance / 1.60934;
        } else {
            return distance;
        }
    }

    double convert(double km) {
        return km * 1000.0;
    }

    double convert(int meters) {
        return meters / 1000.0;
    }

    double convert(float miles) {
        return miles * 1.60934;
    }

    public static void main(String[] args) {
        DistanceConverter converter = new DistanceConverter();

        double kmToMeters = converter.convert(5.0);
        System.out.println("5.0 Kilometers to Meters: " + kmToMeters + " m");

        double metersToKm = converter.convert(2500);
        System.out.println("2500 Meters to Kilometers: " + metersToKm + " km");

        double milesToKm = converter.convert(10.0f);
        System.out.println("10.0 Miles to Kilometers: " + milesToKm + " km");

        double kmToMiles = converter.convert(8.0, "km", "miles");
        System.out.println("8.0 Kilometers to Miles: " + kmToMiles + " miles");
    }
}