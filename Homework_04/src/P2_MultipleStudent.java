public class P2_MultipleStudent {
    public static void main(String[] args) {

        // Using array to create 3 students
        Student[] s = new Student[3]; // Student class is in same package in P1_StudentDetails file

        // Create Student objects
        s[0] = new Student();
        s[1] = new Student();
        s[2] = new Student();

        s[0].name = "Akash";
        s[0].rollNumber = 21;
        s[0].age = 23;
        s[0].marks = 99;

        s[1].name = "Prabal";
        s[1].rollNumber = 22;
        s[1].age = 24;
        s[1].marks = 89;

        s[2].name = "PK";
        s[2].rollNumber = 23;
        s[2].age = 25;
        s[2].marks = 69;

        // Print details
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].name);
            System.out.println(s[i].rollNumber);
            System.out.println(s[i].age);
            System.out.println(s[i].marks);
            System.out.println("---------------");
        }
    }
}

/*
## `Program 2: Multiple Students`

Create three Student objects with different names, roll numbers, and marks.
Print the details of all three objects.
 */