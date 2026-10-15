// Exercise 10: Method Overloading with Different Parameter Order 
// Create two overloaded methods: 
// show(String name, int age); 
// show(int age, String name); 
// Call: 
// show("John", 25); 
// show(25, "John"); 

public class Display {
    void show(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    void show(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }

    public static void main(String[] args) {
        Display d = new Display();

        d.show("John", 25);
        d.show(25, "John");
    }
}