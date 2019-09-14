import items.Piano;
import items.Violin;
import behaviours.ISell;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class ShopTest {

    Violin violin;
    Shop shop;
    Piano piano;



    @Before
    public void setUp() {
        shop = new Shop();
        violin = new Violin("Ocean 1", "beach", "violin", "FSharp", 100);
        piano = new Piano("Keys 1", "black", "piano", "GFlat", 400);
    }


    @Test
    public void canAddItem() {
        shop.addItem(violin);
        assertEquals(1, shop.getItemCount());
    }

    @Test
    public void canRemoveItem() {
     shop.addItem(piano);
     shop.removeItem(piano);
    assertEquals(0, shop.getItemCount());}
}


// new test note for save
