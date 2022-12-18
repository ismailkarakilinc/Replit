package Week08;

import java.util.Arrays;
import java.util.Scanner;

public class PopulateArray {

    public static void main(String[] args) {
        //DO NOT TOUCH THE FOLLOWING LINES
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        populate(n);
    }
    //CREATE YOUR METHOD

    public static void populate(int n){

        int[] output = new int[n];

        for (int i = 0; i < n ; i++) {
            output[i] = i+1;
        }
        System.out.println(Arrays.toString(output));
    }



}
