public class P5_ConstructorOverloading {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Rahul");
        Employee e2 = new Employee(1,"Akash", 50000);

        e1.showSalary();
        e2.showSalary();
    }
}

class Employee{
    private int id;
    private String name;
    private double salary = 15000; // default salary if not provided in constructor

    // constructor to call employee without salary hence will get 15000 default
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // constructor to call employee with provided salary
    Employee(int id, String name, double salary) {
        this(id,name); // calling already create constructor with two params
        this.salary = salary;
    }

    // public method to print name n salary
    void showSalary(){
        System.out.println("Employee is " + this.name + " and got salary: " + this.salary);
    }
}


