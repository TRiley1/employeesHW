import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void setup(){
        director = new Director("Pooh", "787787878JK",909090, "BLahah", 0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(18181, director.payBonus(),100);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1000);
        assertEquals(910090, director.getSalary());
    }
}
