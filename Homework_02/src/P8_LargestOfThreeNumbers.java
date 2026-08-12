class P8_LargestOfThreeNumbers {
    public static void main(String[] args) {

		// inputs
		int a = 111;
		int b = 111;
		int c = 111;

		// condition to check greatest of all
        if (a == b && a > c) {
			System.out.println("Your Numbers are: a=" + a + " b=" + b + " c=" + c);
			System.out.println("Number a & b are largest" );
		}			
		else if (b == c && b > a) {
			System.out.println("Your Numbers are: a=" + a + " b=" + b + " c=" + c);
			System.out.println("Number b & c are largest" );			
		}
		else if (c == a && a > b) {
			System.out.println("Your Numbers are: a=" + a + " b=" + b + " c=" + c);
			System.out.println("Number a & c are largest" );			
		}
		else if (a > b && a > c) {
			System.out.println("Your Numbers are: a=" + a + " b=" + b + " c=" + c);
			System.out.println("Number a is largest" );
		}
		else if (b > a && b > c) {
			System.out.println("Your Numbers are: a=" + a + " b=" + b + " c=" + c);
			System.out.println("Number b is largest" );
		}
		else if (c > a && c > b) {
			System.out.println("Your Numbers are: a=" + a + " b=" + b + " c=" + c);
			System.out.println("Number c is largest" );
		}
		else{
			System.out.println("Your Numbers are: a=" + a + " b=" + b + " c=" + c);
			System.out.println("All are same" );			
		}
		
    }
}

/*
Program 8: Largest Of Three Numbers
Create three integer variables and find the largest number
 */