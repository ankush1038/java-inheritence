import java.util.*;

// Base class: Person
class Person {

    protected String name;
    protected int age;

    // Constructor to initialize Person details
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass: Teacher
class Teacher extends Person {

    private String subject;

    // Constructor to initialize Teacher details
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

// Subclass: Student
class Student extends Person {

    private int grade;

    // Constructor to initialize Student details
    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

// Subclass: Staff
class Staff extends Person {

    private String department;

    // Constructor to initialize Staff details
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

// Main class to test School System Hierarchy
public class SchoolSystem {
    public static void main(String[] args) {

        // Creating instances of different roles
        Teacher teacher = new Teacher("Ravi Kumar", 40, "Mathematics");
        Student student = new Student("Ananya Sharma", 15, 10);
        Staff staff = new Staff("Vikram Singh", 35, "Administration");

        // Displaying details of each role
        teacher.displayDetails();
        System.out.println();
        student.displayDetails();
        System.out.println();
        staff.displayDetails();
    }
}
