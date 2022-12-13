package Week07;

import java.util.Scanner;

public class NonDublicate {

    public static void main(String[] args) {

        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //WRITE YOUR CODE BELOW:


        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length ; j++) {
                if (nums[i]==nums[j]){
                    count++;
                }
            }
            if (count<2){
                System.out.println(nums[i]);
                break;
            }
        }


    }
}
/*
for (int j = 1; j < nums.length; j++) {

                if (nums[i] != nums[j]){

                }


            }
                System.out.println(nums[i]);

 */