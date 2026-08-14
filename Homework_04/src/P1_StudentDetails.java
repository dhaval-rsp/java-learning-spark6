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

class Student{
    String name;
    int rollNumber;
    int age;
    int marks;
}

/*
## `Program 1: Student Details`
Create a Student class containing:
String name;
int rollNumber;
int age;
int marks;

In another class containing main :
        1. Create a Student object.
        2. Assign field values using the dot operator.
    	3. Print all details
*/