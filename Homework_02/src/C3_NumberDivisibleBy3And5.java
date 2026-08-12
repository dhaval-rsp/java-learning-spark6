class C3_NumberDivisibleBy3And5 {
    public static void main(String[] args) {

		// input num
		int num = 22;
		
		if(num % 5 == 0 && num % 3 == 0){
			System.out.println("Your Number is: " + num);
			System.out.println("divisible by both 3 and 5");
		}
		else if(num % 5 == 0 ){
			System.out.println("Your Number is: " + num);
			System.out.println("divisible only by 5");
		}
		else if(num % 3 == 0 ){
			System.out.println("Your Number is: " + num);
			System.out.println("divisible only by 3");
		}
		else{
			System.out.println("not divisible by 3 or 5");
		}
    }
}

/*
Challenge 3: Number Divisible By 3 And 5
Create one integer variable.
Check:
divisible by both 3 and 5
divisible only by 3
divisible only by 5
not divisible by 3 or 5
*/