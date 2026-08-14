public class P6_EncapsulationWithAccessModifier {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(123456789, 500);

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
            System.out.println("Your Initial balance is : " + balance);
        }
        else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    // deposit method
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
        else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining balance: " + balance);
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

/*
## `Program 6: Encapsulation With Access Modifier`

Create a BankAccount class with:
	private variable accountNumber
	private variable balance
	constructor
	public method deposit(double amount)
	public method withdraw(double amount)
	public method getBalance()

Rules:
	Deposit only positive amount.
	Withdraw only if balance is enough.
	Balance should not be directly accessible outside the class.
 */
