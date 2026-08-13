class EmployeeDetail{
	int employeeId;
	String employeeName;
	double monthlySalary;
}

class P15_Employee {
    public static void main(String[] args) {
		EmployeeDetail dhaval = new EmployeeDetail();
		
		dhaval.employeeId = 587;
		dhaval.employeeName = "Dhaval";
		dhaval.monthlySalary = 75000.0;
		
		System.out.println("Annual Salary of " + dhaval.employeeName + " is: " + (dhaval.monthlySalary*12));
	}
}