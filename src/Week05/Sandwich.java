package Week05;

import java.util.Scanner;

public class Sandwich {

    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        //WRITE YOUR CODE BELOW

        int first = str.indexOf("bread");
        int second = str.lastIndexOf("bread");

        if (str.contains("bread") && str.contains("bread") ){
            System.out.println(str.substring(first+5,second));
        }else {
            System.out.println("nothing");
        }

    }
}
