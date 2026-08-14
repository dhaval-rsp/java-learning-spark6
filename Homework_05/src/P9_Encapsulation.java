
public class P9_Encapsulation {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(875201142575L, 0);

        System.out.println(b1.getBalance());

        b1.withdraw(25000);
        b1.deposit(45000);

        System.out.println(b1.getBalance());
        b1.withdraw(150000);
    }
}


class BankAccount{
    private long accountNumber;
    private double balance;

    BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // getter to get the private balance
    public double getBalance() {
        return balance;
    }

    // deposit logic if amount is positive number then add rest of ignore
    void deposit(int amt) {
        if(amt > 0) {
            balance += amt;
            System.out.println("Amount " + amt + " deposited successfully!!");
        }
        else{
            System.out.println("Please deposit positive / > 0 amount");
        }
    }

    // withdrawal logic - you cannot enter 0, you cannot enter -1, you cannot take more amount than having
    void withdraw(int amt) {
        if (amt <= 0) {
            System.out.println("You cannot withdraw negative or zero amount ");
        }
        else if (amt > balance) {
            System.out.println("Insufficient balance! Current balance is: " + balance);
        }
        else {
            balance -= amt;
            System.out.println("Withdrawal Successful, please collect cash amount of:-  " + amt );
        }
    }
}

/*
## `Program 9: Encapsulation`

Create a BankAccount class with private fields:
	accountNumber
	balance

Create methods:
	deposit(double amount)
	withdraw(double amount)
	getBalance()

Rules:
	Deposit only positive amount.
	Withdraw only if balance is enough.
	Direct balance access should not be allowed
 */