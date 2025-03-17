import java.util.*;

// Base class: Course
class Course {

    protected String courseName;
    protected int duration;

    // Constructor to initialize Course details
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

// Subclass: OnlineCourse
class OnlineCourse extends Course {

    protected String platform;
    protected boolean isRecorded;

    // Constructor to initialize OnlineCourse details
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Overriding displayCourseDetails method
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass: PaidOnlineCourse
class PaidOnlineCourse extends OnlineCourse {

    private double fee;
    private double discount;

    // Constructor to initialize PaidOnlineCourse details
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Method to calculate final price after discount
    public double getFinalPrice() {
        return fee - (fee * discount / 100);
    }

    // Overriding displayCourseDetails method
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Fee: Rs." + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: Rs." + getFinalPrice());
    }
}

// Main class to test Educational Course Hierarchy
public class EducationalCourseHierarchy {
    public static void main(String[] args) {

        // Creating an instance of PaidOnlineCourse
        PaidOnlineCourse course = new PaidOnlineCourse("Java Programming", 8, "Udemy", true, 5000, 20);

        // Displaying course details
        course.displayCourseDetails();
    }
}
