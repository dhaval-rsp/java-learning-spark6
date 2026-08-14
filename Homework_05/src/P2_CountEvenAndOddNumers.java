import java.util.Arrays;
import java.util.Scanner;

public class P2_CountEvenAndOddNumers {
    public static void main(String[] args) {

        // input initialized
        Scanner sc = new Scanner(System.in);

        // asking user to enter length of array
        System.out.println("Enter length of array you want create:- ");

        // storing user's input in n
        int n = sc.nextInt();

        // using value of n to declare the length of array
        int array [] = new int[n];

        // created even odd counter and initialized to 0
        int evenCnt = 0, oddCnt = 0;

        // asking user to print n element in your array
        System.out.println("Enter " + n + " elements to store in array");

        // using for loop to take input for each array index
        // we cannot use for each loop because it is copy of array - so when you want to go to index use for loop
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt(); // taking 5 input for the array
        }

        System.out.println("");

        // printing entire array at once
        System.out.println("Your added array is: " + Arrays.toString(array));

        // calculating odd/even element using the if condition.
        for (int i = 0; i < n; i++){
            if (array[i] % 2 == 0) {
                evenCnt++; // increased counter if element is even
            }
            if (array[i] % 2 != 0) {
                oddCnt++; // increased counter if element is odd
            }
        }

        System.out.println("Even count: " + evenCnt);
        System.out.println("Odd count: " + oddCnt);
    }
}

/*
## `Program 2: Count Even And Odd Numbers`

Create an integer array and count how many numbers are even and how many are odd.
Expected output format:
	Even count: 3
	Odd count: 2
 */