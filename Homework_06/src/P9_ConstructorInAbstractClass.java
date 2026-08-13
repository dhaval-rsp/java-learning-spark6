public class P9_ConstructorInAbstractClass {
    public static void main(String[] args) {

        StudentAbs s = new StudentAbs("Jatin","CSE");

        s.showName();
        s.showStudentDetails();
    }
}


abstract class User{
    String name;

    // constructor initialized the name
    public User(String name){
        this.name = name;
    }

    public void showName() {
        System.out.println("User Name: " + name);
    }
}

class StudentAbs extends User {

    String course;

    // constructor using super
    public StudentAbs(String name, String course) {
        super(name); // call parent constructor
        this.course = course;
    }

    // method to show student details
    public void showStudentDetails() {
        System.out.println("Student Name: " + name + ", Course: " + course);
    }
}

