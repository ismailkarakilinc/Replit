package Week05;

import java.util.Scanner;

public class VerifyContains {

    public static void main(String[] args) {
        //Do NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();

        //WRITE YOUR CODE BELOW

        boolean a = true;


        if (sentence.contains(word)){
            System.out.println(a);
        }else {
            System.out.println(!a);
        }

    }
}
