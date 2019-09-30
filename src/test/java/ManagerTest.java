import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest{

    Manager manager;

    @Before
    public void before() {
        manager = new Manager ("Cherry Longbottom", "JH12345 B", 45000.00, "DevSquad");
    }

    @Test
    public void canGetManagerName() {
        assertEquals("Cherry Longbottom", manager.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("JH12345 B", manager.getNINumber());
    }


    @Test
    public void canGetSalary() {
        assertEquals(45000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("DevSquad", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(48000.00, manager.raiseSalary(), 0.01);
    }

    @Test
    public void canPayABonus() {
        assertEquals(45450.00, manager.payBonus(), 0.01);
    }

}
