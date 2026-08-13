public class P3_StudentArray {
    public static void main(String[] args) {
        Student std[] = new Student[3]; //array of 3 student

        std[0] = new Student("Rahul", 22); // creating student object with variables
        std[1] = new Student("Nitesh", 11);
        std[2] = new Student("Manthan", 0);

        std[0].showDetails(); // calling method
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


