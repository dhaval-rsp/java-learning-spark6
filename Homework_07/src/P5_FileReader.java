import java.io.*;

public class P5_FileReader {
    public static void main(String[] args) {

        FileReader reader = null;

        try {
            reader = new FileReader("student.txt"); // providing file name
            System.out.println("Contents of student.txt:");
        }

        catch (FileNotFoundException e) {
            System.out.println("Error: The file 'student.txt' does not exist.");
        }

        finally {
            try {
                if (reader != null) {
                    reader.close(); // Ensure file is closed
                }
            }
            catch (IOException e) {
                System.out.println("Error: Could not close the file properly.");
            }

            System.out.println("\nProgram completed");
        }
    }
}

/*
## `Program 5: File Reader`

Create a program to open file:
	student.txt

Requirements:
	Use FileReader .
	Handle FileNotFoundException .
	Print meaningful message if file does not exist.
 */