package Week05;

import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {

        //DO NOT TOUCH THESE LINE/LINES.
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        //WRITE YOUR CODE BELOW:

        String result ;

        if (word1.length() > word2.length()){
            result = word1;
        }else if (word2.length() > word1.length()){
            result = word2;
        }else {
            result = word1 +"\n"+ word2;
        }
        System.out.println(result);
    }
}
