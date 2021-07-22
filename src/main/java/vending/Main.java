package vending;

import vending.product.*;

public class Main {

    public static void main(String[] args) {
        OverloadedVendingMachine app = new OverloadedVendingMachine(10,15,30);
        Product prod = new Product();
        Chocolate choc = new Chocolate();
        SaltySnack snack = new SaltySnack();
        SoftDrink drink = new SoftDrink();

        System.out.println(app.getStock(choc));
        System.out.println(choc.description());
        app.addStock(choc);

        System.out.println(app.getStock(choc));

    }

}
