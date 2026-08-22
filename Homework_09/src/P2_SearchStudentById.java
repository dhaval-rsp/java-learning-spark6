import java.util.*;

public class P2_SearchStudentById {
    public static void main(String[] args) {

        List<StudentClass> list = new ArrayList<>(); // StudentClass used from P1_StudentList.java

        // adding students
        list.add(new StudentClass(1,"Jatin",79));
        list.add(new StudentClass(2,"Maria",56));
        list.add(new StudentClass(3,"Bob",95));
        list.add(new StudentClass(4,"Amit",45));
        list.add(new StudentClass(5,"Priya",93));

        int searchId = 3;
        boolean found = false;

        for (StudentClass s : list) {
            if (s.s_id == searchId) {
                System.out.println("Found: " + s);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found");
        }
    }
}

/*
Is ArrayList the fastest structure for id lookup?
No. An ArrayList requires scanning each element one by one (linear search, 𝑂(𝑛)).
For large datasets, this is slow.
Use HasMap for searching as O(1) time
 */

/*
Program 2: Search Student By Id
Using the same student list, search student by id.

If found, print student details.

If not found, print:
	Student not found

Write:
	Is ArrayList the fastest structure for id lookup?
	Which collection would be better?
 */