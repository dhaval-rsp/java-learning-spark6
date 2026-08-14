public class P9_ConstructorInAbstractClass {
    public static void main(String[] args) {

        StudentDetail s = new StudentDetail("Jatin","CSE");

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

class StudentDetail extends User {

    String course;

    // constructor using super
    public StudentDetail(String name, String course) {
        super(name); // call parent constructor
        this.course = course;
    }

    // method to show student details
    public void showStudentDetails() {
        System.out.println("Student Name: " + name + ", Course: " + course);
    }
}

/*
## `Program 9: Constructor In Abstract Class`

Create an abstract class User with:
	instance variable name
	constructor to initialize name
	normal method showName()

Create child class Student with:
	instance variable course
	constructor using super(name)
	method showStudentDetails()

Create object of Student and print details
 */