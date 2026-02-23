// Topic: Understanding Methods in Java

public class Methods {

    public static void main(String[] args) {

        // Calling methods
        greetUser();
        int sumResult = addNumbers(10, 20);
        System.out.println("Sum: " + sumResult);

        double area = calculateCircleArea(5);
        System.out.println("Area of Circle: " + area);
    }

    // 1️ Method Without Return Type (void)
    // This method performs an action but does not return a value

    public static void greetUser() {
        System.out.println("Welcome to Java Learning Journey!");
    }

    // 2️ Method With Parameters and Return Type
    // This method takes inputs and returns a value

    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // 3️ Method With Different Return Type

    public static double calculateCircleArea(double radius) {
        return 3.14159 * radius * radius;
    }
}