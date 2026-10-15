// Exercise 7: Volume Calculator 
// Create a class VolumeCalculator and overload volume() to calculate the volume of: 
// • Cube  
// • Rectangular box  
// • Cylinder  
// Suggested methods: 
// volume(int side); 
// volume(int length, int width, int height); 
// volume(double radius, double height);

public class VolumeCalculator {
    int volume(int side) {
        return side * side * side;
    }

    int volume(int length, int width, int height) {
        return length * width * height;
    }

    double volume(double radius, double height) {
        return 3.1416 * radius * radius * height;
    }

    public static void main(String[] args) {
        VolumeCalculator calc = new VolumeCalculator();

        int cubeVol = calc.volume(4);
        System.out.println("Volume of Cube (side = 4): " + cubeVol);

        int boxVol = calc.volume(5, 3, 2);
        System.out.println("Volume of Rectangular Box (length = 5, width = 3, height = 2): " + boxVol);

        double cylinderVol = calc.volume(3.0, 7.0);
        System.out.println("Volume of Cylinder (radius = 3.0, height = 7.0): " + cylinderVol);
    }
}