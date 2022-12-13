package Week05;

import java.util.Scanner;

public class Alejandro {

    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner s = new Scanner(System.in);
        String email = s.nextLine();

        //WRITE YOUR CODE BELOW

        String result ;

        if (email.contains("project")){
            result = "priorty";
        } else if (email.contains("Alejandro")){
            result = "read";
        }else {
            result = "don't read";
        }
        System.out.println(result);


    }
}
