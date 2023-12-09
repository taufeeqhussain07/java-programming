import java.util.Scanner;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String accountHolder = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount bankAccount = new BankAccount(accountHolder, initialBalance);

        System.out.println("Account created for " + accountHolder + " with initial balance: " + initialBalance);

        // Perform deposit
        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        bankAccount.deposit(depositAmount);

        // Perform withdrawal
        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();
        bankAccount.withdraw(withdrawalAmount);

        // Display final balance
        System.out.println("Final balance: " + bankAccount.getBalance());

        scanner.close();
    }
}
