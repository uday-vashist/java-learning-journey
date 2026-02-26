// Topic: Understanding Arrays in Java

public class Arrays {

    public static void main(String[] args) {

        // 1️ Declaration and Initialization

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("First Element: " + numbers[0]);
        System.out.println("Array Length: " + numbers.length);


        // 2️ Iterating Using for Loop

        System.out.println("\nUsing for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + " = " + numbers[i]);
        }


        // 3️ Enhanced for Loop (for-each)

        System.out.println("\nUsing enhanced for loop:");
        for (int num : numbers) {
            System.out.println(num);
        }


        // 4️ Array Declaration with Size

        int[] marks = new int[3];  // default values = 0

        marks[0] = 85;
        marks[1] = 90;
        marks[2] = 78;

        System.out.println("\nMarks:");
        for (int mark : marks) {
            System.out.println(mark);
        }


        // 5️ Multidimensional Array
]
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("\n2D Array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
