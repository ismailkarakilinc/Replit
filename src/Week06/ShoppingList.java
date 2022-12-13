package Week06;

import java.util.Scanner;

public class ShoppingList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer = "yes";
        String itemName;
        double price = 0;
        int quantity = 0;
        String result = "";
        int count = 0;
        int totalCost = 0;

        while (answer.equals("yes")) {
            count++;

            System.out.println("Enter the name of item "+count);
            itemName = input.next();

            System.out.println("Enter the price of the " + itemName );
            price = input.nextDouble();

            System.out.println("How many " + itemName + " will you buy?");
            quantity = input.nextInt();

            result += itemName+" x "+quantity+" - $"+(quantity*price + "\n");
            totalCost += quantity*price;
            System.out.println("Do you want to add more items to the shopping list?");
            answer = input.next();

            if (answer.equals("no")) {

                System.out.println("SHOPPING LIST:");
                System.out.println(result);
                System.out.println("Total cost: $"+totalCost);


            }
        }




    }
}
