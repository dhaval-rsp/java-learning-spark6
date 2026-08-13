
class StudentDetails{
	String name;
	int rollNumber;
	int age;
	int marks;
}

class P11_Student {
    public static void main(String[] args) {
		StudentDetails s = new StudentDetails();
		
		System.out.println("Default value of Name: " + s.name);
		System.out.println("Default value of Roll No: " + s.rollNumber);
		System.out.println("Default value of Age: " + s.age);
		System.out.println("Default value of Marks: " + s.marks);
		
		// assigning values
		s.name = "Dhaval";
		s.rollNumber = 21;
		s.age = 26;
		s.marks = 400;
		
		System.out.println();
		System.out.println("Value of Name: " + s.name);
		System.out.println("Value of Roll No: " + s.rollNumber);
		System.out.println("Value of Age: " + s.age);
		System.out.println("Value of Marks: " + s.marks);
    }
}