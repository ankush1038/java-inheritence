import java.util.*;

// Base class: Vehicle
class Vehicle {

    protected String model;
    protected int maxSpeed;

    // Constructor to initialize Vehicle details
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface: Refuelable
interface Refuelable {
    void refuel();
}

// Subclass: ElectricVehicle
class ElectricVehicle extends Vehicle {

    private int batteryCapacity;

    // Constructor to initialize ElectricVehicle details
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Electric Vehicle");
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    // Method to charge the electric vehicle
    public void charge() {
        System.out.println(model + " is charging.");
    }
}

// Subclass: PetrolVehicle
class PetrolVehicle extends Vehicle implements Refuelable {

    private int fuelCapacity;

    // Constructor to initialize PetrolVehicle details
    public PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Petrol Vehicle");
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }

    // Implementing refuel method
    @Override
    public void refuel() {
        System.out.println(model + " is refueling.");
    }
}

// Main class to test Vehicle Management System
public class VehicleSystem {
    public static void main(String[] args) {

        // Creating instances of different vehicle types
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200, 75);
        PetrolVehicle pv = new PetrolVehicle("Mercedes G60", 180, 40);

        // Displaying details and performing actions
        ev.displayDetails();
        ev.charge();
        System.out.println();
        pv.displayDetails();
        pv.refuel();
    }
}
