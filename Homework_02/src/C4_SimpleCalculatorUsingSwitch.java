class C4_SimpleCalculatorUsingSwitch {
    public static void main(String[] args) {

		// inputs
		int a = 20;
		int b = 5;

		// operator
		char operator = '+';
		
		switch(operator){

			case '+':
				System.out.println("Your inputs are a=" +a+ " & b="+ b);
				System.out.println("Addition of inputs are: " + (a+b));
				break;

			case '-':
				System.out.println("Your inputs are a=" +a+ " & b="+ b);
				System.out.println("Substraction of inputs are: " + (a-b));
				break;

			case '*':
				System.out.println("Your inputs are a=" +a+ " & b="+ b);
				System.out.println("Multiplication of inputs are: " + (a*b));
				break;

			case '/':
				System.out.println("Your inputs are a=" +a+ " & b="+ b);
				System.out.println("Division of inputs are: " + (a/b));
				break;

			case '%':
				System.out.println("Your inputs are a=" +a+ " & b="+ b);
				System.out.println("Remainder of inputs are: " + (a%b));
				break;

			default:
				System.out.println("Invalid operation");
		}
    }
}

/*
Challenge 4: Simple Calculator Using Switch
Create:
int a = 20;
int b = 5;
char operator = '+';
Use switch on operator .
Support:
+
-
*
/
%
*/