package encapsulation;

// Example of encapsulation with a Person class
public class EncapsulationExample {
    // Private fields (attributes)
    private String name;
    private int age;

    // Constructor to initialize Person object
    public EncapsulationExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name attribute
    public String getName() {
        return name;
    }

    // Setter for name attribute
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age attribute
    public int getAge() {
        return age;
    }

    // Setter for age attribute
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    // Method to display information about the Person
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method to demonstrate encapsulation
    public static void main(String[] args) {
        // Create a new Person object
        EncapsulationExample person = new EncapsulationExample("John", 30);

        // Accessing and modifying encapsulated data
        person.displayInfo(); // Output: Name: John, Age: 30

        person.setName("Jane");
        person.setAge(25);
        person.displayInfo(); // Output: Name: Jane, Age: 25
    }
}
