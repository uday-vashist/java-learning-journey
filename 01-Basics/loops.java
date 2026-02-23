// Topic: Looping Statements in Java

public class loops {

    public static void main(String[] args) {

        // 1️ for Loop
        // Used when number of iterations is known

        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Value of i: " + i);
        }


      
        // 2️ while Loop
        // Used when number of iterations is not fixed

        System.out.println("\nWhile Loop:");
        int j = 1;

        while (j <= 5) {
            System.out.println("Value of j: " + j);
            j++;
        }


        // 3️ do-while Loop
        // Executes at least once

        System.out.println("\nDo-While Loop:");
        int k = 1;

        do {
            System.out.println("Value of k: " + k);
            k++;
        } while (k <= 5);


        // 4️ Break and Continue

        System.out.println("\nUsing Break:");
        for (int x = 1; x <= 5; x++) {
            if (x == 3) {
                break;  // exits loop completely
            }
            System.out.println(x);
        }

        System.out.println("\nUsing Continue:");
        for (int y = 1; y <= 5; y++) {
            if (y == 3) {
                continue;  // skips current iteration
            }
            System.out.println(y);
        }
    }
}
