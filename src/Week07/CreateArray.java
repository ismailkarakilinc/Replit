package Week07;

import java.util.Scanner;

public class CreateArray {

    public static void main(String[] args) {

        int[] arr = new int[3];

        arr[0] = 34;
        arr[1] = 59;
        arr[2] = 19;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 34){
                System.out.println("First element: " + arr[i]);
            } else if (arr[i] == 59){
                System.out.println("Middle element: " + arr[i]);
            }else {
                System.out.println("Last element: " + arr[i]);
            }



        }

    }
}
