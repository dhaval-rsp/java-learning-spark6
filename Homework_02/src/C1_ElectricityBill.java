class C1_ElectricityBill {
    public static void main(String[] args) {

		// input units
		int units = 180;
		
		if (units <= 100) {
			System.out.println("You consumed " +units);
			System.out.println("Your Total bill is " +units+ "*" + "5 = " + (units*5));
		}
		else {
			System.out.println("You consumed " + units + " units.");
			System.out.println("--------------------------");
			System.out.println("Bill for first 100 units is " +100+ "*" + "5 = " + (100*5) );
			System.out.println("Bill for rest of units is " + (units-100) + "*" + "8 = " + ((units-100)*8));
			System.out.println("Your Total Bill is " +((100*5) + ((units-100)*8))  );
		}
    }
}

/*
Challenge 1: Electricity Bill
Create variable:
int units = 180;
Calculate bill:
First 100 units: 5 rupees per unit
Next units: 8 rupees per unit
Example:
For 180 units:
100 * 5 + 80 * 8
*/