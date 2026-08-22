import java.util.*;

public class P14_ComparablePractice {
    public static void main(String[] args) {

        // Create list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(103, "Rahul", 50000));
        employees.add(new Employee(101, "Priya", 60000));
        employees.add(new Employee(105, "Amit", 45000));
        employees.add(new Employee(102, "Sneha", 70000));
        employees.add(new Employee(104, "Raj", 55000));

        // Sort using natural ordering (employee id)
        Collections.sort(employees);

        // Print sorted employees
        System.out.println("Employees sorted by ID (Natural Order):");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}

// Employee class implementing Comparable
class Employee implements Comparable<Employee> {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Natural ordering: by employee id
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Employee[ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }
}

/*
Program 14: Comparable Practice
Create Employee class implementing Comparable<Employee>.

Natural sorting should be by employee id.

Create list of employees and sort using:
	Collections.sort(employees);
 */