public class P6_EncapsulationWithAccessModifier {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(123456789, 5);

        b.withdraw(42);
    }
}

class BankAccount {

    // private variables
    private int accountNumber; // it cannot accessible outside class
    private double balance;

    // constructor
    public BankAccount(int accountNumber, double initialBalance) {

        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
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

    // withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
        else if (amount > balance) {
            System.out.println("Insufficient balance!");
        }
        else {
            System.out.println("Withdraw amount must be positive!");
        }
    }

    // getter for balance
    public double getBalance() {
        return balance;
    }


}


