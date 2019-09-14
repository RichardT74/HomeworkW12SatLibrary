import items.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ViolinTest {

    Violin violin;

    @Before
    public void before() { violin = new Violin("Ocean 1", "beach", "violin", "FSharp", 50 ); }

    @Test
    public void canGetName() {
    assertEquals("Ocean 1", violin.getName()); }



    @Test
    public void canGetSound() {
        assertEquals("FSharp", violin.getSound()); }

    @Test
    public void canGetBuyPrice() { assertEquals(50, violin.GetBuyPrice(), 0.1); }

    @Test
    public void canGetSellPrice() { assertEquals(175, violin.GetSellPrice(),0.1);}

    @Test
    public void canGetMarkUp() { assertEquals(125, violin.GetMarkUp(), 0.1);}

}






