package multithreading;
class EvenThread extends Thread{
    public void run()
    {
        for(int i=1;i<=20;i++)
        {
            if(i % 2==0)
               System.out.println(i);
        }
    }
}
class OddThread extends Thread{
    public void run(){
        for(int i=1;i<=20;i++){
            if(i % 2 !=0){
                System.out.println(i);
            }
        }
    }
}

public class EvenAndODD {
    public static void main(String []args){
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();
        evenThread.start();
        oddThread.start();
    }
}
