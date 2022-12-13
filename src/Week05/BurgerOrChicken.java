package Week05;

import java.util.Scanner;

public class BurgerOrChicken {

    public static void main(String[] args) {

        //DO NOT TOUCH THESE LINE/LINES.
        Scanner s = new Scanner(System.in);
        String order = s.next();

        //WRITE YOUR CODE BELOW THIS LINE:

        double burger = 12.50;
        double chicken = 9.75;

        if (order.equalsIgnoreCase("burger")){
            System.out.println("Your total is $" + burger);
        }else if (order.equalsIgnoreCase("chicken")){
            System.out.println("Your total is $" + chicken);
        }else {
            System.out.println("Invalid entry.");
        }


    }
}
