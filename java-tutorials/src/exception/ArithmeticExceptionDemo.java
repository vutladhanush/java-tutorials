package exception;
import java.lang.*;
public class ArithmeticExceptionDemo {
    public static void main(String []args)
    {
        int a = 2;
        int b=0;
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("--- 1. Using getMessage() ---");
            System.out.println(e.getMessage());

            System.out.println("\n--- 2. Using toString / printing object ---");
            System.out.println(e);

            System.out.println("\n--- 3. Using printStackTrace() ---");
            e.printStackTrace();
        }
    }
}
