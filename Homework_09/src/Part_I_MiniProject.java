import java.util.*;

public class Part_I_MiniProject {
    public static void main(String[] args) {

        Course course = new Course();
        course.id = 1;
        course.name = "Java Programming";

        // Add 5 students
        course.addStudent(new Student(101, "Rahul", "rahul@gmail.com", 75));
        course.addStudent(new Student(102, "Priya", "priya@gmail.com", 85));
        course.addStudent(new Student(103, "Amit", "amit@gmail.com", 65));
        course.addStudent(new Student(104, "Sneha", "sneha@gmail.com", 90));
        course.addStudent(new Student(105, "Raj", "raj@gmail.com", 55));
        System.out.println("-----------------------------------------");

        // Duplicate email test
        course.addStudent(new Student(106, "Duplicate Student", "rahul@gmail.com", 70));
        System.out.println("-----------------------------------------");

        // Search by id
        System.out.println("Search Student with id 103: " + course.searchById(103));
        System.out.println("-----------------------------------------");

        // Print students sorted by marks
        System.out.println("Students sorted by marks:");
        course.printSortedByMarks();
        System.out.println("-----------------------------------------");

        // Print unique emails
        course.printUniqueEmails();
        System.out.println("-----------------------------------------");

        // Process extra class
        course.processExtraClass();
    }
}

// Student class
class Student {

    int s_id;
    String name;
    String email;
    int marks;

    Student(int s_id, String name, String email, int marks) {
        this.s_id = s_id;
        this.name = name;
        this.email = email;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return s_id + " - " + name + " (" + email + ") : " + marks;
    }
}

// Course class
class Course {

    int id;
    String name;

    // Student object list
    ArrayList<Student> students = new ArrayList<>();

    // Emails list
    HashSet<String> emails = new HashSet<>();

    // Search student object by s_id
    HashMap<Integer, Student> studentMap = new HashMap<>();

    // Sorting Student by Marks [Integer wrapper used]
    TreeSet<Integer> sortedMarks = new TreeSet<>();

    // setting priority of Student object based on s.marks
    PriorityQueue<Student> extraClassQueue =
            new PriorityQueue<>(Comparator.comparingInt(s -> s.marks));


    // Student object has 4 things
        // int s_id;
        // String name;
        //String email;
        //int marks;

    // method to add student details into all collection list
    void addStudent(Student s) {

        // Reject duplicate emails
        if (emails.contains(s.email)) {
            System.out.println("Duplicate email : " + s.email + " rejected for new student: " + s.name);
            return;
        }

        students.add(s);            // ArrayList 'students' used to add Student object s - which means all 4 things available in ArrayList
        emails.add(s.email);        // HashSet 'emails' used to add email of student s.email - which means it stores only unique emails
        studentMap.put(s.s_id, s);  // HashMap 'studentMap' used to map s_id with Student object s for faster search
        sortedMarks.add(s.marks);   // TreeSet 'sortedMarks' used to add student marks s.marks
        extraClassQueue.add(s);     // PriorityQueue 'extraClassQueue' used to store the Student object s after sorting low marks sorting

        System.out.println("Added " + s.name + " into the database");
    }

    // using HashMap to search Student object by s_id - it returns Student object
    Student searchById(int s_id) {
        return studentMap.get(s_id);
    }

    // Printing student object based on marks sorting
    void printSortedByMarks() {
        students.stream()
                .sorted(Comparator.comparingInt(st -> st.marks))
                .forEach(System.out::println);
    }

    // direct printing HashSet as it stores unique emails
    void printUniqueEmails() {
        System.out.println("Unique Emails: " + emails);
    }

    //
    void processExtraClass() {
        System.out.println("Processing students with lowest marks first:");
        while (!extraClassQueue.isEmpty()) {
            System.out.println(extraClassQueue.poll());
        }
    }
}

/*
Create a small **Student Course Management System**

Classes:
--------
Student
	- id
	- name
	- email
	- marks

Course
	- id
	- name
	- students

Use these collections:
--------------
ArrayList<Student> -> store students in a course
HashSet<String> -> prevent duplicate emails
HashMap<Integer, Student> -> search student by id
TreeSet<Integer> -> sorted marks
PriorityQueue<Student> -> process lowest marks students first for extra class

Requirements:
----------------------
	1. Add at least 5 students.
	2. Reject duplicate emails.
	3. Search student by id.
	4. Print students sorted by marks using Comparator.
	5. Print unique emails.
	6. Process students for extra class based on lowest marks first.
	7. Explain why each collection was used.
 */