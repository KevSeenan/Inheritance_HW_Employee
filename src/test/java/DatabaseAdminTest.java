import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Ponder Stibbons", "JH23456 C", 33000.00);
    }

    @Test
    public void canGetDatabaseAdminName() {
        assertEquals("Ponder Stibbons", databaseAdmin.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("JH23456 C", databaseAdmin.getNINumber());
    }


    @Test
    public void canGetSalary() {
        assertEquals(33000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(36000.00, databaseAdmin.raiseSalary(), 0.01);
    }

    @Test
    public void canPayABonus() {
        assertEquals(33330.00, databaseAdmin.payBonus(), 0.01);
    }
}
