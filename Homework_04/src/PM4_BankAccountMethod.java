class BankAccount{
    String accountHolder;
    double balance;

    void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println(amount + " deposited successfully!");
        }
        else{
            System.out.println("You cannot add negative amount!!");
        }
    }

    void withdraw(double amount){
        if (amount >= 0 && amount <= balance){
            balance -= amount;
            System.out.println(amount + " withdrawal completed!!");
        }
        else if (amount > balance){
            System.out.println("Insufficient balance.");
        }
        else{
            System.out.println("You cannot withdraw negative amount!!");
        }
    }

    void displayBalance(){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
    }
}

public class PM4_BankAccountMethod {
    public static void main(String[] args) {

        BankAccount sbi = new BankAccount();
        sbi.accountHolder = "Dhaval Prajapai";
        sbi.balance = 250000;

        sbi.displayBalance();
        System.out.println("------------------------------");
        sbi.deposit(50000);
        sbi.displayBalance();
        System.out.println("------------------------------");
        sbi.withdraw(10000);
        sbi.displayBalance();
        System.out.println("------------------------------");

    }
}
