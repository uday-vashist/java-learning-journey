// File: CompileTimePolymorphism.java
// Topic: Compile-Time Polymorphism in Java (Method Overloading)

class MathOperations {

    // Method 1
    int multiply(int a, int b) {
        return a * b;
    }

    // Method 2 (different number of parameters)
    int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Method 3 (different data type)
    double multiply(double a, double b) {
        return a * b;
    }
}

public class CompileTimePolymorphism {

    public static void main(String[] args) {

        MathOperations obj = new MathOperations();

        System.out.println("Multiplication of two integers: " + obj.multiply(5, 4));
        System.out.println("Multiplication of three integers: " + obj.multiply(2, 3, 4));
        System.out.println("Multiplication of two doubles: " + obj.multiply(2.5, 3.0));
    }
}


/*
Important Points About Compile-Time Polymorphism

1. Compile-time polymorphism is achieved using
   method overloading.

2. The method to be executed is determined
   at compile time.

3. Method overloading happens when multiple
   methods have the same name but different parameters.

4. Overloading can occur by:
   - Changing number of parameters
   - Changing data types of parameters

5. The return type alone cannot differentiate methods.
*/
