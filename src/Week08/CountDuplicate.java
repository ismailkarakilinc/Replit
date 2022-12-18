package Week08;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CountDuplicate {

    public static int getDup(String[] arr) {

       String result = "";
       int length = 0;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals(arr[i+1]) && arr.length % 2 ==0){
                length += 2;
            } else if (arr[i].equals(arr[i+1]) && arr.length % 2 !=0) {
                length += 2 - (1);
            }


        }
        return length;





    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));

    }
}
