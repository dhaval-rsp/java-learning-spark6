public class P3_StringToNumberConverter {

    public static void main(String[] args) {

        // inputs
        String[] testStrings = {"123", "abc", "10a"};

        for (String str : testStrings) {

            try {
                int number = Integer.parseInt(str);
                System.out.println("Converted value of \"" + str + "\" = " + number);
            }

            catch (NumberFormatException e) {
                System.out.println("Error: \"" + str + "\" is not a valid integer.");
            }
        }
            System.out.println("Program completed");
    }
}

/*
## `Program 3: String To Number Converter`

Create a program that converts a String to int.
Test with:
	"123"
	"abc"
	"10a"

Handle NumberFormatException .
 */