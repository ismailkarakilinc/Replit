package Week05;

import java.util.Scanner;

public class Artyom {

    public static void main(String[] args) {

        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.println(word.startsWith("java") || word.substring(1).startsWith("java"));
    }
}
