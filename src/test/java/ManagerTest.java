import Staff.Employee;

public class ManagerTest extends Employee {

    String deptName = "DevSquad";

    public ManagerTest(String deptName) {
        super(name, NINumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
