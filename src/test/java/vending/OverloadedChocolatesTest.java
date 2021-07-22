package vending;

import org.junit.jupiter.api.Test;
import vending.product.Chocolate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OverloadedChocolatesTest {

    @Test
    public void shouldAddChocolatesToStock(){
        OverloadedVendingMachine app = new OverloadedVendingMachine(1,5,0);
        Chocolate choc = new Chocolate();
        app.addStock(choc);
        app.addStock(choc);

        assertEquals(2,app.getStock(choc));
    }

    @Test
    public void shouldAddSpecificNumberOfChocolatesToStock(){
        OverloadedVendingMachine app = new OverloadedVendingMachine(1,5,0);
        Chocolate choc = new Chocolate();
        app.addStock(choc,15);

        assertEquals(15,app.getStock(choc));
    }

    @Test
    public void shouldBeAbletoBuyChocolate(){
        OverloadedVendingMachine app = new OverloadedVendingMachine(1,5,6);
        Chocolate choc = new Chocolate();

        app.buy(choc);

        assertEquals(5,app.getStock(choc));
    }

    @Test
    public void shouldBeAbletoBuySpecificAmountOfChocolate(){
        OverloadedVendingMachine app = new OverloadedVendingMachine(1,5,6);
        Chocolate choc = new Chocolate();

        app.buy(choc,3);

        assertEquals(3,app.getStock(choc));
    }

}
