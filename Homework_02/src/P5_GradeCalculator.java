class P5_GradeCalculator {
    public static void main(String[] args) {

		int marks = 90; // input marks
		System.out.println("Your marks are: " + marks); // printing input marks

		// conditions to check grade
		if(marks >= 90){
			System.out.println("Your Grade: A+");
		}
		else if(marks >= 75){
			System.out.println("Your Grade: A");
		}
		else if(marks >= 60){
			System.out.println("Your Grade: B");
		}
		else if(marks >= 40){
			System.out.println("Your Grade: C");
		}
		else{System.out.println("Your'e Fail");}
    }
}

/*
Program 5: Grade Calculator
Create a marks variable and print grade:
Marks Grade
>= 90 A+
>= 75 A
>= 60 B
>= 40 C
< 40 Fail
 */