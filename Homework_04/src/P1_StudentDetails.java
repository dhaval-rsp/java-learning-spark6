class Student{
    String name;
    int rollNumber;
    int age;
    int marks;
}

public class P1_StudentDetails {
    public static void main(String[] args) {
        Student std = new Student();

        std.name = "Rahul";
        std.rollNumber = 21;
        std.age = 26;
        std.marks = 100;

        System.out.println(std.name);
        System.out.println(std.rollNumber);
        System.out.println(std.age);
        System.out.println(std.marks);
    }
}
