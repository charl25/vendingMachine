package vending;

import org.junit.jupiter.api.Test;
import vending.product.SaltySnack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OverloadedSaltySnacksTest {

    @Test
    public void shouldAddSaltySnacksToStock(){
        OverloadedVendingMachine app = new OverloadedVendingMachine(1,5,0);
        SaltySnack snack = new SaltySnack();
        app.addStock(snack);
        app.addStock(snack);

        assertEquals(7,app.getStock(snack));
    }

    @Test
    public void shouldAddSpecificNumberOfSaltySnacksToStock(){
        OverloadedVendingMachine app = new OverloadedVendingMachine(1,5,0);
        SaltySnack snack = new SaltySnack();
        app.addStock(snack,15);

        assertEquals(20,app.getStock(snack));
    }

    @Test
    public void shouldBeAbletoBuySaltySnacks(){
        OverloadedVendingMachine app = new OverloadedVendingMachine(1,5,6);
        SaltySnack snack = new SaltySnack();

        app.buy(snack);

        assertEquals(4,app.getStock(snack));
    }

    @Test
    public void shouldBeAbletoBuySpecificAmountOfSaltySnacks(){
        OverloadedVendingMachine app = new OverloadedVendingMachine(1,5,6);
        SaltySnack snack = new SaltySnack();

        app.buy(snack,3);

        assertEquals(2,app.getStock(snack));
    }

}
