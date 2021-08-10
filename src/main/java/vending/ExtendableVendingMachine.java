package vending;

import vending.product.*;

public class ExtendableVendingMachine {

    private int softDrinkQty;
    private int saltySnacksQty;
    private int chocolatesQty;
    private int sourSweetsQty; //for the quantity of the new product class

    public String typeCheck(Product product){
        String prod = "";

        if(product instanceof Chocolate){
            prod = "choc";
        }if(product instanceof SoftDrink){
            prod ="drink";
        }if(product instanceof SaltySnack){
            prod = "salty";
        }if(product instanceof Product){
            prod = "prod";
        }if (product instanceof SourSweet){
            prod ="sour";
        }
        return prod;
    }

    public void qtyCheck(){
        if(this.softDrinkQty<0){
            this.softDrinkQty = 0;
        }
        if(this.chocolatesQty<0){
            this.chocolatesQty = 0;
        }
        if(this.saltySnacksQty<0){
            this.saltySnacksQty = 0;
        }
        if(this.sourSweetsQty<0){
            this.sourSweetsQty =0;
        }
    }

    public void buy(Product product){

        String prod = typeCheck(product);

        switch (prod){
            case "choc":
                this.chocolatesQty -= 1;
                break;
            case "salty":
                this.saltySnacksQty -=1;
                break;
            case "drink":
                this.softDrinkQty -=1;
                break;
            case "sour":
                this.sourSweetsQty -=1;
                break;
        }

    }

    public void buy(Product product, int amount){

        String prod = typeCheck(product);

        switch (prod){
            case "choc":
                this.chocolatesQty -= amount;
                break;
            case "salty":
                this.saltySnacksQty -=amount;
                break;
            case "drink":
                this.softDrinkQty -=amount;
                break;
            case "sour":
                this.sourSweetsQty-=amount;
                break;
        }

    }


    public void add(Product product){

        String prod = typeCheck(product);

        switch (prod){
            case "choc":
                this.chocolatesQty +=3;
                break;
            case "salty":
                this.saltySnacksQty +=3;
                break;
            case "drink":
                this.softDrinkQty +=3;
                break;
            case "sour":
                this.sourSweetsQty+=3;
                break;
        }

    }

    public void add(Product product, int amount){

        String prod = typeCheck(product);

        switch (prod){
            case "choc":
                this.chocolatesQty +=amount;
                break;
            case "salty":
                this.saltySnacksQty +=amount;
                break;
            case "drink":
                this.softDrinkQty +=amount;
                break;
            case "sour":
                this.sourSweetsQty+=amount;
                break;
        }

    }


    public int getStock(Product product){

        String prod = typeCheck(product);
        qtyCheck();
        int stock = 0;

        switch (prod){
            case "choc":
                stock = this.chocolatesQty;
                break;
            case "salty":
                stock = this.saltySnacksQty;
                break;
            case "drink":
                stock = this.softDrinkQty;
                break;
            case "prod":
                stock = this.chocolatesQty+this.softDrinkQty+this.saltySnacksQty+this.sourSweetsQty;
                break;
            case "sour":
                stock = this.sourSweetsQty;
        }

        return stock;
    }

    public ExtendableVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty, int sourSweetQty){
        this.softDrinkQty = softDrinkQty;
        this.saltySnacksQty = saltySnacksQty;
        this.chocolatesQty = chocolatesQty;
        this.sourSweetsQty = sourSweetQty;
    }

}
