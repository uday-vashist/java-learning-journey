

// File: Interfaces.java
// Topic: Understanding Interfaces in Java


// --------------------------------------------------
// Interface
// --------------------------------------------------

interface Animal {

    void sound();   // abstract method

    void eat();     // abstract method
}


// --------------------------------------------------
// Implementing Class
// --------------------------------------------------

class Dog implements Animal {

    public void sound() {
        System.out.println("Dog barks");
    }

    public void eat() {
        System.out.println("Dog eats food");
    }
}


// --------------------------------------------------
// Main Class
// --------------------------------------------------

public class Interfaces {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.eat();
    }
}


/*
--------------------------------------------------
Important Points About Interfaces
--------------------------------------------------

1. An interface is used to achieve complete abstraction.

2. All methods inside an interface are abstract by default.

3. A class implements an interface using
   the 'implements' keyword.

Example:
class Dog implements Animal

4. A class can implement multiple interfaces,
   which allows Java to support multiple inheritance.

5. Interfaces promote loose coupling and better design.
*/