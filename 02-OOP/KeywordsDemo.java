// File: KeywordsDemo.java
// Topic: Understanding the 'final' keyword in Java


// Final Class Example

final class FinalClass {

    void show() {
        System.out.println("This is a final class.");
    }
}

/*
NOTE:
A final class cannot be inherited.

Example (INVALID):

class Child extends FinalClass { }
*/



// --------------------------------------------------
// Parent Class
// --------------------------------------------------

class Parent {

    // Final Method
    final void display() {
        System.out.println("This is a final method.");
    }
}


// Child Class

class Child extends Parent {

    /*
    ERROR if we try this:

    void display() { }

    Because final methods cannot be overridden.
    */
}



public class KeywordsDemo {

    public static void main(String[] args) {

        // final Variable

        final int MAX_VALUE = 100;

        System.out.println("Final Variable value: " + MAX_VALUE);

        // MAX_VALUE = 200;  // ❌ ERROR (cannot change value)



        // Using Final Method

        Child c = new Child();
        c.display();



        // Using Final Class

        FinalClass obj = new FinalClass();
        obj.show();
    }
}


/*
Important Points About 'final' Keyword

1. The 'final' keyword is used to restrict modification.

2. final variable
   → Value cannot be changed once assigned.

3. final method
   → Cannot be overridden in child class.

4. final class
   → Cannot be inherited.

Example:
final int x = 10;

5. Common usage:
   - Constants
   - Security
   - Prevent modification

Example of final class in Java:
String class is final.
*/

// --------------------------------------------------
// SUPER KEYWORD EXAMPLE
// --------------------------------------------------

class Animal {

    String name = "Animal";

    Animal() {
        System.out.println("Animal constructor called");
    }

    void sound() {
        System.out.println("Animal makes sound");
    }
}


class Dog extends Animal {

    String name = "Dog";

    Dog() {
        super();  // calls parent constructor
        System.out.println("Dog constructor called");
    }

    void showNames() {

        System.out.println("Child name: " + name);
        System.out.println("Parent name using super: " + super.name);
    }

    void sound() {
        super.sound(); // calling parent method
        System.out.println("Dog barks");
    }
}


// --------------------------------------------------
// STATIC KEYWORD EXAMPLE
// --------------------------------------------------

class StaticExample {

    static int count = 0;  // shared among all objects

    StaticExample() {
        count++;
    }

    static void displayCount() {
        System.out.println("Total objects created: " + count);
    }
}


// --------------------------------------------------
// MAIN METHOD ADDITIONS
// --------------------------------------------------

// Add this inside your existing main()

/*

// -------- SUPER KEYWORD --------

Dog d = new Dog();
d.showNames();
d.sound();


// -------- STATIC KEYWORD --------

StaticExample s1 = new StaticExample();
StaticExample s2 = new StaticExample();

StaticExample.displayCount();

*/
