package vending;

import vending.product.*;

import java.util.Scanner;

public class Main {

//   public static void main(String[] args) {
//        OverloadedVendingMachine app = new OverloadedVendingMachine(10,15,30);
//        Product prod = new Product();
//        Chocolate choc = new Chocolate();
//        SaltySnack snack = new SaltySnack();
//        SoftDrink drink = new SoftDrink();
//
//        System.out.println(app.getStock(choc));
//        System.out.println(choc.description());
//        app.addStock(choc);
//
//        System.out.println(app.getStock(choc));
//
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the amount of initial stock in the following order, SoftDrinks SaltySnack and Chocolate");
        String initialStock = sc.nextLine();
        String[] stock = initialStock.split(" ");

        int drinkStock = Integer.parseInt(stock[0]);
        int snackStock = Integer.parseInt(stock[1]);
        int chocStock = Integer.parseInt(stock[2]);

        OverloadedVendingMachine app = new OverloadedVendingMachine(drinkStock, snackStock, chocStock);

        boolean exit = true;

        while (exit) {
            System.out.println("Type help for menu or type the required action");
            String selection = sc.nextLine();
            String[] action = selection.split(" ");

            switch (action[0]) {
                case "help":
                    app.help();
                    break;

                case "buy":
                    switch (action[1]) {
                        case "drinks":
                            SoftDrink drink = new SoftDrink();
                            if (action.length > 2) {
                                int amount = Integer.parseInt(action[2]);
                                app.buy(drink, amount);
                            } else {
                                app.buy(drink);
                            }
                            break;
                        case "snacks":
                            SaltySnack snack = new SaltySnack();
                            if (action.length > 2) {
                                int amount = Integer.parseInt(action[2]);
                                app.buy(snack, amount);
                            } else {
                                app.buy(snack);
                            }
                            break;
                        case "chocolates":
                            Chocolate chocolate = new Chocolate();
                            if (action.length > 2) {
                                int amount = Integer.parseInt(action[2]);
                                app.buy(chocolate, amount);
                            } else {
                                app.buy(chocolate);
                            }
                            break;
                        case "products":
                            Product product = new Product();
                            app.buy(product);
                            break;
                    }
                    break;

                case "add":
                    switch (action[1]) {
                        case "drinks":
                            SoftDrink drink = new SoftDrink();
                            if (action.length > 2) {
                                int amount = Integer.parseInt(action[2]);
                                app.addStock(drink, amount);
                            } else {
                                app.addStock(drink);
                            }
                            break;
                        case "snacks":
                            SaltySnack snack = new SaltySnack();
                            if (action.length > 2) {
                                int amount = Integer.parseInt(action[2]);
                                app.addStock(snack, amount);
                            } else {
                                app.addStock(snack);
                            }
                            break;
                        case "chocolates":
                            Chocolate chocolate = new Chocolate();
                            if (action.length > 2) {
                                int amount = Integer.parseInt(action[2]);
                                app.addStock(chocolate, amount);
                            } else {
                                app.addStock(chocolate);
                            }
                            break;
                        case "products":
                            Product product = new Product();
                            app.addStock(product);
                            break;
                    }
                    break;

                case "stock":
                    if (action.length > 1) {
                        switch (action[1]) {
                            case "drinks":
                                SoftDrink drink = new SoftDrink();
                                System.out.println(app.getStock(drink));
                                break;
                            case "snacks":
                                SaltySnack snack = new SaltySnack();
                                System.out.println(app.getStock(snack));
                                break;
                            case "chocolates":
                                Chocolate chocolate = new Chocolate();
                                System.out.println(app.getStock(chocolate));
                                break;
                        }
                    } else {
                        System.out.println(app.getStock());
                    }
                    break;

                case "exit":
                    exit = false;
                    break;

                default:
                    System.out.println("WRONG ACTION");
                    break;
            }

        }

    }

}

