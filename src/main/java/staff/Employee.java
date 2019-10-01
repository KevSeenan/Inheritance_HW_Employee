package staff;

public abstract class Employee {

    String name;
    String NINumber;
    double salary;

    public Employee(String name, String NINumber, double salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNINumber() {
        return NINumber;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary() {
        if(salary > 0) {
        }
        return getSalary() + 3000.00;
    }

    public double payBonus() {
        return getSalary() + (getSalary() * 0.01);
    }
}
