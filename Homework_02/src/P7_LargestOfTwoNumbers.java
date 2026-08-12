class P7_LargestOfTwoNumbers {
    public static void main(String[] args) {

		// input numbers
		int a = 10;
		int b = 11;

		// condition to check largest num
		if (a > b){
			System.out.println("Your numbers are a: " + a + " & b: " + b);
			System.out.println("Number a is greater than b");
		}
		else if (a < b){
			System.out.println("Your numbers are a: " + a + " & b: " + b);
			System.out.println("Number b is greater than a");
		}
		else {
			System.out.println("Your numbers are a: " + a + " & b: " + b);
			System.out.println("Both are equal");
		}
    }
}

/*
Program 7: Largest Of Two Numbers
Create two integer variables and print which number is greater.
If both numbers are equal, print:
Both numbers are equal
 */