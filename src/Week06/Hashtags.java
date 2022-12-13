package Week06;

import java.util.Scanner;

public class Hashtags {

    public static void main(String[] args) {

        //DO NOT TOUCH BELOW:
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //WRITE YOUR CODE HERE

        String result = "";
        char hashtag = '#';

        for (int i = 0 ; i < n ; i++){
            result += hashtag;

        }
        System.out.println(result);

    }
}
