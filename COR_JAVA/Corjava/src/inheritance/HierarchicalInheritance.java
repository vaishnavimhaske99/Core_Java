package inheritance;

// Main class to test hierarchical inheritance
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Area of circle: " + circle.calculateArea()); // Output: Area of circle: 78.53981633974483

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Area of rectangle: " + rectangle.calculateArea()); // Output: Area of rectangle: 24.0
    }
}

// Base class
class Shape {
    // Common properties or methods for all shapes can be defined here
}

// Derived class representing a Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Derived class representing a Rectangle
class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}
