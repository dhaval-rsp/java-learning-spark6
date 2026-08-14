public class P1_ArrayMaximum {
    public static void main(String[] args) {

        // assigned given default values
        int array [] = {12, 45, 23, 67, 34};

        // create maxVal to store one default value of index 0
        int maxVal = array[0];

        // looping the array and comparing each element with maxVal value & if elemtn is > then over writing in maxVal
        for (int n : array){
            if ( n > maxVal) {
                maxVal = n;
            }
        }
        System.out.println("Maximum value of element is: " + maxVal);
    }
}

/*
## `Program 1: Array Maximum`

Create an integer array of 5 numbers and print the largest number.
Example:
	Input array: 12, 45, 23, 67, 34
	Output: 67
 */