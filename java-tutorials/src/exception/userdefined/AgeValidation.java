
package exception.userdefined;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int age = sc.nextInt();

            if (age < 0 || age > 99) {
                throw new InvalidAgeException(
                        "Age should be between 0 and 99!"
                );
            }

            if (age >= 18) {
                System.out.println("Eligible to vote...");
            } else {
                System.out.println("Not eligible to vote...");
            }

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
