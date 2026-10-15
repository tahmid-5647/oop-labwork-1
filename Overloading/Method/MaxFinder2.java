// Exercise 4: Find Maximum 
// Create overloaded methods called max() that find: 
// • Maximum between two integers  
// • Maximum among three integers  
// • Maximum between two doubles  
// Example: 
// max(10, 25); 
// max(10, 50, 30); 
// max(4.5, 8.7);

public class MaxFinder2 {
    int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    int max(int a, int b, int c) {
        int maxVal = a;
        if (b > maxVal) {
            maxVal = b;
        }
        if (c > maxVal) {
            maxVal = c;
        }
        return maxVal;
    }

    double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        MaxFinder2 finder = new MaxFinder2();

        int maxTwoInts = finder.max(10, 25);
        System.out.println("Maximum between 10 and 25: " + maxTwoInts);

        int maxThreeInts = finder.max(10, 50, 30);
        System.out.println("Maximum among 10, 50, and 30: " + maxThreeInts);

        double maxTwoDoubles = finder.max(4.5, 8.7);
        System.out.println("Maximum between 4.5 and 8.7: " + maxTwoDoubles);
    }
}