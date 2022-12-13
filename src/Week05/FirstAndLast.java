package Week05;

import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {

        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        char first = word.charAt(0);
        char last = word.charAt(word.length()-1);

        System.out.println("first letter: " + first);
        System.out.println("last letter: " + last);

    }
}
