import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Rincewind", "JH54321 A", 35000.00);
    }

    @Test
    public void canGetDeveloperName() {
        assertEquals("Rincewind", developer.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("JH54321 A", developer.getNINumber());
    }


    @Test
    public void canGetSalary() {
        assertEquals(35000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(38000.00, developer.raiseSalary(), 0.01);
    }

    @Test
    public void canPayABonus() {
        assertEquals(35350.00, developer.payBonus(), 0.01);
    }
}
