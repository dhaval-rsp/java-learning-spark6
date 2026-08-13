public class P2_StaticInstituteName {
    public static void main(String[] args) {
        Student2 s1 = new Student2(22, "Jatin");
        Student2 s2 = new Student2(23, "Raghav");
        Student2 s3 = new Student2(24, "Salim");

        s1.showDetails();
        s2.showDetails();
        s3.showDetails();

        Student2.instituteName = "Gujarat University";

        s1.showDetails();
        s2.showDetails();
        s3.showDetails();

    }
}

class Student2{
    int rollNumber;
    String name;
    static String instituteName = "GTU";

    public Student2(int rollNumber, String name) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    void showDetails(){
        System.out.println("Student " + name + " with roll no = " + rollNumber + " and the institute name is " + instituteName);
    }
}


