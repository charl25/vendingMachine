package vending;

import org.junit.jupiter.api.Test;
import vending.product.Product;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OverloadedProductsTest {

    @Test
    public void shouldAddProductsToStock(){
        OverloadedVendingMachine app = new OverloadedVendingMachine(1,5,0);
        Product prod = new Product();

        app.addStock(prod);

        assertEquals(15,app.getStock());

    }

}
