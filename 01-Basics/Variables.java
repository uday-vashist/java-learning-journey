// Topic: Understanding Variables in Java

public class Variables {

    public static void main(String[] args) {

        // 1️ Variable Declaration

        // Declaring a variable means telling Java
        // the data type and the variable name.

        int age;   // 'age' is declared but not initialized


        // 2️ Variable Initialization

        // Assigning a value to a declared variable.

        age = 21;  // initialization
        System.out.println("Age: " + age);


        // 3️ Declaration + Initialization Together

        double salary = 50000.75;   // double stores decimal values
        char grade = 'A';           // char stores a single character
        boolean isJavaFun = true;   // boolean stores true or false

        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java Fun? " + isJavaFun);


        // 4️ Different Primitive Data Types

        byte smallNumber = 100;        // 1 byte
        short shortNumber = 20000;     // 2 bytes
        int integerNumber = 100000;    // 4 bytes
        long bigNumber = 999999999L;   // 8 bytes (L is required)

        float pi = 3.14f;              // float requires 'f'
        double precisePi = 3.1415926535;

        System.out.println("Byte: " + smallNumber);
        System.out.println("Short: " + shortNumber);
        System.out.println("Int: " + integerNumber);
        System.out.println("Long: " + bigNumber);
        System.out.println("Float: " + pi);
        System.out.println("Double: " + precisePi);


        // 5️ Variable Scope

        // A variable declared inside a block is only accessible inside that block.

        int outer = 10;

        if (outer > 5) {
            int inner = 20;   // 'inner' exists only inside this if block
            System.out.println("Inner: " + inner);
        }

        System.out.println("Outer: " + outer);

        // System.out.println(inner);  //  This would cause an error (out of scope)

    }
}
