package Week08;

import java.util.Scanner;

public class Next3 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number:");
        int num = inp.nextInt();

        next3(num);
    }

    // DO NOT TOUCH ABOVE:
    public static void next3(int num){

        for (int i = num+1 ; i <= num+3 ; i++) {

            System.out.print(i + " ");
            
        }

}
}
