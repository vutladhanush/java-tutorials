package multithreading;

class MThread extends  Thread{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
public class Implementsleep {
  public static void main(String []args){
      MThread sleep = new MThread();
      sleep.run();
  }
}

