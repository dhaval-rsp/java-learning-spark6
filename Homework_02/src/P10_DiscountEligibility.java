class P10_DiscountEligibility {
    public static void main(String[] args) {

		boolean isStudent = true;
		boolean isSeniorCitizen = true;
		
		if (isStudent || isSeniorCitizen) {

			String msg = "Discount available as you are: ";

			if(isStudent && isSeniorCitizen){
				msg += "either student or senior citizen"; // concatenating the message
			}
			else if(isSeniorCitizen){
				msg += "Senior Citizen"; // concatenating the message
			}
			else{
				msg += "Student"; // concatenating the message
			}

			System.out.println(msg); // printing the message
		}
		else{
			System.out.println("No discount");
		}
    }
}

/*
Program 10: Discount Eligibility
Create:
boolean isStudent = true;
boolean isSeniorCitizen = false;
If student or senior citizen, print:
Discount available
Otherwise print:
No discount

 */