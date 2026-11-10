
public class ConditionalStatements {
    public static void main(String[] args) {

        // 1. Simple if
        int age = 20;

        if (age >= 18) {
            System.out.println("Eligible to vote");
        }

        // 2. if-else
        int number = 7;

        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // 3. if-else-if ladder
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

        // 4. Nested if
        int age2 = 22;
        boolean hasID = true;

        if (age2 >= 18) {
            if (hasID) {
                System.out.println("Entry allowed");
            } else {
                System.out.println("ID required");
            }
        } else {
            System.out.println("Entry not allowed");
        }

        // 5. Ternary operator
        int a = 10;
        int b = 20;

        String result = (a > b) ? "a is greater" : "b is greater";
        System.out.println(result);
    }
}
