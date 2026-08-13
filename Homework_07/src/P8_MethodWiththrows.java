import java.io.*;

public class P8_MethodWiththrows {
    public static void main(String[] args) {
        FileService service = new FileService();

        try {
            service.readFile(); // Call method that declares throws
        }

        catch (FileNotFoundException e) {
            System.out.println("Error: The file 'student.txt' does not exist.");
        }

        finally {

            System.out.println("Program completed");
        }

    }
}

class FileService {

    void readFile() throws FileNotFoundException {
        FileReader reader = new FileReader("student.txt");
        System.out.println("File 'student.txt' opened successfully.");
    }
}

