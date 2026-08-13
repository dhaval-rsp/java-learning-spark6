class P6_Factorial {
    public static void main(String[] args) {
        
		int n = 5;
		int fact = 1;

		while(n>=1){
			fact *= n;
			n--;
		}
		System.out.println("Factorial of 5 is: " + (fact));
    }
}