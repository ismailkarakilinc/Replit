package Week06;

import java.util.Scanner;

public class ZombieAttack {

    public static void main(String[] args) {

        //DO NOT TOUCH THESE LINES:
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        //WRITE YOUR CODE HERE:

        int result = inhabitants ;

        if (result==0){
            System.out.println("---- EXTINCT ----");

        }

        for (int i = 0 ; i <=inhabitants/2 ; i++){

            System.out.println( "Day " + i + " [" + result + "]");
            result = result/2;
            if (result==0){
                break;
            }
        }
        System.out.println("----EXTINCT----");
    }
}
