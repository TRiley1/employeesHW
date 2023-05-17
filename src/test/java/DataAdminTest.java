import org.junit.Before;
import org.junit.Test;
import techStaff.DataAdmin;

import static org.junit.Assert.assertEquals;

public class DataAdminTest {

    DataAdmin dataAdmin;

    @Before
    public void setup(){
        dataAdmin = new DataAdmin("Blah", "78787878NI", 20000);
    }

    @Test
    public void canPayBonus(){
        assertEquals(100, dataAdmin.payBonus(),100);
    }

    @Test
    public void canRaiseSalary(){
        dataAdmin.raiseSalary(1000);
        assertEquals(21000, dataAdmin.getSalary());
    }
}
