package Week05;

import java.util.Scanner;

public class MiddleCharacters {

    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE BELOW

        int count = word.length();
        int middle = count / 2;
        char letter = word.charAt(middle-1);
        char letter1 = word.charAt(middle);
        String result = "";

        if (count % 2 == 0 ){
            System.out.println(result+letter+letter1);
        }else {
            System.out.println(result+letter1);
        }

    }
}
