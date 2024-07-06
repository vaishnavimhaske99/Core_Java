package inheritance;

// Main class to test the multilevel inheritance
public class MultilevelInheritance {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla", "Model S", 2022, 100);
        System.out.println(tesla.info()); // Output: Tesla Model S (2022) with a battery capacity of 100 kWh.
        tesla.start(); // Output: Tesla Model S is starting.
        tesla.drive(); // Output: Tesla Model S is driving.
        tesla.charge(); // Output: Tesla Model S is charging.
    }
}

// Base class
class Vehicle {
    protected String brand;
    protected String model;
    protected int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println(brand + " " + model + " is starting.");
    }

    public String info() {
        return brand + " " + model + " (" + year + ")";
    }
}

// Derived class
class Car extends Vehicle {
    public Car(String brand, String model, int year) {
        super(brand, model, year);
    }

    public void drive() {
        System.out.println(brand + " " + model + " is driving.");
    }
}

// Derived class
class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String brand, String model, int year, int batteryCapacity) {
        super(brand, model, year);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String info() {
        return super.info() + " with a battery capacity of " + batteryCapacity + " kWh.";
    }

    public void charge() {
        System.out.println(brand + " " + model + " is charging.");
    }
}
