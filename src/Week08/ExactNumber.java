package Week08;

import java.util.Scanner;

public class ExactNumber {

    public static String extractNum(String s) {

        char character ;
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            character =  s.charAt(i);
            boolean isDigit = Character.isDigit(character);

            if (isDigit){
                result += ""+character;
            }
        }
        return result;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(extractNum(in.next()));
    }
}
