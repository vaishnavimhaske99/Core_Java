package inheritance;


public class SingleInheritance {
    public static void main(String[] args) {
        Dog1 dog = new Dog1("Tomy", 5, "Red");
        System.out.println(dog.info()); 
        dog.speak(); 
    }
}
class Animal1 {
    protected String name;
    protected int age;

    public Animal1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("This animal makes a sound.");
    }

    public String info() {
        return name + " is " + age + " years old.";
    }
}
class Dog1 extends Animal1 {
    private String color;

    public Dog1(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
 public void speak() {
        System.out.println("Woof!");
    }
 public String info() {
        return name + " is a " + age + "-year-old dog with " + color + " color.";
    }
}
