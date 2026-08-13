public class P2_MultipleStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name = "Akash";
        s1.rollNumber = 21;
        s1.age = 23;
        s1.marks = 99;

        s2.name = "Prabal";
        s2.rollNumber = 22;
        s2.age = 24;
        s2.marks = 89;

        s3.name = "PK";
        s3.rollNumber = 23;
        s3.age = 25;
        s3.marks = 69;

        System.out.println(s1.name);
        System.out.println(s1.rollNumber);
        System.out.println(s1.age);
        System.out.println(s1.marks);
        System.out.println("---------------");
        System.out.println(s2.name);
        System.out.println(s2.rollNumber);
        System.out.println(s2.age);
        System.out.println(s2.marks);
        System.out.println("---------------");
        System.out.println(s3.name);
        System.out.println(s3.rollNumber);
        System.out.println(s3.age);
        System.out.println(s3.marks);
        System.out.println("---------------");

    }
}
