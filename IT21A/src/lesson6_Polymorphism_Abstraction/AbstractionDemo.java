
package lesson6_polymorphism_abstraction;


abstract class BankAccount {

    private String accountHolder;
    private double balance;

   
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }


    public abstract void calculateInterest();

    
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
    }

   
    public double getBalance() {
        return balance;
    }
}


class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * 0.05;
        System.out.println("Savings Account Interest (5%): " + interest);
    }
}


class CurrentAccount extends BankAccount {

    public CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * 0.02;
        System.out.println("Current Account Interest (2%): " + interest);
    }
}


public class AbstractionDemo {

    public static void main(String[] args) {

        BankAccount savings = new SavingsAccount("Ahreda Sumohoy", 10000);
        BankAccount current = new CurrentAccount("Brianna Gulle", 20000);

        System.out.println("===== SAVINGS ACCOUNT =====");
        savings.displayBalance();
        savings.calculateInterest();

        System.out.println();

        System.out.println("===== CURRENT ACCOUNT =====");
        current.displayBalance();
        current.calculateInterest();
    }
}
