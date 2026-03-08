// File: ThisKeyword.java
// Topic: Understanding the 'this' Keyword in Java

class Employee {

    String name;
    int age;

    // Constructor using 'this' keyword
    Employee(String name, int age) {

        // 'this' refers to the current object
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ThisKeyword {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Uday", 21);
        emp1.displayDetails();

        System.out.println();

        Employee emp2 = new Employee("Rahul", 25);
        emp2.displayDetails();
    }
}


/*
Important Points About 'this' Keyword

1. 'this' refers to the current object of the class.

2. It is mainly used to distinguish instance variables
   from constructor parameters.

3. Example:
   this.name = name;

   Here:
   left side → instance variable
   right side → constructor parameter

4. 'this' can also be used to call another constructor
   within the same class (constructor chaining).

5. It improves code readability and prevents variable
   name conflicts.
*/
