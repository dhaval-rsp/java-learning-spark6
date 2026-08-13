public class P1_LocalAndInstanceVariable {
    public static void main(String[] args) {
        Student s = new Student("Jatin", 85);
        s.showResult();

    }
}


class Student {
    private String name; // instance var
    private int marks; //instance var

    // created constructor to make easy use of code
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void showResult() {

        String result; // local var

        if (marks >= 40){
            result= "Pass";
        }
        else {
            result = "Fail";
        }
        System.out.println("Student " + name + " has scored marks = " + marks + " and result is " + result);
    }
}


