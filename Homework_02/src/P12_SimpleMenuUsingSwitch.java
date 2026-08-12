class P12_SimpleMenuUsingSwitch {
    public static void main(String[] args) {
		int choice = 10;
		switch (choice) {
		
		case 1:
			System.out.println("Add money");
			break; // Exits the switch block
		case 2:
			System.out.println("Withdraw money");
			break;
		case 3:
			System.out.println("Check balance");
			break;
		case 4:
			System.out.println("Exit");
			break;
		default: // Executed if no case matches
			System.out.println("Invalid Choice");
			break; 
		}	
    }
}

/*
Program 12: Simple Menu Using Switch
Create an integer variable choice .
Print:
Choice Message
1 Add money
2 Withdraw money
3 Check balance
4 Exit
For any other choice, print:
Invalid choice
*/

