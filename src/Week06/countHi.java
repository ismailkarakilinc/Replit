package Week06;

import java.util.Scanner;

public class countHi {

    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW
        String hi = "hi" ;

        int result = 0 ;

        for (int i = 0; i < str.length()-1; i++){
            if (str.substring(i,i+2).equals(hi)){
                result++;
            }

        }
        System.out.println(result);

    }
}
