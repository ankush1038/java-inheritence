import java.util.*;

// Base class: Person
class Person {

    protected String name;
    protected int id;

    // Constructor to initialize Person details
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Interface: Worker
interface Worker {
    void performDuties();
}

// Subclass: Chef
class Chef extends Person implements Worker {

    private String specialty;

    // Constructor to initialize Chef details
    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Chef");
        System.out.println("Specialty: " + specialty);
    }

    // Implementing performDuties method
    @Override
    public void performDuties() {
        System.out.println(name + " is preparing delicious meals.");
    }
}

// Subclass: Waiter
class Waiter extends Person implements Worker {

    private int tablesAssigned;

    // Constructor to initialize Waiter details
    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Waiter");
        System.out.println("Tables Assigned: " + tablesAssigned);
    }

    // Implementing performDuties method
    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers efficiently.");
    }
}

// Main class to test Restaurant Management System
public class RestaurantSystem {
    public static void main(String[] args) {

        // Creating instances of different roles
        Chef chef = new Chef("Ankush Sharma", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("Sharma Ankush", 202, 5);

        // Displaying details and performing duties
        chef.displayDetails();
        chef.performDuties();
        System.out.println();
        waiter.displayDetails();
        waiter.performDuties();
    }
}
