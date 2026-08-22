import java.util.*;

public class P12_SortStudentsByMarks {
    public static void main(String[] args) {

        // Create list of students
        List<StudentC> students = new ArrayList<>();
        students.add(new StudentC(1, "Rahul", 55));
        students.add(new StudentC(2, "Priya", 72));
        students.add(new StudentC(3, "Amit", 68));
        students.add(new StudentC(4, "Sneha", 90));
        students.add(new StudentC(5, "Raj", 81));

        // Sort by marks ascending
        Collections.sort(students, Comparator.comparingInt(s -> s.marks));

        System.out.println("Students sorted by marks (Ascending):");
        for (StudentC s : students) {
            System.out.println(s);
        }

        // Sort by marks descending
        Collections.sort(students, Comparator.comparingInt((StudentC s) -> s.marks).reversed());

        System.out.println("\nStudents sorted by marks (Descending):");
        for (StudentC s : students) {
            System.out.println(s);
        }
    }
}

// Student class
class StudentC {
    int id;
    String name;
    int marks;

    StudentC(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student[ID=" + id + ", Name=" + name + ", Marks=" + marks + "]";
    }
}

/*
Program 12: Sort Students By Marks
Create Student class with:
	id
	name
	marks

Use Comparator to sort students by marks ascending.

Then sort by marks descending.
 */