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
// --------------------------------------------------

class Child extends Parent {

    /*
    ERROR if we try this:

    void display() { }

    Because final methods cannot be overridden.
    */
}



public class KeywordsDemo {

    public static void main(String[] args) {

        // --------------------------------------------------
        // Final Variable
        // --------------------------------------------------

        final int MAX_VALUE = 100;

        System.out.println("Final Variable value: " + MAX_VALUE);

        // MAX_VALUE = 200;  // ❌ ERROR (cannot change value)



        // --------------------------------------------------
        // Using Final Method
        // --------------------------------------------------

        Child c = new Child();
        c.display();



        // --------------------------------------------------
        // Using Final Class
        // --------------------------------------------------

        FinalClass obj = new FinalClass();
        obj.show();
    }
}


/*
--------------------------------------------------
Important Points About 'final' Keyword
--------------------------------------------------

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
