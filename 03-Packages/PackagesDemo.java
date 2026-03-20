// File: PackagesDemo.java
// Topic: Understanding Packages in Java

// --------------------------------------------------
// Creating a Package
// --------------------------------------------------

// NOTE:
// This line should be at the top of the file
// Uncomment when running in proper directory structure

// package mypackage;


// --------------------------------------------------
// Class inside a package
// --------------------------------------------------

class PackageExample {

    void showMessage() {
        System.out.println("This is inside a package.");
    }
}


// --------------------------------------------------
// Main Class
// --------------------------------------------------

public class PackagesDemo {

    public static void main(String[] args) {

        PackageExample obj = new PackageExample();
        obj.showMessage();
    }
}


/*
--------------------------------------------------
Important Points About Packages in Java
--------------------------------------------------

1. A package is a namespace that organizes classes and interfaces.

2. It helps in:
   - Avoiding name conflicts
   - Better organization of code
   - Access control

3. Types of Packages:
   a) Built-in packages (java.util, java.lang)
   b) User-defined packages

4. To create a package:
   package mypackage;

5. To compile:
   javac -d . PackagesDemo.java

6. To run:
   java mypackage.PackagesDemo

--------------------------------------------------
Access Modifiers in Packages (Important)
--------------------------------------------------

1. public       → accessible everywhere
2. protected    → accessible in same package + subclasses
3. default      → accessible only within same package
4. private      → accessible only within same class

--------------------------------------------------
NOTE
--------------------------------------------------

If package is not declared, Java puts class in default package.
*/
