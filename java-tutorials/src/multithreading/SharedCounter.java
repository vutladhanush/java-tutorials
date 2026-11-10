package multithreading;


class Counter {
    int count = 0;

   synchronized void increment() {
        for (int i = 1; i <= 1000; i++) {
            count++;
        }
    }
}

class CounterThread extends Thread {
    Counter c;

    CounterThread(Counter c) {
        this.c = c;
    }

    public void run() {
        c.increment();
    }
}

public class SharedCounter {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        CounterThread t1 = new CounterThread(counter);
        CounterThread t2 = new CounterThread(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + counter.count);
    }
}