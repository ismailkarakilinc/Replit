package Week05;

import java.util.Scanner;

public class VerifyEquals {

    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner s = new Scanner(System.in);
        String word1 = s.next();
        String word2 = s.next();

        //WRITE YOUR CODE BELOW

        boolean tru = true;
        boolean flse = false;

        if (word1.equals(word2)){
            System.out.println(true);
        }else {
            System.out.println(flse);
        }
    }
}
