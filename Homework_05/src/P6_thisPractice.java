public class P6_thisPractice {
    public static void main(String[] args) {
        Course c1 = new Course("MBA", 3);

        System.out.println("-----------------");
        Course c2 = new Course("BTECH", 4, 1000000);
    }
}

class Course{
    private String courseName;
    private int duration;
    private double fees;

    Course(String courseName, int duration){
        this.courseName = courseName;
        this.duration = duration;
        System.out.println("Calling from 1st");
    }

    Course(String courseName, int duration, double fees){
        this(courseName,duration); // reused the first constructor
        this.fees = fees;
        System.out.println("Calling form 2nd");
    }

}


/*
## `Program 6: this() Practice`

Create a Course class with:
	courseName
	duration
	fees

Create two constructors:
	Course(String courseName, int duration)
	Course(String courseName, int duration, double fees)

Call the first constructor from the second constructor using this() .
 */