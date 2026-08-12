class C2_SimpleATMWithdrawal {
    public static void main(String[] args) {

		// input balance & withdrawal amount
		int balance = 5000;
		int withdrawAmount = 5500;
		
		if (withdrawAmount <= balance) {
			System.out.println("Withdrawal successful");
			System.out.println("Remaining balance: " + (balance-withdrawAmount));
		}
		else{
			System.out.println("Insufficient balance");
		}
    }
}

/*
Challenge 2: Simple ATM Withdrawal
Create:
int balance = 5000;
int withdrawAmount = 2000;
If withdraw amount is less than or equal to balance, print:
Withdrawal successful
Remaining balance: 3000
Otherwise print:
Insufficient balance
*/