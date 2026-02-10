class BankAccount {
    int balance = 1000;

    void withdraw(int amount) {
         {
            balance -= amount;
        }
    }
}

public class RaceDemo {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();
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
