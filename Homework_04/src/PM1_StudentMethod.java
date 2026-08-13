class StudentM{

    String name;
    int rollNumber;
    int age;
    int marks;

    void displayDetails(){
        System.out.println("The student name is " + name + " with roll no: " + rollNumber + " & age " + age + ".");
        System.out.println("Total Marks Scored: " + marks);
    }
}

public class PM1_StudentMethod {
    public static void main(String[] args) {
        StudentM s1 = new StudentM();

        s1.name = "Aman";
        s1.rollNumber = 20;
        s1.age = 25;
        s1.marks =  98;

        s1.displayDetails();
    }
}
