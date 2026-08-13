class Student{
	String name;
	int rollNumber;
	int age;
	int marks;
}

class C1_StoreMultipleStudents {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
			
		// assigning values
		student1.name = "Dhaval";
		student1.rollNumber = 21;
		student1.age = 26;
		student1.marks = 400;
		
		student2.name = "Jatin";
		student2.rollNumber = 22;
		student2.age = 22;
		student2.marks = 5500;		
		
		student3.name = "John";
		student3.rollNumber = 23;
		student3.age = 24;
		student3.marks = 550;
		
		Student topper = student1;
		
		if(student2.marks > topper.marks){
			topper = student2;
		}
		if(student3.marks > topper.marks){
			topper = student3;
		}
		
		System.out.println("Topper of the class is: "+ topper.name + ", who scored " + topper.marks);
    }
}