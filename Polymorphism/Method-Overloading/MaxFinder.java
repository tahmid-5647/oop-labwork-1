// Exercise 2: Maximum Finder 
// Write a class MaxFinder with overloaded methods max to find the maximum: 
// 1. Between two integers. 
// 2. Between two doubles. 
// 3. Between three integers.

public class MaxFinder {
    int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    double max(double a, double b) {
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

    public static void main(String[] args) {
        MaxFinder finder = new MaxFinder();

        int maxInts = finder.max(15, 28);
        System.out.println("Maximum between two integers: " + maxInts);

        double maxDoubles = finder.max(12.5, 9.4);
        System.out.println("Maximum between two doubles: " + maxDoubles);

        int maxThreeInts = finder.max(10, 45, 30);
        System.out.println("Maximum among three integers: " + maxThreeInts);
    }
}