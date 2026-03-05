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
