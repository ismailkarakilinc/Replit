package Week07;

import java.util.Scanner;

public class FindMax {

    public static void main(String[] args) {

        // DO NOT TOUCH BELOW
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //WRITE YOUR CODE BELOW

        int[] nums2 = new int[1];

        nums2[0] = nums[0];

        for (int each : nums) {
            if (each > nums2[0]){
                nums2[0] = each;
            }

        }
        System.out.println(nums2[0]);

    }
}
