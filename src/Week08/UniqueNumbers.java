package Week08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UniqueNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array!!!");
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }

            }

        
    

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE

        String result = "";

        for (int i = 0; i < nums.length; i++) {
            if (!(result.contains(""+nums[i])));
            result += "" + nums[i];

        }
        System.out.println(result);

        }

        }




