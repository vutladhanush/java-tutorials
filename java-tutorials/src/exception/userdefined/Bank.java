package exception.userdefined;

import java.util.Scanner;
class InsufficientBalance extends Exception
{
    InsufficientBalance(String message)
    {
        super(message);
    }
}
public class Bank{
    private double balance;
    Bank(double balance)
    {
        this.balance = balance;
    }

    void checkBalance(double amount)
    {

        try{
            if(amount <0)
            {
                System.out.println("Enter valid withdraw amount");
                return;
            }
            if(amount > balance)
            {
                throw new InsufficientBalance("Insufficient Balance");
            }
           balance = balance - amount;

            System.out.println("withdraw amount is :"+amount);
            System.out.println("Balance avaliable : "+balance);
        }
        catch(InsufficientBalance e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String []args)
    {
        Bank b = new Bank(2000);
        b.checkBalance(1111111);
    }


}
