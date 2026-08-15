public class P1_DivisionCalculator {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 0;

        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        finally {
            System.out.println("Program completed");
        }
    }
}

/*
## `Program 1: Division Calculator`

Create a program that divides two numbers.
Requirements:
	If second number is zero, handle ArithmeticException .
	Print meaningful message.
	Print "Program completed" at the end.
 */