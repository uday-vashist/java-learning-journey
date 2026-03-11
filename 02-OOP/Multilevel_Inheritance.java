// File: MultilevelInheritance.java
// Topic: Multilevel Inheritance in Java


// Grandparent Class
// --------------------------------------------------

class Animal {

    void eat() {
        System.out.println("Animal eats food");
    }
}


// --------------------------------------------------
// Parent Class
// --------------------------------------------------

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}


// --------------------------------------------------
// Child Class
// --------------------------------------------------

class Puppy extends Dog {

    void weep() {
        System.out.println("Puppy weeps");
    }
}


// --------------------------------------------------
// Main Class
// --------------------------------------------------

public class MultilevelInheritance {

    public static void main(String[] args) {

        Puppy p1 = new Puppy();

        p1.eat();   // from Animal
        p1.bark();  // from Dog
        p1.weep();  // from Puppy
    }
}


/*
--------------------------------------------------
Important Points About Multilevel Inheritance
--------------------------------------------------

1. Multilevel inheritance means a class inherits
   from a class which is already inheriting another class.

2. It forms a chain of inheritance.

Example:

Animal → Dog → Puppy

3. The final child class can access methods
   from all parent classes in the hierarchy.

4. It promotes code reuse across multiple levels.
*/
