// File: ClassAndObject.java
// Topic: Understanding Classes and Objects in Java

class Student {

    // 1️ Instance Variables (Attributes)

    String name;
    int age;
    double marks;

    // 2️ Method (Behavior)

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}


public class ClassAndObject {

    public static void main(String[] args) {

        // 3️ Creating Object

        Student student1 = new Student();

        // Assigning values
        student1.name = "Uday";
        student1.age = 21;
        student1.marks = 88.5;

        // Calling method
        student1.displayDetails();


        System.out.println();

        // Creating another object
        Student student2 = new Student();
        student2.name = "Rahul";
        student2.age = 22;
        student2.marks = 92.0;

        student2.displayDetails();
    }
}
