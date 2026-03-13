// File: Polymorphism.java
// Topic: Understanding Polymorphism in Java


// Parent Class


class Animal {

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}


// --------------------------------------------------
// Child Class 1
// --------------------------------------------------

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}


// --------------------------------------------------
// Child Class 2
// --------------------------------------------------

class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}


// --------------------------------------------------
// Main Class
// --------------------------------------------------

public class Polymorphism {

    public static void main(String[] args) {

        // Runtime Polymorphism
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.makeSound();
        a2.makeSound();
    }
}


/*
--------------------------------------------------
Important Points About Polymorphism
--------------------------------------------------

1. Polymorphism means "one interface, many forms".

2. It allows objects to behave differently
   depending on the context.

3. There are two types of polymorphism in Java:

   a) Compile-time polymorphism
      → Achieved using method overloading.

   b) Runtime polymorphism
      → Achieved using method overriding.

4. Runtime polymorphism happens when a parent
   reference refers to a child object.

Example:

Animal a = new Dog();

Here:
reference type → Animal
object type → Dog

The method executed depends on the object type.
*/
