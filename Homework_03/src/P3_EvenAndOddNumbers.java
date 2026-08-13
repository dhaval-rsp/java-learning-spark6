class P3_EvenAndOddNumbers {
    public static void main(String[] args) {
        
		System.out.println("Odd Numbers ARE: " );

		for (int i=1; i<=50; i++ ) {
			
			if (i%2 !=0) {
				System.out.print(i + " ");
			}
		}

		System.out.println("" );
		System.out.println("" );

		System.out.println("Even Numbers ARE: " );

		for (int i=1; i<=50; i++ ) {
			
			if (i%2 ==0) {
				System.out.print(i + " ");
			}
		}
    }
}