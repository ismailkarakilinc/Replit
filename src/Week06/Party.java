package Week06;

import java.util.Scanner;

public class Party {

    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner input = new Scanner(System.in);

        //WRITE YOUR CODE BELOW

        String answer = "yes";

        String result = "";

        while (answer.equalsIgnoreCase("yes")) {


            System.out.println("Please enter the guest's name:");
            String name = input.next();
            System.out.println("Do you want to enter another guest's name?");
            answer = input.next().toLowerCase();
            result += name + ", ";
            result = result.substring(0,result.length()-1);

            if (answer.equalsIgnoreCase("no")){
                System.out.println("Guests' list: " + result);
            }



        }
    }
}
