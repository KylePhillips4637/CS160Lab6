/**
 * Coffee
 * The code for a coffee shop menu
 * CS160 - Summer 2022
 * @author Kyle Phillips
 * @literal {kphillips4637@sdsu.edu>}
 */

import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> inventory = new ArrayList<>();
        ArrayList<Double> price = new ArrayList<>();
        ArrayList<String> Temp2 = new ArrayList<>();
        Scanner userFeedback = new Scanner(System.in);

        public static ArrayList<String> CreateOrder() {
            int in = 0;
            while (in != 1) {
                System.out.println("Enter the following values to add toppings: 1.) milk, 2,) hot water, 3.1 espresso, 4.1 sugar, 5.1 whipped cream, e - to complete order");

                switch (userFeedback.nextLine()) {
                    case "1":
                        if (inventory.get(1) != 0) {
                            coffee5 = new Milk(coffee5);
                            inventory[1] = inventory[1] - 1;
                        } else {
                            System.out.println("Out of milk. Try a different topping.");
                        }
                        break;
                    case "2":
                        if (inventory.get(1) != 0) {
                            coffee5 = new Sugar(coffee5);
                            inventory[1] = inventory[1] - 1;
                        } else {
                            System.out.println("Out of Sugar. Try a different topping.");
                        }
                        break;

                    case "3":
                        if (inventory.get(1) != 0) {
                            coffee5 = new WhippedCream(coffee5);
                            inventory[1] = inventory[1] - 1;
                        } else {
                            System.out.println("Out of Whipped Cream. Try a different topping.");
                        }
                        break;

                    case "4":
                        if (inventory.get(1) != 0) {
                            coffee5 = new Milk(coffee5);
                            inventory[1] = inventory[1] - 1;
                        } else {
                            System.out.println("Out of milk. Try a different topping.");
                        }
                        break;

                    case "5":
                        if (inventory.get(1) != 0) {
                            coffee5 = new HotWater(coffee5);
                            inventory[1] = inventory[1] - 1;
                        } else {
                            System.out.println("Out of HotWater. Try a different toppings.");
                        }
                        break;

                    case "e":
                        System.out.println("Order Completed");

                    default:
                        System.out.println("Invalid Input");
                }
            }
        }

        Coffee coffee = new BlackCoffee(new Sugar(new Milk(new BasicCoffee())));


        Coffee coffee2 = new BlackCoffee(new Espresso(new Espresso(new BasicCoffee())));


        Coffee coffee3 = new BlackCoffee(new BasicCoffee());

        PrintOrder(Item, price);

        Coffee basicCoffee = new BlackCoffee(new BasicCoffee());
        Sugar sugar = new Sugar(basicCoffee) ;
        Milk milk = new Milk(basicCoffee);
        WhippedCream whippedCream = new WhippedCream(basicCoffee);
        Espresso espresso = new Espresso(basicCoffee);
        HotWater hotWater = new HotWater(basicCoffee);

        Coffee coffeeOne = new BlackCoffee(new BasicCoffee());
        Coffee[] coffeeOneToppings = {milk};

        ArrayList<String> item = new ArrayList<String> ();
        ArrayList<Double> price = new ArrayList<Double> ();

        Coffee coffee5 = new BlackCoffee(new Espresso(new Sugar(new BasicCoffee())));
        item.add(coffee5.printCoffee());
        price.add(coffee5.cost());
        item.add(coffee5.printCoffee());
        price.add(coffee5.cost());
        item.add(coffee5.printCoffee());
        price.add(coffee5.cost());

        Stack<StringBuilder> coffeeStack = new Stack<>();
        coffeeStack.push(PrintOrder(Item, price));
    }

    public static StringBuilder PrintOrder(ArrayList<String> Item, ArrayList<Double> price) {
        StringBuilder sb = new StringBuilder();
        sb.append("RECEIPT");
        double total = 0;
        for (int i = 1; i <= Item.size(); i++) {
            sb.append(Item.get(i));
            sb.append(price.get(i));
            total = total + price.get(i - 1);
        }
        sb.append("TOTAL COST OF ORDER:" + total);
        return sb;
    }

    FileWriter myWriter = new FileWriter("LogFile.txt" , true);
    SimnpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
    Date date = new Date(System.currentTimeMillis());
    myWriter.write("\n\nWriting orders from stack " + formatter.format(date));


}