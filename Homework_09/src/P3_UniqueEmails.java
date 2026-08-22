import java.util.*;

public class P3_UniqueEmails {
    public static void main(String[] args) {

        // Create a list with duplicate emails
        List<String> emails = new ArrayList<>();
        emails.add("rahul@gmail.com");
        emails.add("priya@gmail.com");
        emails.add("amit@gmail.com");
        emails.add("rahul@gmail.com");  // duplicate
        emails.add("sneha@gmail.com");
        emails.add("amit@gmail.com");   // duplicate

        System.out.println("Original list (with duplicates):");
        for (String e : emails) {
            System.out.println(e);
        }

        // Remove duplicates using HashSet
        Set<String> uniqueEmails = new HashSet<>(emails); // assigned existing emails list HashSet automatically take care of duplicate

        System.out.println("\nUnique emails:");
        for (String e : uniqueEmails) {
            System.out.println(e);
        }
    }
}

/*
Program 3: Unique Emails
Create a list with duplicate email ids.

Remove duplicates using HashSet .

Print unique emails.

Write:
	Is order guaranteed?
 */