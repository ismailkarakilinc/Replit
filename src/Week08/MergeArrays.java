package Week08;

import java.util.Scanner;
import java.util.Arrays;
public class MergeArrays {

    public static int[] merge(int[] a,int[] b) {

    int[] c = new int[a.length + b.length];

    int x = 0 ; // For third array's index number

        for (int i = 0; i < a.length; i++, x++) {
            c[x] = a[i];
        }
        for (int i = 0; i < b.length; i++, x++) {
            c[x] = b[i];
        }

        return c;







    }//end merge

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int[in.nextInt()];
        int [] nums2 = new int[in.nextInt()];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(merge(nums, nums2)));
    }
}

