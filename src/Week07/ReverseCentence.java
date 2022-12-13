package Week07;

import java.util.Scanner;

public class ReverseCentence {

    public static void main(String[] args) {

        // DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        // TYPE YOUR CODE BELOW:

        String[] words = sentence.split(" ");

        String reversed = "";

        for (int i = words.length-1; i >= 0 ; i--){
            reversed += words[i] + " ";
        }
        System.out.println(reversed.substring(0,reversed.length()-1));

    }
}
