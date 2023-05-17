import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import techStaff.Dev;

import static org.junit.Assert.assertEquals;

public class DevTest {

    Dev dev;

    @Before
    public void setup(){
        dev = new Dev("Thomas", "345677NI",100000);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1000, dev.payBonus(),100);
    }

    @Test
    public void canRaiseSalary(){
        dev.raiseSalary(1000);
        assertEquals(101000, dev.getSalary());
    }


}
