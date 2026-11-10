package multithreading;
class BankAccount {

    int balance = 1000;

    synchronized void withdraw(int amount) {

        if (balance >= amount) {

            System.out.println("Withdrawal successful");

            balance -= amount;

        } else {

            System.out.println("Insufficient balance");
        }
    }
}

public class BankWithdrawalSystem {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> account.withdraw(100));

        Thread t2 = new Thread(() -> account.withdraw(1000));

        t1.start();
        t2.start();
    }
}