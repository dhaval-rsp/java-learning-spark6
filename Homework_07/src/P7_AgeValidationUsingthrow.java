public class P7_AgeValidationUsingthrow {
    public static void main(String[] args) {
        VoterService service = new VoterService();

        try {
            service.checkAge(20);
            service.checkAge(15);
        }

        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Handle exception in main
        }

        finally {
            System.out.println("Program completed");
        }
    }
}

class VoterService {

    public void checkAge(int age) {
        if (age < 18) {
            // Explicitly throw exception if age is invalid
            throw new IllegalArgumentException("Error: Age must be 18 or above to vote.");
        }
        else {
            System.out.println("Allowed to vote");
        }
    }
}


