package multithreading;

public class RunnableExample implements  Runnable{

    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String []args)
    {
        RunnableExample thread = new RunnableExample();
        Thread thread1 = new Thread(thread);
        thread1.start();
    }
}
