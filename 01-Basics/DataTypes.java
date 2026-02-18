// Topic: Understanding Data Types in Java

public class DataTypes {

    public static void main(String[] args) {

        // 1️ Primitive Data Types
        // Primitive types store simple values directly in memory.

        byte byteValue = 100;          // 1 byte
        short shortValue = 20000;      // 2 bytes
        int intValue = 500000;         // 4 bytes
        long longValue = 9000000000L;  // 8 bytes (L required)

        float floatValue = 3.14f;      // 4 bytes (f required)
        double doubleValue = 3.1415926535; // 8 bytes

        char charValue = 'A';          // 2 bytes (stores single character)
        boolean booleanValue = true;   // true or false

        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Int: " + intValue);
        System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Char: " + charValue);
        System.out.println("Boolean: " + booleanValue);


        // 2️ Non-Primitive Data Type (Reference Type)
        // Non-primitive types store reference to memory location.

        String name = "Uday";
        System.out.println("String: " + name);


        // 3️ Type Casting

        // Implicit Casting (Widening)
        int number = 10;
        double widenedNumber = number;   // int → double automatically
        System.out.println("Implicit Casting: " + widenedNumber);


        // Explicit Casting (Narrowing)
        double decimalNumber = 9.78;
        int narrowedNumber = (int) decimalNumber;  // double → int manually
        System.out.println("Explicit Casting: " + narrowedNumber);
    }
}
