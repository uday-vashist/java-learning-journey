// File: MethodOverriding.java
// Topic: Method Overriding in Java


// Parent Class

class Animal {

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}


// Child Class

class Cat extends Animal {

    // Overriding the parent class method
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}


// Main Class

public class MethodOverriding {

    public static void main(String[] args) {

        Cat c1 = new Cat();

        // Calling overridden method
        c1.makeSound();
    }
}


/*

Important Points About Method Overriding

1. Method overriding occurs when a child class
   provides its own implementation of a method
   that already exists in the parent class.

2. The method in the child class must have the
   same name, parameters, and return type.

3. It is achieved using inheritance.

4. The '@Override' annotation is optional but
   recommended for better readability.

5. Method overriding supports runtime polymorphism.

Example:

class Animal {
    void sound() {}
}

class Dog extends Animal {
    void sound() {}
}
*/
