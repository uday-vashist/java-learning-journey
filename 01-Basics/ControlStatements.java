// Topic: Decision Making in Java

public class ControlStatements {

    public static void main(String[] args) {


        // 1 if Statement
        

        int age = 20;

        if (age >= 18) {
            System.out.println("Eligible to vote.");
        }


         
        // 2 if-else Statement
        

        int number = 10;

        if (number % 2 == 0) {
            System.out.println("Even number.");
        } else {
            System.out.println("Odd number.");
        }


        
        // 3 if-else-if Ladder
        

        int marks = 85;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }


        
        // 4 Nested if
        

        int temperature = 30;
        boolean isSunny = true;

        if (temperature > 25) {
            if (isSunny) {
                System.out.println("Go for a picnic!");
            }
        }


        
        // 5 switch Statement
        

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
        }
    }
}
