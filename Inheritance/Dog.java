// Exercise 3: Animal and Dog
// Create a superclass Animal with attributes name and weight. Create a subclass Dog with an additional attribute breed.
// Requirements:
// 1. Write parameterized constructors for both classes.
// 2. Initialize inherited data using super().
// 3. Create a method makeSound() in Animal that prints "Animal makes a sound".
// 4. Override makeSound() in Dog to print "Dog barks: Woof Woof!".
// 5. Create two Dog objects with different values.
// 6. Display their information and sounds.

class Animal {
    String name;
    double weight;

    Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

public class Dog extends Animal {
    String breed;

    Dog(String name, double weight, String breed) {
        super(name, weight);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }

    public void displayInfo() {
        System.out.println("------Dog Info------");
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
        System.out.println("Breed: " + breed);
        System.out.print("Sound: ");
        makeSound();
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", 25.5, "Golden Retriever");
        dog1.displayInfo();

        Dog dog2 = new Dog("Max", 15.0, "Beagle");
        dog2.displayInfo();
    }
}