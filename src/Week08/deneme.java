package Week08;

import java.util.Scanner;

public class deneme {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = input.next();

        String result = "";
        char letter1;
        char letter2;
        int num = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            letter1 = str.charAt(i);
            letter2 = str.charAt(i+1);
            if (letter1 == letter2) {
                num++;

                if (num == 0) {
                    result += ""+letter1;
                }
            }
        }
        System.out.println(result);

    }
}
