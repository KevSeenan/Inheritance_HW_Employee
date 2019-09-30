package Staff;

public class Manager extends Employee {

    String deptName;

    public Manager(String name, String NINumber, double salary, String deptName) {
        super(name, NINumber, salary);
        this.deptName = deptName;
    }


    public String getDeptName() {
        return deptName;
    }
}
