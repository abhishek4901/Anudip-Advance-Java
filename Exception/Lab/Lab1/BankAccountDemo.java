
import java.util.Scanner;
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// BankAccount class
class BankAccount {
    private double balance;
 
    // constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // withdraw method with exception handling
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal failed! Balance is only: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount);
    }

    // get current balance
    public double getBalance() {
        return balance;
    }
}
public class BankAccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(1000.0); // initial balance

        System.out.println("Initial Balance: " + account.getBalance());

        // deposit
        System.out.print("Enter deposit amount: ");
        double dep = sc.nextDouble();
        account.deposit(dep);

        // withdraw
        System.out.print("Enter withdrawal amount: ");
        double wd = sc.nextDouble();
        try {
            account.withdraw(wd);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Final Balance: " + account.getBalance());
        sc.close();
    }
}