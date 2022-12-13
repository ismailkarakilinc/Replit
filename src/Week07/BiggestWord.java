package Week07;

import java.util.Arrays;
import java.util.Scanner;

public class BiggestWord {

    public static void main(String[] args) {

        //DO NOT TOUCH BELOW
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = input.nextLine();
        }
        //WRITE YOUR CODE BELOW

        String str = "";
        for (String each : words) {
            if (each.length()>str.length()){
                str = each;
            }
        }
        System.out.println(str);

    }
}