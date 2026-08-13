class   StudentMarks{
    String name;
    int marks;
}

public class C1_HighestMarks {
    public static void main(String[] args) {
        StudentMarks[] s = new StudentMarks[4];

        s[0] = new StudentMarks();
        s[1] = new StudentMarks();
        s[2] = new StudentMarks();
        s[3] = new StudentMarks();

        s[0].name = "Hardik";
        s[0].marks = 69;

        s[1].name = "Pant";
        s[1].marks = 98;

        s[2].name = "Abhishek";
        s[2].marks = 88;

        s[3].name = "Vaibhav";
        s[3].marks = 93;

        StudentMarks topper = s[0];

        for(int i = 1; i < s.length; i++){
            if (s[i].marks > topper.marks) {
                topper = s[i];
            }
        }
        System.out.println("Topper is " + topper.name + " with marks " + topper.marks);
    }
}
