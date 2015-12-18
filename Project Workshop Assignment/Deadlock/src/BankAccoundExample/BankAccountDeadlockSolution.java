package BankAccoundExample;

/**
 * @author Anjita
 * Class BankAccountDeadlockSolution showing solution of DeadLock
 */
public class BankAccountDeadlockSolution {

	double balance;
    int id;
     
    /**
     * Constructor with argument
     * @param id : account id
     * @param balance : account balance
     */
    BankAccountDeadlockSolution(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
     
    /**
     * method to withdraw amount from account
     * @param amount : amount to withdraw
     */
    void withdraw(double amount) {
        try {
        	Thread.sleep(10l);
        	
        	} catch (InterruptedException e) {	
        	}
        balance -= amount;
    }
     
    /**
     * method to deposit amount from account
     * @param amount : amount to deposit
     */
    void deposit(double amount) {
        try {
        	Thread.sleep(10l);
        	} catch (InterruptedException e) {	
        	}
        balance += amount;
    }
     
    /**
     * method to transfer balance form one account to another account.
     * method synchronizes two accounts one by one.
     * @param from : account from which amount will transfer
     * @param to : account to which balance will transfer
     * @param amount : amount which will transfer
     */
    static void transfer(BankAccount from, BankAccount to, double amount) {
        synchronized(from) {
        	 synchronized(to) {
	            from.withdraw(amount);
	            System.out.println("syncronized with bank account id"+from.id+"first step");
	            to.deposit(amount);
	            System.out.println("syncronized with bank account id"+to.id+"second step");
            }
        }
    }
     
    /**
     * main function showing deadlock occurrence
     * @param args
     */
    public static void main(String[] args) {
        final BankAccount fooAccount = new BankAccount(1, 100d);
        final BankAccount barAccount = new BankAccount(2, 100d);
          
        new Thread() {
            public void run() {
                BankAccount.transfer(fooAccount, barAccount, 10d);
            }
        }.start();
         
        new Thread() {
            public void run() {
                BankAccount.transfer(barAccount, fooAccount, 10d);
            }
        }.start();
         
    }
}
