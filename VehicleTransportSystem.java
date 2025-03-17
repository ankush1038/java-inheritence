import java.util.*;

// Superclass: Vehicle
class Vehicle {

    protected int maxSpeed;
    protected String fuelType;

    // Constructor to initialize Vehicle details
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display vehicle details
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass: Car
class Car extends Vehicle {

    private int seatCapacity;

    // Constructor to initialize Car details
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

// Subclass: Truck
class Truck extends Vehicle {

    private int loadCapacity;

    // Constructor to initialize Truck details
    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

// Subclass: Motorcycle
class Motorcycle extends Vehicle {

    private boolean hasSidecar;

    // Constructor to initialize Motorcycle details
    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}

// Main class to test Vehicle hierarchy
public class VehicleTransportSystem {
    public static void main(String[] args) {

        // Creating an array of Vehicle type to demonstrate polymorphism
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 10);
        vehicles[2] = new Motorcycle(150, "Petrol", false);

        // Displaying details of each vehicle using polymorphism
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println();
        }
    }
}
