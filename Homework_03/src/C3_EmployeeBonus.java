class Employee{
	String name;
	double salary;
	int experience;

}

class C3_EmployeeBonus {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();
        Employee e5 = new Employee();
		
		e1.name = "Dhaval";
		e1.salary = 85000;
		e1.experience = 6;

		e2.name = "Prabal";
		e2.salary = 65000;
		e2.experience = 5;

		e3.name = "Rahul";
		e3.salary = 40000;
		e3.experience = 3;

		e4.name = "Akash";
		e4.salary = 50000;
		e4.experience = 5;

		e5.name = "Prashant";
		e5.salary = 10000;
		e5.experience = 1;
		
		if(e1.experience>=5){
			System.out.println("Expereince of " + e1.name + " is: " + e1.experience + " | Salary is: " + e1.salary);
			System.out.println("Bonus of " + e1.name + " is: " + ( e1.salary*0.1 )+ " | Final Salary is: " + (e1.salary+ ( e1.salary*0.1 )));
			System.out.println();
		}
		
		if(e2.experience>=5){
			System.out.println("Expereince of " + e2.name + " is: " + e2.experience + " | Salary is: " + e2.salary);
			System.out.println("Bonus of " + e2.name + " is: " + ( e2.salary*0.1 )+ " | Final Salary is: " + (e2.salary+ ( e2.salary*0.1 )));
			System.out.println();
		}

		if(e3.experience>=5){
			System.out.println("Expereince of " + e3.name + " is: " + e3.experience + " | Salary is: " + e3.salary);
			System.out.println("Bonus of " + e3.name + " is: " + ( e3.salary*0.1 )+ " | Final Salary is: " + (e3.salary+ ( e3.salary*0.1 )));
			System.out.println();
		}

		if(e4.experience>=5){
			System.out.println("Expereince of " + e4.name + " is: " + e4.experience + " | Salary is: " + e4.salary);
			System.out.println("Bonus of " + e4.name + " is: " + ( e4.salary*0.1 )+ " | Final Salary is: " + (e4.salary+ ( e4.salary*0.1 )));
			System.out.println();
		}

		if(e5.experience>=5){
			System.out.println("Expereince of " + e5.name + " is: " + e5.experience + " | Salary is: " + e5.salary);
			System.out.println("Bonus of " + e5.name + " is: " + ( e5.salary*0.1 )+ " | Final Salary is: " + (e5.salary+ ( e5.salary*0.1 )));
			System.out.println();
		}
		
	}
}