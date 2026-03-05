// File: Constructors.java
// Topic: Understanding Constructors in Java

class Car {

    // Instance Variables

    String brand;
    int year;

    // 1️ Default Constructor

    Car() {
        System.out.println("Default constructor called");
        brand = "Unknown";
        year = 0;
    }

    // 2️ Parameterized Constructor

    Car(String b, int y) {
        brand = b;
        year = y;
    }

    // Method to display details

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

public class Constructors {

    public static void main(String[] args) {

        // Using default constructor
        Car car1 = new Car();
        car1.displayDetails();

        System.out.println();

        // Using parameterized constructor
        Car car2 = new Car("Toyota", 2022);
        car2.displayDetails();
    }
}

/*
Important Points About Constructors:

1. A constructor is a special method used to initialize objects.

2. The constructor name must be the same as the class name.

3. Constructors do not have any return type, not even void.

4. A constructor is automatically called when an object is created.

5. If no constructor is defined in a class, Java provides a default constructor automatically.

6. Constructors can be overloaded (multiple constructors with different parameters).


Example:
Car car1 = new Car();        // Calls default constructor
Car car2 = new Car("BMW", 2023); // Calls parameterized constructor
*/
