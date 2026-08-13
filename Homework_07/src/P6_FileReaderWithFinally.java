import java.io.*;

public class P6_FileReaderWithFinally {
    public static void main(String[] args) {

        FileReader reader = null; // reader initially null

        try {
            reader = new FileReader("student.txt"); // Open file inside try
            System.out.println("File 'student.txt' opened successfully.");
        }

        catch (FileNotFoundException e) {
            System.out.println("Error: The file 'student.txt' does not exist.");
        }
        finally {
            try {
                if (reader != null) {
                    reader.close(); // Close file inside finally
                    System.out.println("File closed successfully.");
                }
            } catch (IOException e) {
                System.out.println("Error: Could not close the file properly.");
            }
            System.out.println("Program completed");
        }
    }
}
