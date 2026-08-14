public class PM2_CalculatorMethod {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        int resAdd = c.add(26, 2);
        int resSub = c.subtract(26, 2);
        int resMul = c.multiply(26, 2);
        int resDiv = c.divide(26, 2);

        System.out.println(resAdd);
        System.out.println(resSub);
        System.out.println(resMul);
        System.out.println(resDiv);
    }

}

class Calculator{

    int add (int a, int b){
        return a+b;
    }

    int subtract (int a, int b){
        return a-b;
    }

    int multiply (int a, int b){
        return a*b;
    }

    int divide (int a, int b){
        return a/b;
    }

}

/*
## `Program 2: Calculator`

Create a Calculator class with methods:
	int add(int a, int b)
	int subtract(int a, int b)
	int multiply(int a, int b)
	double divide(double a, double b)

Create an object and call every method.
 */