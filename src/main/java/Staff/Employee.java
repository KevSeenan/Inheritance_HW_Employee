package Staff;

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
        return getSalary() + 3000;
    }

    public double payBonus() {
        return getSalary() / (100) * 1;
    }
}
