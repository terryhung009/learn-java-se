import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static Account account = new Account();

    public static class Account{
        private int balance = 0;
        private static Lock lock = new ReentrantLock();
        private static Condition newDeposit = lock.newCondition();

        public int getBalance(){
            return this.balance;
        }

        public int deposit(int amount){
            lock.lock();
            balance += amount;
            System.out.println("Deposit " + amount + "\t\t\t\t" + getBalance());
            newDeposit.signalAll();
            lock.unlock();
            return  balance;
        }

        public void withdraw(int amount) {
            lock.lock();
            try {
                while(balance < amount){
                    System.out.println("\t\t\t\t\tWait for a deposit");
                    newDeposit.await();
                }
                balance -= amount;
                System.out.println("\t\t\t\t\t\t\tWithdraw "+ amount + "\t\t\t\t\t\t" + getBalance());

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally{
                lock.unlock();
            }

        }



    public static class DepositTask implements Runnable{

        @Override
        public void run() {
            try{
                while(true){
                    account.deposit( (int) (Math.random() * 20 +5));
                    Thread.sleep(1000);

                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static class WithdrawTask implements Runnable{

        @Override
        public void run() {

                while(true){
                    account.withdraw( (int) (Math.random() * 20 +5));

                }

            }
        }
    }


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Account.DepositTask());
        executorService.execute(new Account.WithdrawTask());
        executorService.shutdown();

//        System.out.println("The Balance is  " + account.getBalance());








    }
}