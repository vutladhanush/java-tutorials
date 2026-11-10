package exception;

public class MultipleCatchBlocks {
    public static void main(String []args)
    {
        try{
            int a = 2/4;
            String str = null;
            System.out.println(a);
            System.out.println(str.length());
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();
        }
        catch(NullPointerException d){
            d.printStackTrace();
        }
    }
}
