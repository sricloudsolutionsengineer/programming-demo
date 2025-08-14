// Parent class (Base class)
class Animal {
    String name;

    // Constructor
    Animal(String name) {
        this.name = name;
    }

    // Method to be overridden
    void makeSound() {
        System.out.println(name + " makes a sound.");
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Child class (Derived class)
class Dog extends Animal {

    Dog(String name) {
        // Calling parent constructor
        super(name);
    }

    // Method overriding
    @Override
    void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }

    // Child-specific method
    void fetch() {
        System.out.println(name + " is fetching the ball.");
    }
}

// Main class to run the program
public class InheritanceExample {
    public static void main(String[] args) {
        // Create an object of Dog
        Dog myDog = new Dog("Buddy");

        // Access inherited methods
        myDog.eat();

        // Access overridden method
        myDog.makeSound();

        // Access child-specific method
        myDog.fetch();
    }
}