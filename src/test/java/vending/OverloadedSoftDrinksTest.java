package vending;

import org.junit.jupiter.api.Test;
import vending.product.SoftDrink;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OverloadedSoftDrinksTest {

    @Test
    public void shouldAddSoftDrinksToStock(){
        OverloadedVendingMachine app = new OverloadedVendingMachine(1,5,0);
        SoftDrink drinks = new SoftDrink();
        app.addStock(drinks);
        app.addStock(drinks);

        assertEquals(3,app.getStock(drinks));
    }

    @Test
    public void shouldAddSpecificNumberOfSoftDrinksToStock(){
        OverloadedVendingMachine app = new OverloadedVendingMachine(1,5,0);
        SoftDrink drinks = new SoftDrink();
        app.addStock(drinks,15);

        assertEquals(16,app.getStock(drinks));
    }

    @Test
    public void shouldBeAbletoBuySoftDrinks(){
        OverloadedVendingMachine app = new OverloadedVendingMachine(1,5,6);
        SoftDrink drinks = new SoftDrink();

        app.buy(drinks);

        assertEquals(0,app.getStock(drinks));
    }

    @Test
    public void shouldBeAbletoBuySpecificAmountOfSoftDrinks(){
        OverloadedVendingMachine app = new OverloadedVendingMachine(1,5,6);
        SoftDrink drinks = new SoftDrink();

        app.buy(drinks,3);

        assertEquals(0,app.getStock(drinks));
    }
    

}
