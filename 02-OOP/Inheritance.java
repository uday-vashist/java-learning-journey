// File: Inheritance.java
// Topic: Understanding Inheritance in Java

// Parent Class (Super Class)
// --------------------------------------------------

class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// --------------------------------------------------
// Child Class (Sub Class)
// --------------------------------------------------

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Inheritance {

    public static void main(String[] args) {

        Dog d1 = new Dog();

        // Methods from parent class
        d1.eat();
        d1.sleep();

        // Method from child class
        d1.bark();
    }
}


/*
--------------------------------------------------
Important Points About Inheritance
--------------------------------------------------

1. Inheritance allows one class to acquire
   properties and methods of another class.

2. The class being inherited from is called
   the Parent (Super Class).

3. The class that inherits is called
   the Child (Sub Class).

4. Inheritance is implemented using the
   'extends' keyword.

Example:
class Dog extends Animal

5. Benefits of inheritance:
   - Code reusability
   - Reduced redundancy
   - Better program structure
*/
