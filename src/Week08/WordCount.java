package Week08;

import java.util.Scanner;
public class WordCount {


    public static int wordCount(String words) {
        // your code

        String[] word = words.split(" ");

        int count = word.length;
    return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }

}

/*
int count = 1;

        for (int i = 0; i < words.length(); i++) {
            char letter = words.charAt(i);
            if (letter == ' ') {
                count++;
            }
        }

        return count;
 */
