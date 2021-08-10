package vending;

import org.junit.jupiter.api.Test;
import vending.product.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtendableTest {

    @Test
    public void shouldBuyChocolatesToStock(){
        ExtendableVendingMachine app = new ExtendableVendingMachine(5,5,5,5);
        Chocolate choc = new Chocolate();
        app.buy(choc);
        app.buy(choc);

        assertEquals(3,app.getStock(choc));
        assertEquals(18,app.getStock(new Product()));
    }

    @Test
    public void ShouldBuyspecifiedChocolatesAndAddSpecifiedDrinks(){
        ExtendableVendingMachine app = new ExtendableVendingMachine(5,5,5,5);
        Chocolate choc = new Chocolate();
        SoftDrink drink = new SoftDrink();
        app.buy(choc,4);
        app.add(drink,5);

        assertEquals(1,app.getStock(choc));
        assertEquals(10,app.getStock(drink));
        assertEquals(21,app.getStock(new Product()));

    }

    @Test
    public void ShouldBuySourSweets(){
        ExtendableVendingMachine app = new ExtendableVendingMachine(5,5,5,5);
        SourSweet sweet = new SourSweet();
        app.buy(sweet);

        assertEquals(4,app.getStock(sweet));
        assertEquals(19,app.getStock(new Product()));
    }

}
