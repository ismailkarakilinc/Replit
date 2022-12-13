package Week05;

import java.util.Scanner;

public class caseSensitivity {

    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner s = new Scanner(System.in);
        String word = s.next();

        //WRITE YOUR CODE BELOW

        String upper = word.toUpperCase();
        String lower = word.toLowerCase();

        System.out.println(word);
        System.out.println(upper);
        System.out.println(lower);



    }
}
