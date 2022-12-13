package Week07;

import java.util.Arrays;
import java.util.Scanner;

public class Expand {

    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[3];
        for(int i =0; i < 3; i++) {
            nums[i] = scan.nextInt();
        }

        //WRITE YOUR CODE BELOW

        int[] nums2 = new int[nums.length*2];

        for (int i = 0 , j = 0 ; i < nums.length ; i++ , j++) {

            nums2[j] = nums[i];

        }
        System.out.println(Arrays.toString(nums2));


    }
}
