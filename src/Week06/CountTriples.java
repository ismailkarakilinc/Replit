package Week06;

import java.util.Scanner;

public class CountTriples {

    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        //WRITE YOUR CODE BELOW

        int result = 0;

        for (int i = 0; i < str.length()-2; i++) {
            String letter = ""+str.charAt(i);
            if((letter.equals(str.substring(i+1,i+2))) && (letter.equals(str.substring(i+2,i+3)))){
                result++;
            }

        }
        System.out.println(result);

    }
}
//if (str.substring(i,i+1) == ""+str.charAt(i+1) && str.substring(i,i+1) == ""+str.charAt(i+2)){
//                result++;
