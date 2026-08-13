class BankAccount{
	String accountHolder;
	long accountNumber;
	double balance;
}

class P16_BankAccount {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
		
		myAcc.accountHolder = "Dhaval Prajapati";
		myAcc.accountNumber = 3778252249L;
		myAcc.balance = 250000d;
		
		System.out.println("The account holder of this account is " + myAcc.accountHolder);
		System.out.println("Account number of " + myAcc.accountHolder + "'s account is " + myAcc.accountNumber);
		System.out.println("Balance of " + myAcc.accountHolder + "'s account is " + myAcc.balance); 
    }
}