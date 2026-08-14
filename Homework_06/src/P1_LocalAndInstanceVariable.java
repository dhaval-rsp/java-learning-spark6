public class P1_LocalAndInstanceVariable {
    public static void main(String[] args) {
        Student s = new Student("Jatin", 85);
        s.showResult();

    }
}

class Student {

    // instance variables
    private String name;
    private int marks;

    // created constructor to make easy use of code
    public Student(String name, int marks) {

        this.name = name;
        this.marks = marks;
    }

    void showResult() {

        // local variable
        String result;

        if (marks >= 40){
            result= "Pass";
        }
        else {
            result = "Fail";
        }
        System.out.println("Student " + name +
                " has scored marks = " + marks +
                " and result is " + result);
    }
}


/*
## `Program 1: Local And Instance Variable`

Create a Student class with:
	instance variable name
	instance variable marks
	method showResult()

Inside showResult() , create a local variable result .
If marks are greater than or equal to 40, store "Pass" in result , otherwise store "Fail" .

Print student name, marks, and result.
 */