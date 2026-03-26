// File: HashSetExample.java
// Topic: Understanding HashSet in Java

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        // --------------------------------------------------
        // Creating HashSet
        // --------------------------------------------------

        HashSet<String> fruits = new HashSet<>();


        // --------------------------------------------------
        // Adding Elements
        // --------------------------------------------------

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // duplicate (ignored)

        System.out.println("HashSet: " + fruits);


        // --------------------------------------------------
        // Checking Element
        // --------------------------------------------------

        System.out.println("Contains Mango? " + fruits.contains("Mango"));


        // --------------------------------------------------
        // Removing Element
        // --------------------------------------------------

        fruits.remove("Banana");
        System.out.println("After Removal: " + fruits);


        // --------------------------------------------------
        // Size of HashSet
        // --------------------------------------------------

        System.out.println("Size: " + fruits.size());


        // --------------------------------------------------
        // Iterating through HashSet
        // --------------------------------------------------

        System.out.println("\nUsing for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}


/*
--------------------------------------------------
Important Points About HashSet
--------------------------------------------------

1. HashSet is part of java.util package.

2. It does NOT allow duplicate elements.

3. It does NOT maintain insertion order.

4. Internally uses hashing.

5. Best used when:
   - You need unique elements
   - Order does not matter

--------------------------------------------------
Difference from ArrayList
--------------------------------------------------

ArrayList:
✔ Allows duplicates
✔ Maintains order

HashSet:
✔ No duplicates
✖ No guaranteed order
*/
