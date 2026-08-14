public class P3_StudentArray {
    public static void main(String[] args) {
        Student std[] = new Student[3]; //array of 3 student

        // creating student object with variables
        std[0] = new Student("Rahul", 22);
        std[1] = new Student("Nitesh", 11);
        std[2] = new Student("Manthan", 0);

        // calling method
        std[0].showDetails();
        std[1].showDetails();
        std[2].showDetails();

    }
}

class Student{

    // declaring private field
    private String name;
    private int marks;

    // created two params constructor
    Student(String name, int marks){
        // initialized field variable using this
        this.name = name;
        this.marks = marks;
    }

    void showDetails(){
        System.out.println("Student Name is " + name + " and obtained Marks are " + marks);
        // this method will take instance variable as no local variable is defined
    }
}

/*
## `Program 3: Student Array`

Create a Student class with:
	name
	marks
	parameterized constructor
	showDetails() method

In main , create an array of 3 Student objects and print details of all students using a loop.
 */