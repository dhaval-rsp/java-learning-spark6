public class P4_NullNameChecker {
    public static void main(String[] args) {

        NullNameChecker.printNameLength("Ashwani"); // Valid case
        NullNameChecker.printNameLength(null); // Null case

    }
}

class NullNameChecker {
    public static void printNameLength(String name) {

        try {
            System.out.println("Length of name: " + name.length());
        }

        catch (NullPointerException e) {
            System.out.println("Error: Name is null, cannot calculate length.");
        }

        finally {
            System.out.println("Program completed");
        }
    }

}

/*
## `Program 4: Null Name Checker`

Create a method:
	void printNameLength(String name)

If name is null, handle NullPointerException .
Then improve the same program without exception by checking:
	if (name != null)

Write which approach is better and why.
 */
