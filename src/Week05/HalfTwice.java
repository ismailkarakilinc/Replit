package Week05;

import java.util.Scanner;

public class HalfTwice {

    public static void main(String[] args) {

        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE HERE

        int length = word.length();

        int half = length / 2;

        String result = word.substring(0,half);

        System.out.println(result + result);

    }
}
