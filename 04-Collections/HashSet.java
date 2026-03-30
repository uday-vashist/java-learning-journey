// File: HashSetExample.java
// Topic: Deep Understanding of HashSet in Java

import java.util.HashSet;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override equals() -> defines logical equality
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Student s = (Student) obj;
        return this.id == s.id; // only id matters
    }

    // Override hashCode() -> defines bucket location
    @Override
    public int hashCode() {
        return id; // simple hash based on id
    }
}

public class HashSetExample {

    public static void main(String[] args) {

        // --------------------------------------------------
        // 1. Creating HashSet
        // --------------------------------------------------

        HashSet<String> fruits = new HashSet<>();


        // --------------------------------------------------
        // 2. Adding Elements
        // --------------------------------------------------

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // duplicate (ignored)

        System.out.println("HashSet: " + fruits);


        // --------------------------------------------------
        // 3. Checking Element
        // --------------------------------------------------

        System.out.println("Contains Mango? " + fruits.contains("Mango"));


        // --------------------------------------------------
        // 4. Removing Element
        // --------------------------------------------------

        fruits.remove("Banana");
        System.out.println("After Removal: " + fruits);


        // --------------------------------------------------
        // 5. Size of HashSet
        // --------------------------------------------------

        System.out.println("Size: " + fruits.size());


        // --------------------------------------------------
        // 6. Iterating through HashSet
        // --------------------------------------------------

        System.out.println("\nUsing for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }


        // --------------------------------------------------
        // 7. HashSet with Custom Objects (IMPORTANT)
        // --------------------------------------------------

        HashSet<Student> students = new HashSet<>();

        students.add(new Student(1, "Uday"));
        students.add(new Student(1, "Duplicate Uday")); // should not be added

        System.out.println("\nStudent Set Size (should be 1): " + students.size());


        // --------------------------------------------------
        // 8. What happens WITHOUT equals() and hashCode()
        // --------------------------------------------------

        HashSet<TempStudent> tempStudents = new HashSet<>();

        tempStudents.add(new TempStudent(1, "A"));
        tempStudents.add(new TempStudent(1, "A")); // duplicate but WILL be added

        System.out.println("TempStudent Set Size (unexpected): " + tempStudents.size());
    }
}


// Class WITHOUT equals() and hashCode()
class TempStudent {
    int id;
    String name;

    TempStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }
}


/*
--------------------------------------------------
Important Points About HashSet
--------------------------------------------------

1. HashSet is part of java.util package.

2. It does NOT allow duplicate elements.
   - Duplicate detection is based on:
     ✔ hashCode()
     ✔ equals()

3. It does NOT maintain insertion order.

4. Internally uses HashMap (backed by hashing mechanism).

5. How it works internally:
   Step 1: hashCode() decides bucket location
   Step 2: equals() checks for duplicates within bucket

6. If equals() and hashCode() are NOT overridden:
   - HashSet may allow duplicate objects
   - Because default comparison is memory address

7. Best used when:
   - You need unique elements
   - Order does not matter
   - Fast lookup is required (O(1) average)

--------------------------------------------------
Difference from ArrayList
--------------------------------------------------

ArrayList:
✔ Allows duplicates
✔ Maintains order
✔ Slower search (O(n))

HashSet:
✔ No duplicates
✖ No guaranteed order
✔ Faster search (O(1))

-------*/
