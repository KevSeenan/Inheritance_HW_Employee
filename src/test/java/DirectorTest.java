import management.Director;
import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director ("Havelock Vetinari", "JH35795 B", 65000.00, "Development", 100000.00);
    }

    @Test
    public void canGetDirectorName() {
        assertEquals("Havelock Vetinari", director.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("JH35795 B", director.getNINumber());
    }


    @Test
    public void canGetSalary() {
        assertEquals(65000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(68000.00, director.raiseSalary(), 0.01);
    }

    @Test
    public void canPayABonus() {
        assertEquals(65650.00, director.payBonus(), 0.01);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Development", director.getDeptName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(100000.00, director.getBudget(), 0.01);
    }
}
