class BankAccount1 {
    int balance = 1000;

    synchronized void withdraw(int amount) {
         {
            balance -= amount;
        }
    }
}

public class RaceDemo1 {
    public static void main(String[] args) throws InterruptedException {
        BankAccount1 account = new BankAccount1();
        int threadCount = 1000;

        Thread[] threads = new Thread[threadCount];

        for (int i = 0; i < threadCount; i++) {
            threads[i] = new Thread(() -> account.withdraw(100));
            threads[i].start();
        }

        for (Thread t : threads) t.join();

        System.out.println("Final balance: " + account.balance);
    }
}
