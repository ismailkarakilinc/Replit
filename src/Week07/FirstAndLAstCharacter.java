package Week07;

import java.util.Scanner;

public class FirstAndLAstCharacter {

    public static void main(String[] args) {

        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        //WRITE YOUR CODE BELOW:

        for (String each : words) {
            char[] ch = each.toCharArray();
            System.out.println(""+ ch[0] +ch[ch.length-1]);
        }

    }
}
