package Week06;

import java.util.Scanner;

public class Vowels {

    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        //WRITE YOUR CODE BELOW

        String a = "a";
        String e = "e";
        String i = "i";
        String o = "o";
        String u = "u";



        for (int j = 0 ; j < word.length() ; j++){
            String result = word.substring(j,j+1);
            if (result.equals(a) || result.equals(e) || result.equals(i)
             || result.equals(o) || result.equals(u)){
                System.out.print(result);
            }
        }
    }
}
