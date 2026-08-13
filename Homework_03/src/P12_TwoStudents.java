class StudentRegistration{
	String name;
	int rollNumber;
	int age;
	int marks;
}

class P12_TwoStudents {
    public static void main(String[] args) {

		StudentRegistration student1 = new StudentRegistration();
		StudentRegistration student2 = new StudentRegistration();
			
		// assigning values
		student1.name = "Dhaval";
		student1.rollNumber = 21;
		student1.age = 26;
		student1.marks = 400;
		
		student2.name = "Jatin";
		student2.rollNumber = 22;
		student2.age = 22;
		student2.marks = 500;
		
		System.out.println();
		System.out.println("Value of Name: " + student1.name);
		System.out.println("Value of Roll No: " + student1.rollNumber);
		System.out.println("Value of Age: " + student1.age);
		System.out.println("Value of Marks: " + student1.marks);
		
		System.out.println();
		System.out.println("Value of Name: " + student2.name);
		System.out.println("Value of Roll No: " + student2.rollNumber);
		System.out.println("Value of Age: " + student2.age);
		System.out.println("Value of Marks: " + student2.marks);
    }
}