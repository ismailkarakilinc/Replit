package Week05;

import java.util.Scanner;

public class PrefixAgain {

    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        //WRITE YOUR CODE BELOW

        boolean result = true;

        /*
        char first = str.charAt(0);
        char second = str.charAt(1);
         */




        if(n == 1 && (str.substring(1).contains(str.substring(0,1)))){
            System.out.println(result);
        } else{
            System.out.println(!result);
        }
        if (n==2 && (str.substring(2).contains(str.substring(0,2)))){
            System.out.println(result);
        } else {
            System.out.println(!result);
        }
        if (n==3 && str.substring(3).contains(str.substring(0,3))){
            System.out.println(result);
        }else {
            System.out.println(!result);
        }

    }
}
