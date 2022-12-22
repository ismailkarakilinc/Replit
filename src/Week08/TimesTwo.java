package Week08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TimesTwo {

    public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums){

        int index = 0;
        for (int each : nums) {
            nums.set(index, each*2);
            index++;
        }
        return nums;
    }


    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(timesTwo(list));

    }
}
