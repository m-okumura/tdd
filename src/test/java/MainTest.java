import org.junit.Test;

import static org.junit.Assert.*;



public class MainTest {
    @Test
    public void fizzbuzz() throws Exception {
        assertEquals("fizzbuzz", Main.fizzbuzz(15,""));
    }

    @Test
    public void fizz() throws Exception {
        assertEquals("fizz", Main.fizzbuzz(3,""));
    }


}