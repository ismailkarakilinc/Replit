package Week07;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINES:
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++){
            arr[i] = input.nextLine();
        }

        String[] arr1 = new String[arr.length];

        for (int i = arr.length-1 , j = 0 ; i >= 0 ; i-- , j++) {

            arr1[j] = arr[i];

        }
        System.out.println(Arrays.toString(arr1));

        //WRITE YOUR CODES BELOW:


    }
}
