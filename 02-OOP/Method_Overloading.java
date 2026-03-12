// File: Method_Overloading.java
// Topic: Method Overloading in Java

class Calculator {

    // Method 1
    int add(int a, int b) {
        return a + b;
    }

    // Method 2 (different number of parameters)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3 (different data type)
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Sum of two integers: " + calc.add(5, 10));

        System.out.println("Sum of three integers: " + calc.add(5, 10, 15));

        System.out.println("Sum of two doubles: " + calc.add(2.5, 3.5));
    }
}


/*
Important Points About Method Overloading

1. Method overloading means defining multiple methods
   with the same name but different parameters.

2. It can be achieved by:
   - Changing number of parameters
   - Changing data types of parameters

3. The return type alone cannot differentiate overloaded methods.

4. Method overloading happens at compile time.

5. It improves code readability and flexibility.

Example:

add(int a, int b)
add(int a, int b, int c)
add(double a, double b)
*/
