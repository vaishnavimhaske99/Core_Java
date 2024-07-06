package abstraction;

// Interface defining methods for an Animal
interface Animal {
    void eat(); // Abstract method
    void makeSound(); // Abstract method
}

// Concrete class implementing the Animal interface
class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog eats bones.");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

// Concrete class implementing the Animal interface
class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat eats fish.");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat meows.");
    }
}

// Main class to demonstrate abstraction using interfaces
public class AbstractionUsingInterface {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound(); // Output: Dog barks
        dog.eat(); // Output: Dog eats bones

        Animal cat = new Cat();
        cat.makeSound(); // Output: Cat meows
        cat.eat(); // Output: Cat eats fish
    }
}
