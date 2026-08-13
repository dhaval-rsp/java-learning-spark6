class EmployeeBonus{
    String name;
    double salary;

    void addBonus(double percentage){
        double salary=100;
        this.salary += ((this.salary*percentage)/100);
    }
}

public class C2_SalaryUpdate {
    public static void main(String[] args) {
        EmployeeBonus e1 = new EmployeeBonus();

        e1.name = "Ruturaj";
        e1.salary = 10000;

        System.out.println(e1.name + " 's original salary was: " + e1.salary);
        e1.addBonus(25);
        System.out.println(e1.name + " 's salary after bonus: " + e1.salary);
    }
}
