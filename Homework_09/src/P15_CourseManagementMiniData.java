import java.util.*;

public class P15_CourseManagementMiniData {
    public static void main(String[] args) {

        // 1. ArrayList<String> for enrolled students
        List<String> enrolledStudents = new ArrayList<>();
        enrolledStudents.add("Rahul");
        enrolledStudents.add("Priya");
        enrolledStudents.add("Amit");
        enrolledStudents.add("Sneha");

        // 2. HashSet<String> for unique emails
        Set<String> uniqueEmails = new HashSet<>();
        uniqueEmails.add("rahul@gmail.com");
        uniqueEmails.add("priya@gmail.com");
        uniqueEmails.add("amit@gmail.com");
        uniqueEmails.add("sneha@gmail.com");
        uniqueEmails.add("rahul@gmail.com"); // duplicate ignored

        // 3. HashMap<Integer, String> for course id and course name
        Map<Integer, String> courses = new HashMap<>();
        courses.put(101, "Java");
        courses.put(102, "SQL");
        courses.put(103, "Spring");
        courses.put(104, "Collections");

        // 4. TreeSet<Integer> for sorted roll numbers
        Set<Integer> rollNumbers = new TreeSet<>();
        rollNumbers.add(105);
        rollNumbers.add(101);
        rollNumbers.add(104);
        rollNumbers.add(102);
        rollNumbers.add(103);

        // 5. LinkedHashSet<String> for uploaded emails (no duplicates, preserve order)
        Set<String> uploadedEmails = new LinkedHashSet<>();
        uploadedEmails.add("rahul@gmail.com");
        uploadedEmails.add("priya@gmail.com");
        uploadedEmails.add("amit@gmail.com");
        uploadedEmails.add("rahul@gmail.com"); // duplicate ignored, order preserved
        uploadedEmails.add("sneha@gmail.com");

        // Print all data
        System.out.println("Enrolled Students (ArrayList): " + enrolledStudents);
        System.out.println("Unique Emails (HashSet): " + uniqueEmails);
        System.out.println("Courses (HashMap): " + courses);
        System.out.println("Sorted Roll Numbers (TreeSet): " + rollNumbers);
        System.out.println("Uploaded Emails (LinkedHashSet): " + uploadedEmails);
    }
}

/*
Program 15: Course Management Mini Data
Use different collections:
	1. ArrayList<String> for enrolled students
	2. HashSet<String> for unique emails
	3. HashMap<Integer, String> for course id and course name
	4. TreeSet<Integer> for sorted roll numbers
	5. LinkedHashSet<String> for uploaded emails without duplicates but same order

Print all data.
 */