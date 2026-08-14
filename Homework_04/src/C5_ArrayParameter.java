public class C5_ArrayParameter {
    public static void main(String[] args) {

        NumberService n = new NumberService();

        int[] nums = {90, 85, 78, 92, 65};

        System.out.println(n.calculateSum(nums));
    }
}

class NumberService{
    int sum = 0;

    int calculateSum (int[] numbers){

        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];
        }

        return  sum;
    }
}

/*
## `Challenge 5: Array Parameter`

Create a class NumberService .

Add:
	int calculateSum(int[] numbers)

Call it by passing an integer array.
 */