package vending;

import vending.product.*;

public class OverloadedVendingMachine {

    private int softDrinkQty;
    private int saltySnacksQty;
    private int chocolatesQty;

    public void buy(SoftDrink softDrink){
        this.softDrinkQty -=1;
    }
    public void buy(SoftDrink softDrink,int amount){
        this.softDrinkQty -=amount;
    }

    public void buy(SaltySnack saltySnack){
        this.saltySnacksQty -=1;
    }
    public void buy(SaltySnack saltySnack,int amount){
        this.saltySnacksQty -=amount;
    }

    public void buy(Chocolate chocolate) {
        this.chocolatesQty -=1;
    }
    public void buy(Chocolate chocolate, int amount) {
        this.chocolatesQty -=amount;
    }

    public void buy(Product product) {
        this.softDrinkQty -=1;
        this.saltySnacksQty -=1;
        this.chocolatesQty -=1;
    }


    public void addStock(SoftDrink softDrink){
        this.softDrinkQty +=1;
    }
    public void addStock(SoftDrink softDrink, int amount){
        this.softDrinkQty +=amount;
    }

    public void addStock(SaltySnack saltySnack){
        this.saltySnacksQty +=1;
    }
    public void addStock(SaltySnack saltySnack,int amount){
        this.saltySnacksQty +=amount;
    }

    public void addStock(Chocolate chocolate){
        this.chocolatesQty +=1;
    }
    public void addStock(Chocolate chocolate, int amount){
        this.chocolatesQty +=amount;
    }

    public void addStock(Product product){
        this.softDrinkQty +=3;
        this.saltySnacksQty +=3;
        this.chocolatesQty +=3;
    }


    public int getStock(SoftDrink softDrink){
        if(this.softDrinkQty<0){
            this.softDrinkQty = 0;
        }
        return this.softDrinkQty;
    }

    public int getStock(SaltySnack saltySnack){
        if(this.saltySnacksQty<0){
            this.saltySnacksQty = 0;
        }
        return this.saltySnacksQty;
    }

    public int getStock(Chocolate chocolate){
        if(this.chocolatesQty<0){
            this.chocolatesQty = 0;
        }
        return this.chocolatesQty;
    }

    public int getStock(){
        if(this.softDrinkQty<0){
            this.softDrinkQty = 0;
        }
        if(this.chocolatesQty<0){
            this.chocolatesQty = 0;
        }
        if(this.saltySnacksQty<0){
            this.saltySnacksQty = 0;
        }
        int stock = this.chocolatesQty+this.softDrinkQty+this.saltySnacksQty;
        return stock;
    }



    public OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty){
        this.softDrinkQty = softDrinkQty;
        this.saltySnacksQty = saltySnacksQty;
        this.chocolatesQty = chocolatesQty;
    }

}
