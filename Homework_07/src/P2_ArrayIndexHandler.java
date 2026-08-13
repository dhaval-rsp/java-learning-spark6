import java.util.Scanner;
import java.util.InputMismatchException;

public class P2_ArrayIndexHandler {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50}; // Array of 5 integers

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an index [0-4]: ");
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + " = " + numbers[index]);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. Please enter a number between 0 and 4.");
        }

        catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter an integer.");
        }

        finally {
            // closing code
            System.out.println("Program completed");
        }
    }
}

