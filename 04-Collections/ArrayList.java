// File: ArrayListExample.java
// Topic: Understanding ArrayList in Java

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        // --------------------------------------------------
        // Creating ArrayList
        // --------------------------------------------------

        ArrayList<String> names = new ArrayList<>();


        // --------------------------------------------------
        // Adding Elements
        // --------------------------------------------------

        names.add("Uday");
        names.add("Rahul");
        names.add("Amit");

        System.out.println("ArrayList: " + names);


        // --------------------------------------------------
        // Accessing Elements
        // --------------------------------------------------

        System.out.println("First Element: " + names.get(0));


        // --------------------------------------------------
        // Updating Element
        // --------------------------------------------------

        names.set(1, "Rohit");
        System.out.println("After Update: " + names);


        // --------------------------------------------------
        // Removing Element
        // --------------------------------------------------

        names.remove("Amit");
        System.out.println("After Removal: " + names);


        // --------------------------------------------------
        // Size of ArrayList
        // --------------------------------------------------

        System.out.println("Size: " + names.size());


        // --------------------------------------------------
        // Looping through ArrayList
        // --------------------------------------------------

        System.out.println("\nUsing for-each loop:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}


/*
--------------------------------------------------
Important Points About ArrayList
--------------------------------------------------

1. ArrayList is a dynamic array (resizable).

2. It is part of java.util package.

3. It allows duplicate elements.

4. It maintains insertion order.

5. It does NOT store primitive types directly
   (use wrapper classes like Integer, Double).

Example:
ArrayList<Integer> list = new ArrayList<>();
*/
