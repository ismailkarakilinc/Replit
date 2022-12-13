package Week05;

import java.util.Scanner;

public class Email {

    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        //WRITE YOUR CODE BELOW
        int underscore = email.indexOf('_');
        int at = email.indexOf('@');
        int dot = email.indexOf('.');
        String firstName = email.substring(0,1).toUpperCase() + email.substring(1,underscore).toLowerCase() ;
        String lastName = email.substring(underscore+1,at);
        String domain = email.substring(at+1,dot);

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName.substring(0,1).toUpperCase()+lastName.substring(1).
                toLowerCase());
        System.out.println("Domain: " + domain.substring(0,1).toUpperCase()+domain.substring(1).toLowerCase());




    }
}
