package Staff;

public abstract class Employee {

    String name;
    int NINumber;
    double salary;

    public String getName() {
        return name;
    }

    public int getNINumber() {
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
