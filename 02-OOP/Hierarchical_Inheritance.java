// File: HierarchicalInheritance.java
// Topic: Hierarchical Inheritance in Java


// Parent Class

class Shape {

    void display() {
        System.out.println("This is a shape");
    }
}


// Child Class 1

class Circle extends Shape {

    void drawCircle() {
        System.out.println("Drawing Circle");
    }
}


// Child Class 2

class Rectangle extends Shape {

    void drawRectangle() {
        System.out.println("Drawing Rectangle");
    }
}


// Main Class

public class HierarchicalInheritance {

    public static void main(String[] args) {

        Circle c = new Circle();
        c.display();
        c.drawCircle();

        System.out.println();

        Rectangle r = new Rectangle();
        r.display();
        r.drawRectangle();
    }
}


/*

Important Points About Hierarchical Inheritance

1. Hierarchical inheritance means multiple child
   classes inherit from a single parent class.

Example:

        Shape
       /     \
   Circle   Rectangle

2. All child classes share the properties
   from the same parent class.

3. It promotes code reuse while allowing
   specialized behavior in each child class.
*/
