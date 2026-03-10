// File: SingleInheritance.java
// Topic: Single Inheritance in Java

// Parent Class

class Vehicle {

    void start() {
        System.out.println("Vehicle is starting");
    }

    void stop() {
        System.out.println("Vehicle is stopping");
    }
}


// Child Class

class Car extends Vehicle {

    void drive() {
        System.out.println("Car is driving");
    }
}


// Main Class

public class SingleInheritance {

    public static void main(String[] args) {

        Car car1 = new Car();

        // Methods from parent class
        car1.start();
        car1.stop();

        // Method from child class
        car1.drive();
    }
}


/*
Important Points About Single Inheritance

1. Single inheritance means one child class
   inherits from one parent class.

2. The child class can use all the accessible
   methods and variables of the parent class.

3. In Java, inheritance is implemented using
   the 'extends' keyword.

Example:
class Car extends Vehicle

4. Benefits:
   - Code reusability
   - Better program organization
   - Reduced duplication of code
*/
