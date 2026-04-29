class BankAccount {
    // private data (encapsulated)
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    // constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    // getter (read access)
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    // setter (write access) (controlled access with validation) (for deposit)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // setter (controlled access with validation) (for withdrawal)
    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

     // 🔒 No direct setter for balance (IMPORTANT)
}
public class EncapsulationExample06 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456789", "Alice", 1000); 
        System.out.println("Account Holder: " + account1.getAccountHolderName());
        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Initial Balance: " + account1.getBalance());

        account1.deposit(500); // valid deposit
        account1.withdraw(200); // valid withdrawal

        account1.deposit(-100); // invalid deposit
        account1.withdraw(2000); // invalid withdrawal (insufficient balance)

        System.out.println("Final Balance: " + account1.getBalance());
    }
}
