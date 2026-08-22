import java.util.*;

public class P1_StudentList {
    public static void main(String[] args) {

        // create an array list of StudentClass
        List<StudentClass> students = new ArrayList<>();

        // adding students
        students.add(new StudentClass(1,"Jatin",79));
        students.add(new StudentClass(2,"Maria",56));
        students.add(new StudentClass(3,"Bob",95));
        students.add(new StudentClass(4,"Amit",45));
        students.add(new StudentClass(5,"Priya",93));

        for(StudentClass s : students) {
            System.out.println(s);
        }
    }
}

// Student class
class StudentClass {

    int s_id;
    String name;
    int marks;

    StudentClass(int s_id, String name, int marks) {
        this.s_id = s_id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student[Name=" + name + ", ID=" + s_id + ", Marks=" + marks + "]";
    }
}

/*
Program 1: Student List
Create a Student class with:
	id
	name
	marks

Create an ArrayList<Student>.

Add 5 students.

Print all students using enhanced for loop.
 */