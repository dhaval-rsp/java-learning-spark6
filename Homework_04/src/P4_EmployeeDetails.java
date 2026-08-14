public class P4_EmployeeDetails {
    public static void main(String[] args) {
        Employee dhaval = new Employee();

        dhaval.employeeId = 100;
        dhaval.employeeName = "Dhaval";
        dhaval.monthlySalary = 75000;

        System.out.println("Employee " + dhaval.employeeName +
                " with employee id " + dhaval.employeeId +
                " has Annual package of " + (dhaval.monthlySalary*12));
    }
}

class Employee{
    int employeeId;
    String employeeName;
    double monthlySalary;
}

/*
## `Program 4: Employee Details`

Create an Employee class containing:
	int employeeId;
	String employeeName;
	double monthlySalary;

Create an object and calculate annual salary inside main .
 */