package abstraction;

// Abstract class representing a Shape
abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    // Abstract method to calculate area (must be implemented by subclasses)
    public abstract double calculateArea();

    // Concrete method
    public void display() {
        System.out.println("This is a " + color + " shape.");
    }
}

// Concrete subclass Circle extending Shape
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass Rectangle extending Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Main class to demonstrate abstraction
public class Abstractionusingabstract {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 5.0);
        Shape rectangle = new Rectangle("Blue", 4.0, 6.0);

        circle.display();
        System.out.println("Area of Circle: " + circle.calculateArea()); // Output: Area of Circle: 78.53981633974483

        rectangle.display();
        System.out.println("Area of Rectangle: " + rectangle.calculateArea()); // Output: Area of Rectangle: 24.0
    }
}
