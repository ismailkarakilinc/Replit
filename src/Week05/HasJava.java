package Week05;

import java.util.Scanner;

public class HasJava {

    public static void main(String[] args) {

        //DO NOT TOUCH THESE LINE/LINES
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE BELOW:

        boolean hasJava = true;
        if (word.length()>5) {
            if (word.substring(0, 4).equalsIgnoreCase("java")) {
                System.out.println(hasJava);
            } else if (word.substring(1, 5).equalsIgnoreCase("java")) {
                System.out.println(hasJava);
            } else {
                System.out.println(!hasJava);
            }
        }else {
                System.out.println(!hasJava);
            }
        }

    }


