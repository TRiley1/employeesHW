import org.junit.Before;
import org.junit.Test;
import management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setup(){
        manager = new Manager("Bob","113223NI", 10000, "Finance");
    }

    @Test
    public void canPayBonus(){
        assertEquals(100, manager.payBonus(),100);
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1000);
        assertEquals(11000, manager.getSalary());
    }

    @Test
    public void cantRaiseWithNegativeValue(){
        manager.raiseSalary(-1000);
        assertEquals(10000,manager.getSalary());
    }

    @Test
    public void canChangeName(){
        manager.changeName("Toto");
        assertEquals("Toto", manager.getName());
    }

    @Test
    public void canRejectNull(){
        manager.changeName(null);
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void canRejectEmptyStr(){
        manager.changeName("");
        assertEquals("Bob", manager.getName());
    }

}
