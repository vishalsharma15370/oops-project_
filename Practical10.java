class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = Math.max(0, balance);
    }
    String getAccountHolder() { return accountHolder; }
    String getAccountNumber() { return accountNumber; }
    double getBalance() { return balance; }

    void deposit(double amount) {
        if (amount <= 0) System.out.println("Invalid deposit amount");
        else {
            balance += amount;
            System.out.println("Deposit successful: " + amount);
        }
    }
    void withdraw(double amount) {
        if (amount <= 0) System.out.println("Invalid withdrawal amount");
        else if (amount > balance) System.out.println("Insufficient balance");
        else {
            balance -= amount;
            System.out.println("Withdrawal successful: " + amount);
        }
    }
}
public class Practical10 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Neha", "ACC101", 5000);
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        account.deposit(1000);
        account.deposit(-200);
        account.withdraw(1500);
        account.withdraw(0);
        account.withdraw(10000);
        System.out.println("Updated Balance: Rs. " + account.getBalance());
    }
}
