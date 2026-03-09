// File: ConstructorOverloading.java
// Topic: Constructor Overloading in Java

class Book {

    String title;
    String author;
    int price;

    // Constructor 1

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }

    // --------------------------------------------------
    // Constructor 2
    // --------------------------------------------------

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0;
    }

    // --------------------------------------------------
    // Constructor 3
    // --------------------------------------------------

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class ConstructorOverloading {

    public static void main(String[] args) {

        // Using constructor 1
        Book book1 = new Book();
        book1.displayDetails();

        // Using constructor 2
        Book book2 = new Book("Java Basics", "James Gosling");
        book2.displayDetails();

        // Using constructor 3
        Book book3 = new Book("Advanced Java", "Oracle", 500);
        book3.displayDetails();
    }
}


/*
--------------------------------------------------
Important Points About Constructor Overloading
--------------------------------------------------

1. Constructor overloading means defining multiple
   constructors in the same class with different parameters.

2. Each constructor performs different initialization.

3. The compiler decides which constructor to call
   based on the arguments passed during object creation.

4. It improves flexibility while creating objects.

Example:

Book b1 = new Book();
Book b2 = new Book("Java Basics", "James Gosling");
Book b3 = new Book("Advanced Java", "Oracle", 500);

Each line calls a different constructor.
*/
