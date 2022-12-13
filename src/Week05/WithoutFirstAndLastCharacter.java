package Week05;

import java.util.Scanner;

public class WithoutFirstAndLastCharacter {

    public static void main(String[] args) {

        //DO NOT TOUCH THIS PART
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE HERE

        String withoutFirst = word.substring(1);
        String withoutLast = word.substring(0,word.length()-1);

        System.out.println("without first letter: " + withoutFirst);
        System.out.println("without last letter: " + withoutLast);

    }
}
