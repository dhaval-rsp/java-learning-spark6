public class P6_MiniProject {
    public static void main(String[] args) {
        String studentName = "Dhaval";
        int rollNumber = 21;
        String collegeName = "SSIT";
        String courseName = "Electrical Engineering";
        int semester = 8;
        int javaMarks = 48;
        int databaseMarks = 69;
        int webTechnologyMarks = 58;
        int totalMarks = javaMarks + databaseMarks + webTechnologyMarks;
        float percentage = ( totalMarks / 300.00f ) * 100;
        char grade = 'B';
        boolean isPass = true;

        System.out.println("Student's Name: " + studentName);
        System.out.println("Student's Roll Number: " + rollNumber);
        System.out.println("Student's College Name: " + collegeName);
        System.out.println("Student's Course Name: " + courseName);
        System.out.println("Student's Semester: " + semester);
        System.out.println("Student's Java Marks: " + javaMarks);
        System.out.println("Student's DB Marks: " + databaseMarks);
        System.out.println("Student's Web Tech. Marks: " + webTechnologyMarks);
        System.out.println("Student's Total Marks: " + javaMarks + "+" + databaseMarks + "+" + webTechnologyMarks +": " + totalMarks);
        System.out.println("Student's Percentage: " + percentage);
        System.out.println("Student's Grade: " + grade);
        System.out.println("Student's Pass Status: " + isPass);


    }
}
