import java.util.*;

// Superclass: Employee
class Employee {

    protected String name;
    protected int id;
    protected double salary;

    // Constructor to initialize Employee details
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

// Subclass: Manager
class Manager extends Employee {

    private int teamSize;

    // Constructor to initialize Manager details
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

// Subclass: Developer
class Developer extends Employee {

    private String programmingLanguage;

    // Constructor to initialize Developer details
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Subclass: Intern
class Intern extends Employee {

    private String university;

    // Constructor to initialize Intern details
    public Intern(String name, int id, double salary, String university) {
        super(name, id, salary);
        this.university = university;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("University: " + university);
    }
}

// Main class to test Employee hierarchy
public class EmployeeManagementSystem {
    public static void main(String[] args) {

        // Creating objects of different employee types
        Manager manager = new Manager("Alice", 101, 80000, 10);
        Developer developer = new Developer("Bob", 102, 60000, "Java");
        Intern intern = new Intern("Charlie", 103, 20000, "XYZ University");

        // Displaying details of each employee
        manager.displayDetails();
        System.out.println();
        developer.displayDetails();
        System.out.println();
        intern.displayDetails();
    }
}
