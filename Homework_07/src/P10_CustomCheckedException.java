public class P10_CustomCheckedException {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0);

        try {
            account.withdraw(200.0);
            account.withdraw(400.0);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage()); // Handle custom checked exception
        }

        finally {
            System.out.println("Program completed");
        }
    }
}


// Custom checked exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Withdraw method with throws
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Error: Withdrawal amount " + amount + " exceeds available balance " + balance
            );
        }
        else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }
}
