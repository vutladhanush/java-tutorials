package multithreading;
class NumberThread extends Thread{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
            System.out.println(Thread.currentThread().getName());
        }

    }
}
class NumThread extends Thread
{
    public void run()
    {
        for( int i=11;i<=20;i++)
        {
            System.out.println(i);
            System.out.println(Thread.currentThread().getName());
        }

    }
}
public class MainClass {
    public static void main(String []args)
    {
        NumberThread numberThread = new NumberThread();
        NumThread alphabetThread = new NumThread();
        numberThread.start();
        alphabetThread.start();
    }
}
