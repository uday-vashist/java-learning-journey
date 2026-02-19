// Topic: Understanding Operators in Java

public class Operators {

    public static void main(String[] args) {

        // 1️ Arithmetic Operators

        int a = 10;
        int b = 5;

        System.out.println("Addition: " + (a + b));        // 15
        System.out.println("Subtraction: " + (a - b));     // 5
        System.out.println("Multiplication: " + (a * b));  // 50
        System.out.println("Division: " + (a / b));        // 2
        System.out.println("Modulus: " + (a % b));         // 0


        // 2️ Relational (Comparison) Operators

        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));


        // 3️ Logical Operators

        boolean condition1 = true;
        boolean condition2 = false;

        System.out.println("AND (&&): " + (condition1 && condition2));
        System.out.println("OR (||): " + (condition1 || condition2));
        System.out.println("NOT (!): " + (!condition1));


        // 4️ Assignment Operators

        int number = 20;

        number += 5;   // number = number + 5
        System.out.println("After += : " + number);

        number -= 3;   // number = number - 3
        System.out.println("After -= : " + number);

        number *= 2;   // number = number * 2
        System.out.println("After *= : " + number);

        number /= 4;   // number = number / 4
        System.out.println("After /= : " + number);


        // 5️ Increment and Decrement Operators

        int x = 5;

        System.out.println("Post Increment: " + (x++)); // prints 5, then increments
        System.out.println("After Post Increment: " + x);

        System.out.println("Pre Increment: " + (++x));  // increments first, then prints

        System.out.println("Post Decrement: " + (x--));
        System.out.println("After Post Decrement: " + x);

        System.out.println("Pre Decrement: " + (--x));
    }
}
