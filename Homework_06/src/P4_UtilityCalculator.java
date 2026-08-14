public class P4_UtilityCalculator {
    public static void main(String[] args) {

        int addResult = Calculator.add(4,5);
        int subResult = Calculator.subtract(4,5);
        int mulResult = Calculator.multiply(4,5);
        double divResult = Calculator.divide(4,5);

        System.out.println(addResult);
        System.out.println(subResult);
        System.out.println(mulResult);
        System.out.println(divResult);
    }
}

class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return a / b;
    }
}

/*
## `Program 4: Utility Calculator`

Create a Calculator class with static methods:
	add(int a, int b)
	subtract(int a, int b)
	multiply(int a, int b)
	divide(int a, int b)
Call all methods using class name
 */

