// File: Encapsulation.java
// Topic: Understanding Encapsulation in Java

class Student {

    // 1️ Private variables (Data Hiding)

    private String name;
    private int age;

    // 2️ Getter method (used to read data)

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 3️ Setter method (used to modify data)

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {

        // simple validation example
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        Student s1 = new Student();

        // Setting values using setter methods
        s1.setName("Uday");
        s1.setAge(21);

        // Accessing values using getter methods
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}


/*
--------------------------------------------------
Important Points About Encapsulation
--------------------------------------------------

1. Encapsulation means binding data and methods
   together in a single unit (class).

2. It is achieved by making variables private
   and accessing them through public methods.

3. Getter methods are used to read values.

4. Setter methods are used to modify values.

5. It helps in:
   - Data hiding
   - Better security
   - Controlled access to variables

Example:
student.setAge(21);
student.getAge();
*/
