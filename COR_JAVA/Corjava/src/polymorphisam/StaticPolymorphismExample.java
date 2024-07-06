package polymorphisam;

// Main class to demonstrate static polymorphism
public class StaticPolymorphismExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Method overloading examples
        int sum1 = calculator.add(5, 10);
        System.out.println("Sum of 5 and 10: " + sum1); // Output: Sum of 5 and 10: 15

        double sum2 = calculator.add(3.5, 2.5);
        System.out.println("Sum of 3.5 and 2.5: " + sum2); // Output: Sum of 3.5 and 2.5: 6.0

        int sum3 = calculator.add(15, 25, 35);
        System.out.println("Sum of 15, 25, and 35: " + sum3); // Output: Sum of 15, 25, and 35: 75
    }
}

// Calculator class demonstrating method overloading
class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
