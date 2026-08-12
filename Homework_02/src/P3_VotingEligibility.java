class P3_VotingEligibility {
    public static void main(String[] args) {

		int age = 2; // input age

		System.out.println("Your Age is: " + age); // printing input age
		
		if (age < 18) {
			System.out.println("You're not eligible as below 18 & age is: " + age);
		}
		else {
			System.out.println("You're eligible for voting as your age is: " + age);
		}
		
        System.out.println("Program ended");
    }
}

/*
Program 3: Voting Eligibility
Create an age variable.
If age is greater than or equal to 18, print:
Eligible to vote
Otherwise print:
Not eligible to vote
 */