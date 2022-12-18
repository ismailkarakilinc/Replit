package Week08;

import java.util.Scanner;

public class IsEven {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isEven(in.nextInt()));
    }

    public static boolean isEven(int num){
        //WRITE YOUR METHOD

        boolean result = true;

        if (num%2==0){
            result = true;
        }else {
            result = false;
        }
        return result;



    }
}
