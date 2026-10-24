// Exercise 8: Method Overloading with Type Promotion 
// Write a class OverloadTest with overloaded show methods: 
// 1. Accepts an int. 
// 2. Accepts a long. 
// 3. Accepts a float. 
// 4. Accepts a double. 
//  Test what happens if you pass values like 5, 5L, 5.0f, and 5.0. 

public class OverloadTest {
    void show(int a) {
        System.out.println("int method called: " + a);
    }

    void show(long a) {
        System.out.println("long method called: " + a);
    }

    void show(float a) {
        System.out.println("float method called: " + a);
    }

    void show(double a) {
        System.out.println("double method called: " + a);
    }

    public static void main(String[] args) {
        OverloadTest test = new OverloadTest();

        test.show(5);
        test.show(5L);
        test.show(5.0f);
        test.show(5.0);
    }
}