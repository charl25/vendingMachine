package vending;

import vending.product.*;

public class OverloadedVendingMachine {

    private int softDrinkQty;
    private int saltySnacksQty;
    private int chocolatesQty;

    public void buy(SoftDrink softDrink){
        this.softDrinkQty -=1;
    }

    public void buy(SaltySnack saltySnack){
        this.saltySnacksQty -=1;
    }

    public void buy(Chocolate chocolate) {
        this.chocolatesQty -=1;
    }

    public void buy(Product product) {
        this.softDrinkQty -=1;
        this.saltySnacksQty -=1;
        this.chocolatesQty -=1;
    }


    public void addStock(SoftDrink softDrink){
        this.softDrinkQty +=1;
    }

    public void addStock(SaltySnack saltySnack){
        this.saltySnacksQty +=1;
    }

    public void addStock(Chocolate chocolate){
        this.chocolatesQty +=1;
    }

    public void addStock(Product product){
        this.softDrinkQty +=3;
        this.saltySnacksQty +=3;
        this.chocolatesQty +=3;
    }


    public int getStock(SoftDrink softDrink){
        return this.softDrinkQty;
    }

    public int getStock(SaltySnack saltySnack){
        return this.saltySnacksQty;
    }

    public int getStock(Chocolate chocolate){
        return this.chocolatesQty;
    }

    public int getStock(){
        return this.chocolatesQty+this.softDrinkQty+this.saltySnacksQty;
    }



    public OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty){
        this.softDrinkQty = softDrinkQty;
        this.saltySnacksQty = saltySnacksQty;
        this.chocolatesQty = chocolatesQty;
    }

}
