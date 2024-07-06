package polymorphisam;

// Main class to demonstrate dynamic polymorphism runtimepolymarphisam
public class DynamicPolymorphismExample {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Reference of Animal type and object of Dog type
        Animal myCat = new Cat(); // Reference of Animal type and object of Cat type

        myDog.makeSound(); // Output: Woof!
        myCat.makeSound(); // Output: Meow!
    }
}

// Base class
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

// Derived class Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
