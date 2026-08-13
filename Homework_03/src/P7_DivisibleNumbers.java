class P7_DivisibleNumbers {
    public static void main(String[] args) {

		System.out.print("Numbers Divisible by 3,5 Are: ");

        for(int i = 1; i<=100; i++){

			if(i%3==0 && i%5==0){
				System.out.print(i + ", ");
			}

		}
    }
}