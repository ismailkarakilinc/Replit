package Week05;

import java.util.Scanner;

public class Without_X {

    public static void main(String[] args) {

        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE HERE

        String x = "x";
        String X = "X";
        String result ;

        if((word.startsWith(x) || word.startsWith(X)) && (word.endsWith(x) || word.endsWith(X))){
            result =  word.substring(1,word.length()-1); ;
        } else if (word.endsWith(x) || word.endsWith(X)){
            result = word.substring(0,word.length()-1);
        } else if (word.startsWith(x) || word.startsWith(X)  ){
            result = word.substring(1);
        } else {
            result = word;
        }
        System.out.println( result);
    }
}
