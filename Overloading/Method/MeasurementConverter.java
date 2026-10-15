// Exercise 9: Convert Measurements
// Create overloaded methods named convert().
// For example:
// convert(int meter);              // meter to centimeter
// convert(double kilometer);       // kilometer to meter
// convert(double value, String unit);
// For the third method, the user might call:
// convert(5.0, "km");
// convert(10.0, "meter");


public class MeasurementConverter {
    double convert(int meter) {
        return meter * 100.0;
    }

    double convert(double kilometer) {
        return kilometer * 1000.0;
    }

    double convert(double value, String unit) {
        if (unit.equalsIgnoreCase("km")) {
            return value * 1000.0;
        } else if (unit.equalsIgnoreCase("meter")) {
            return value * 100.0;
        } else {
            return value;
        }
    }

    public static void main(String[] args) {
        MeasurementConverter converter = new MeasurementConverter();

        double cm = converter.convert(5);
        System.out.println("5 meters = " + cm + " cm");

        double meters = converter.convert(2.5);
        System.out.println("2.5 kilometers = " + meters + " meters");

        double convertedKm = converter.convert(5.0, "km");
        System.out.println("5.0 km = " + convertedKm + " meters");

        double convertedMeter = converter.convert(10.0, "meter");
        System.out.println("10.0 meters = " + convertedMeter + " cm");
    }
}