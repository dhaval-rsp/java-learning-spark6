class StudentArr {
    String name;
    int marks;

    // constructor
    StudentArr (String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class C4_ObjectsInAnArray {
    public static void main(String[] args) {

        // Create an array that can hold 3 Student objects
        StudentArr[] s = new StudentArr[3];

        // Place 3 Student objects in the array
        s[0] = new StudentArr("Alice", 85);
        s[1] = new StudentArr("Bob", 90);
        s[2] = new StudentArr("Charlie", 78);

        // Use a loop to print each student's name and marks
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].name + " - " + s[i].marks);
        }
    }
}