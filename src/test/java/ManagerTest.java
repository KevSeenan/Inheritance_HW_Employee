import Staff.Manager;
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
}
