package Week07;

import java.util.Arrays;
import java.util.Scanner;

public class CountEvens {

    public static void main(String[] args) {

        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //WRITE YOUR CODE BELOW:

        //System.out.println(Arrays.toString(nums));

        int result = 0 ;

        for (int each : nums) {

            if (each % 2 == 0 ) {
                result++;
            }

        }
        System.out.println(result);


    }
}
