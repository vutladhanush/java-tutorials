package exception;

public class FinallyBlock {
    public static void main(String []args)
    {
        try{
            int a =3;
             int b = 0;
             System.out.println(a/b);
        }catch(ArithmeticException e)
        {
           e.printStackTrace();
        }
        finally{
            System.out.println("Good Bye ..");
        }
    }
}
