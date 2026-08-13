public class P3_ObjectCounter {
    public static void main(String[] args) {
        StudentNew s1 = new StudentNew("Jatin");
        StudentNew s2 = new StudentNew("Akash");
        StudentNew s3 = new StudentNew("Ayush");

        StudentNew.showTotalStudents();
    }
}

class StudentNew{
    String name;
    static int studentCount = 0;

    // constructor that take student and increases counter
    public StudentNew(String name){
        this.name = name;
        studentCount++;
    }

    static void showTotalStudents() {
        System.out.println("Total students created = " + studentCount);
    }

}


