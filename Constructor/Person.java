// Exercise 10: Constructor Overloading 
// Create a class Person. 
// Variables: 
// String name; 
// int age; 
// String city; 
// Create three constructors: 
// Person(String name) 
// Person(String name, int age) 
// Person(String name, int age, String city) 
// Add: 
// void display()

class Person {
    String name;
    int age;
    String city;

    Person(String name) {
        this.name = name;
        this.age = 0;
        this.city = "Unknown";
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.city = "Unknown";
    }

    Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    void display() {
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Taqi");

        Person p2 = new Person("Tahmid", 21);

        Person p3 = new Person("Rahim", 22, "Dhaka");

        p1.display();
        p2.display();
        p3.display();
    }
}