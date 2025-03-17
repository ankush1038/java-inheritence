// Superclass: Animal
class Animal {

    protected String name;
    protected int age;

    // Constructor to initialize name and age
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden by subclasses
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclass: Dog
class Dog extends Animal {

    // Constructor to initialize Dog
    public Dog(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound method
    @Override
    public void makeSound() {
        System.out.println(name);
        System.out.println(" barks: Woof! Woof!");
    }
}

// Subclass: Cat
class Cat extends Animal {

    // Constructor to initialize Cat
    public Cat(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound method
    @Override
    public void makeSound() {
        System.out.println(name);
        System.out.println(" meows: Meow! Meow!");
    }
}

// Subclass: Bird
class Bird extends Animal {

    // Constructor to initialize Bird
    public Bird(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound method
    @Override
    public void makeSound() {
        System.out.println(name);
        System.out.println(" chirps: Tweet! Tweet!");
    }
}

// Main class to test Animal hierarchy
public class AnimalHierarchy {
    public static void main(String[] args) {

        // Creating objects of subclasses
        Dog dog = new Dog("Akshit", 3);
        Cat cat = new Cat("Pussy", 2);
        Bird bird = new Bird("Mithu", 1);

        // Calling makeSound method for each object
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
