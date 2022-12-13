package Week05;

import java.util.Scanner;

public class BadWord {

    public static void main(String[] args) {

        //DO NOT TOUCH THIS PART
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        //WRITE YOUR CODE HERE

        word = word.replace("dumb","cool");

        System.out.println(word);

    }
}
