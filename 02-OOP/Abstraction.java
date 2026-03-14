// File: Abstraction.java
// Topic: Understanding Abstraction in Java


// --------------------------------------------------
// Abstract Class
// --------------------------------------------------

abstract class Shape {

    // Abstract method (no body)
    abstract void draw();

    // Normal method
    void display() {
        System.out.println("This is a shape");
    }
}


// --------------------------------------------------
// Child Class
// --------------------------------------------------

class Circle extends Shape {

    // Implementing abstract method
    void draw() {
        System.out.println("Drawing a Circle");
    }
}


// --------------------------------------------------
// Main Class
// --------------------------------------------------

public class Abstraction {

    public static void main(String[] args) {

        Circle c = new Circle();

        c.draw();
        c.display();
    }
}


/*
--------------------------------------------------
Important Points About Abstraction
--------------------------------------------------

1. Abstraction means hiding implementation details
   and showing only essential features.

2. It is achieved using abstract classes
   and interfaces.

3. An abstract class cannot be instantiated.

4. Abstract methods do not have a body
   and must be implemented in child classes.

Example:

abstract class Shape {
    abstract void draw();
}
*/