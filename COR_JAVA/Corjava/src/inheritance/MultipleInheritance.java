package inheritance;

// Main class to test the multiple inheritance
public class MultipleInheritance {
    public static void main(String[] args) {
        Dog2 dog = new Dog2("Tomy", 5, "Red");
        System.out.println(dog.info()); // Output: Tomy is a 5-year-old dog with Red color.
        dog.speak(); // Output: Woof!
        dog.play(); // Output: Tomy is playing.
    }
}

// First interface
interface Animal2 {
    void speak();
    String info();
}

// Second interface
interface Pet {
    void play();
}

// Class implementing both interfaces
class Dog2 implements Animal2, Pet {
    private String name;
    private int age;
    private String color;

    public Dog2(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public void speak() {
        System.out.println("Woof!");
    }

    @Override
    public String info() {
        return name + " is a " + age + "-year-old dog with " + color + " color.";
    }

    @Override
    public void play() {
        System.out.println(name + " is playing.");
    }
}
