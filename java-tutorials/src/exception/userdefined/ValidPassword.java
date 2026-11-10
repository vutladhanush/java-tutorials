package exception.userdefined;

import java.util.Scanner;
class InvalidPasswordException extends Exception{
    InvalidPasswordException(String message)
    {
        super(message);
    }
}
public class ValidPassword {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            String password = sc.nextLine();
            if(password.length() < 8)
            {
                throw new InvalidPasswordException("Password length should be in 8 to 16");
            }
            else
            {
                System.out.println("Valid Password");
            }
        }
        catch(InvalidPasswordException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
