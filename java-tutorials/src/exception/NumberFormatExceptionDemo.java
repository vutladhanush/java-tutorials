package exception;

public class NumberFormatExceptionDemo {
    public static void main(String []args) {
        try {
            String str = "123ab";
            int a = Integer.parseInt(str);
        }
        catch(NumberFormatException e)
        {
            e.printStackTrace();
        }
    }
}
